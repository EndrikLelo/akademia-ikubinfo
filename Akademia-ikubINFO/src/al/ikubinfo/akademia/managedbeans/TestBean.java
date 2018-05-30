package al.ikubinfo.akademia.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TestBean {
	
	@ManagedProperty("#{userBean}")
	private SessionBean user;
	
	private String text;
	
	@PostConstruct
	public void init() {
		System.out.println("INIT - TestBean");
	}
	
	public String testSubmit() {
		System.out.println("TEST - SUBMIT: " + text);
		return null;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SessionBean getUser() {
		return user;
	}

	public void setUser(SessionBean user) {
		this.user = user;
	}
}
