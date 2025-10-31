package mx.gob.imss.dpes.common.assembler;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.logging.Logger;
import mx.gob.imss.dpes.common.model.BaseModel;
import mx.gob.imss.dpes.common.model.PageModel;

/**
 *
 * @author antonio
 */
public abstract class BaseAssembler<E extends Serializable, M extends BaseModel> {

    protected final Logger log = Logger.getLogger(getClass().getName());

    public abstract M assemble(E source);

    public List<M> assembleList(List<E> sources) {
        List<M> lista = new ArrayList<>();
        if (sources
                != null) {
            for (E source : sources) {
                M m = assemble(source);
                if (m != null) {
                    lista.add(m);
                }
            }
        }
        return lista;
    }

    public PageModel<M> assemblePage(PageModel<E> sources) {

        PageModel<M> page = new PageModel<>();

        if (sources
                == null
                || sources.getContent()
                == null
                || sources.getContent().isEmpty()) {
            page.setContent(Collections.<M>emptyList());
            page.setNumber(0);
            page.setTotalElements(0L);
            page.setTotalPages(0);
            return page;
        }
        page.setContent(assembleList(sources.getContent()));
        page.setNumber(sources.getNumber());
        page.setTotalElements(sources.getTotalElements());
        page.setSize(sources.getSize());
        page.setNumberOfElements(sources.getNumberOfElements());
        page.setTotalPages(sources.getTotalPages());
        page.setTotalMclpeElements(sources.getTotalMclpeElements());
        page.setPageSize(sources.getPageSize());
        return page;
    }

}
