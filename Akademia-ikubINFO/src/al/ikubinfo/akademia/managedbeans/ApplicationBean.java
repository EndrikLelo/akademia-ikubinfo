package al.ikubinfo.akademia.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager=true)
@ApplicationScoped
public class ApplicationBean {
	
	@PostConstruct
	public void init() {
		System.out.println("INIT - ApplicationBean");
	}

}
