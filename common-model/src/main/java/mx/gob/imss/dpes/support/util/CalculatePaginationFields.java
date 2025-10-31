/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.ext.Provider;
import mx.gob.imss.dpes.common.enums.CampoPaginacionEnum;
import mx.gob.imss.dpes.common.service.BaseService;

/**
 *
 * @author gabriel.rios
 */
public class CalculatePaginationFields {
    protected static Logger log = Logger.getLogger(CalculatePaginationFields.class.getName());
    
    public static HashMap calculateFields(int page, int pageSize, int totalElements, int totalMclpeElems) {
        HashMap<CampoPaginacionEnum, Integer> fieldsMap = new HashMap();
        int cTotalPages = 0;
        int cTotalSPESElems = 0;
        int cStartSPES = -1;
        int cEndSPES = -1;
        int cPageMclpe = 0;
        int cMaxPageMclpe = 0;
        cTotalPages = totalElements / pageSize;
        if (totalElements % pageSize > 0) {
            cTotalPages++;
        }
        cMaxPageMclpe = totalMclpeElems / pageSize;
        if (totalMclpeElems % pageSize > 0) {
            cMaxPageMclpe++;
        }
        if (page > 0 && cTotalPages >= page) {

            cTotalSPESElems = totalElements - totalMclpeElems;
            //log.log(Level.INFO,">>>>>>>>>>CalculatePaginationFields cTotalPages=" + cTotalPages + " cMaxPageMclpe=" + cMaxPageMclpe + "   >>>cTotalSPESElements=" + cTotalSPESElems);
            int mclpeElems = 0;
            int mclpeElemsPrev = totalMclpeElems;
            int i = 0;
            int remainingSPESElems = cTotalSPESElems;
            int remainingMclpeElems = totalMclpeElems;
            while (cPageMclpe < page && mclpeElems < totalMclpeElems) {
                mclpeElems += pageSize;
                //log.log(Level.INFO,"        >>>INIT CYCLE [" + i + "] mclpeElems=" + mclpeElems + " mclpeElemsPrev=" + mclpeElemsPrev + " totalMclpeElems=" + totalMclpeElems + " cTotalSPESElems=" + cTotalSPESElems + " cStartSPES=" + cStartSPES + " cEndSPES=" + cEndSPES);
                if (mclpeElems < totalMclpeElems) {
                    mclpeElemsPrev = mclpeElems;
                    remainingMclpeElems-=pageSize;
                } else {
                    if (mclpeElemsPrev > 0) {
                        if (cTotalSPESElems > 0) {
                            //log.log(Level.INFO,"                >>>[" + i + "]remainingMclpeElems=" + remainingMclpeElems);

//                            if (cTotalSPESElems < remainingSPESElems) {
//                                remainingSPESElems = cTotalSPESElems;
//                            }
                            remainingSPESElems = cTotalSPESElems;
                            if(cTotalSPESElems>(pageSize-remainingMclpeElems)){
                                remainingSPESElems = pageSize-remainingMclpeElems;
                            }
                            
                            cStartSPES = 0;
                            cEndSPES = remainingSPESElems - 1;
                           //log.log(Level.INFO,"            >>>CALCULATED (mclpeElemsPrev > 0) [" + i + "]mclpeElemsPrev=" + mclpeElemsPrev + " remainingSPESElems=" + remainingSPESElems + " cStartSPES=" + cStartSPES + " cEndSPES=" + cEndSPES);

                        }

                    }
                }
                cPageMclpe++;

                i++;

            }
            if (page > cMaxPageMclpe) {
                cPageMclpe = 0;
            }

            int pageSpes = page - cMaxPageMclpe;
            int spesElems = 0;
            int cRemainingTotalSPESElems = cTotalSPESElems;
            if(cEndSPES >=0){
                cRemainingTotalSPESElems = cRemainingTotalSPESElems - (cEndSPES + 1);
            }
            int cActualSpesPage = 1;
            //log.log(Level.INFO,"SPES[spesElems=" + spesElems + "]cActualSpesPage=" + cActualSpesPage + " pageSpes=" + pageSpes + "   spesElems=" + spesElems + "  cEndSPES=" + cEndSPES + " cRemainingTotalSPESElems=" + cRemainingTotalSPESElems);
            remainingSPESElems = cRemainingTotalSPESElems;
            while (cActualSpesPage <= pageSpes && spesElems < cRemainingTotalSPESElems) {
                spesElems += pageSize;
                //log.log(Level.INFO,"        >>> INIT CYCLE [spesElems=" + spesElems + "] cRemainingTotalSPESElems=" + cRemainingTotalSPESElems+" cActualSpesPage=" + cActualSpesPage + " pageSpes=" + pageSpes + "   cStartSPES=" + cStartSPES + " cEndSPES=" + cEndSPES);
                if (spesElems < cRemainingTotalSPESElems) {
                    cActualSpesPage++;
                    cStartSPES= cEndSPES + 1;
                    cEndSPES=cEndSPES+pageSize;
                    remainingSPESElems-=pageSize;
                } else {
                    if (spesElems > 0) {
                        cStartSPES = cEndSPES + 1;
                        //log.log(Level.INFO,"                >>>remainingSPESElems=" + remainingSPESElems);
                        cEndSPES = cStartSPES + remainingSPESElems -1;
                        //log.log(Level.INFO,"            >>>cEndSPES="+cEndSPES);

                    }
                }
                //log.log(Level.INFO,"        >>>CALCULATED [" + spesElems + "]  cActualSpesPage=" + cActualSpesPage + " pageSpes=" + pageSpes + "   cStartSPES=" + cStartSPES + " cEndSPES=" + cEndSPES);
                
            }

            log.log(Level.INFO,"        >>>>>>>>>>CalculatePaginationFields cPageMclpe=" + cPageMclpe + " cStartSPES=" + cStartSPES + " cEndSPES=" + cEndSPES +"  CTOTAL_PAGES="+cTotalPages);
            
            fieldsMap.put(CampoPaginacionEnum.CPAGE_MCLPE, cPageMclpe);
            fieldsMap.put(CampoPaginacionEnum.CSTART_SPES, cStartSPES);
            fieldsMap.put(CampoPaginacionEnum.CEND_SPES, cEndSPES);
            fieldsMap.put(CampoPaginacionEnum.CTOTAL_PAGES, cTotalPages);
        }

        return fieldsMap;
    }

}
