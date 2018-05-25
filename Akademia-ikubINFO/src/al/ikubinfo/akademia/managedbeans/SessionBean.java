package al.ikubinfo.akademia.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="userBean")
@SessionScoped
public class SessionBean {

	@PostConstruct
	public void init() {
		System.out.println("INIT - SessionBean");
	}

}
