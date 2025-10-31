package mx.gob.imss.dpes.common.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.enums.EventEnum;
import mx.gob.imss.dpes.common.exception.BusinessException;


public class Header extends BaseModel {
  @Getter @Setter ServiceStatusEnum status;
  @Getter @Setter BusinessException exception;
  @Getter @Setter EventEnum event;
  @Getter private List<Notice> notices = new ArrayList<Notice>();
  
  public void addNotice(Notice notice) {
	if(notice!=null) {
		notices.add(notice); 
	}
       
  }
}
