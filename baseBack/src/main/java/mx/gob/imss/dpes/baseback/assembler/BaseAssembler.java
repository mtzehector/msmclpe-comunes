package mx.gob.imss.dpes.baseback.assembler;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.PageModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;



/**
 *
 * @author antonio
 */
public abstract class BaseAssembler<E extends Serializable, M extends BaseModel, I extends Serializable, Q extends Serializable> {

  protected final Logger log = Logger.getLogger(getClass().getName());

  public BaseAssembler() {
  }

  public abstract E toEntity(M source);
  public abstract I toPKEntity(Q source);

  public List<E> toListEntity(List<M> sources) {
    List<E> lista = new ArrayList<>();
    if (sources !=
            null) {
      for (M source : sources) {
        lista.add(toEntity(source));
      }
    }
    return lista;
  }

  public abstract M assemble(E source);
  public abstract Q assemblePK(I source);
  

  public List<M> assembleList(List<E> sources) {
    List<M> lista = new ArrayList<>();
    if (sources !=
            null) {
      for (E source : sources) {
        lista.add(assemble(source));
      }
    }
    return lista;
  }
  
  public PageModel<M> assemblePage(PageModel<E> sources) {
    
    PageModel<M> page = new PageModel<>();
    
    if (sources ==
            null ||
            sources.getContent() ==
            null ||
            sources.getContent().isEmpty()) {
      page.setContent(Collections.<M>emptyList());
      page.setNumber(0);
      page.setTotalElements(0L);
      page.setTotalPages(0);
      return page;
    }
    page.setContent( assembleList(sources.getContent()) );
    page.setNumber( sources.getNumber() );
    page.setTotalElements( sources.getTotalElements() );
    page.setSize( sources.getSize() );
    page.setNumberOfElements( sources.getNumberOfElements() );
    page.setTotalPages( sources.getTotalPages() );
    return page;
  }
  
  public Page<M> assemblePage(Page<E> sources) {
    if (sources ==
            null ||
            sources.getContent() ==
            null ||
            sources.getContent().isEmpty()) {
      return new PageImpl<>(Collections.<M>emptyList());
    }
    return new PageImpl<>(
            assembleList(sources.getContent()), new PageRequest(sources.
            getNumber(), sources.getSize()), sources.getTotalElements());
  }

}
