/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.basereport.service;

import com.lowagie.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import javax.ws.rs.ext.Provider;
import mx.gob.imss.dpes.common.exception.BusinessException;
import mx.gob.imss.dpes.common.exception.RecursoNoExistenteException;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.Message;
import mx.gob.imss.dpes.common.model.ServiceStatusEnum;
import mx.gob.imss.dpes.common.model.Reporte;
import mx.gob.imss.dpes.common.service.ServiceDefinition;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author antonio
 */
@Provider
public class ReporteService extends ServiceDefinition<Reporte<? extends BaseModel>, Reporte<? extends BaseModel>> {
  


  @Override
  public Message<Reporte<? extends BaseModel>> execute(
          Message<Reporte<? extends BaseModel> > request) throws BusinessException {
    
    byte[] pdf;
    Reporte<? extends BaseModel> reporte = request.getPayload();    
    Map<String, Object> parametros = new HashMap<>();
    parametros.put(JRParameter.REPORT_LOCALE, new Locale("es", "MX"));  
    parametros.put("IMAGE_DIR", new ClassPathResource("/images/").getPath() );        
    parametros.put("SUBREPORT_DIR", new ClassPathResource("/reports/subReportes/").getPath());
    try {
      JRPdfExporter exporter = new JRPdfExporter();
      JasperReport report = (JasperReport) JRLoader.loadObject(new ClassPathResource( reporte.getRuta() ).getInputStream());                  
      JasperPrint print = JasperFillManager.fillReport(report, parametros , new JRBeanArrayDataSource( reporte.getBeans().toArray() ) );
      
      if( reporte.getPassword() != null ){      
        SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
        configuration.setEncrypted(true);
        configuration.set128BitKey(true);
        configuration.setUserPassword( reporte.getPassword() );
        configuration.setOwnerPassword( reporte.getPassword() );
        configuration.setPermissions(PdfWriter.ALLOW_COPY | PdfWriter.ALLOW_PRINTING);      
        exporter.setConfiguration(configuration);

        exporter.setExporterInput( new SimpleExporterInput(print));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        exporter.setExporterOutput( new SimpleOutputStreamExporterOutput(baos));       
        exporter.exportReport();
        pdf = baos.toByteArray();
      }else{
        pdf = JasperExportManager.exportReportToPdf(print);
      }
      
      log.log(Level.INFO,">>>Bytes generados {0}", pdf.length );
      reporte.setPdf(pdf);
      return new Message(reporte);
    } catch (IOException | JRException ex) {
      log.log(Level.SEVERE, ">>>!!!ERROR al generar el PDF" , ex);
      return response(null, ServiceStatusEnum.EXCEPCION, new RecursoNoExistenteException(), null );
    }
  }
  
}

