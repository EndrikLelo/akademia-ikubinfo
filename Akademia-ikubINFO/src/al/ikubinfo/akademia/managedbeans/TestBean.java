package al.ikubinfo.akademia.managedbeans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/*
The @ManagedBean annotation can take a name attribute.
If it is ommited, JSF sets the name of the bean instance automatically to
the name of the class but with the first letter in lower case.
In this case, the assigned name will be: testBean.

Be careful with this feature, as multiple beans with the same name are not allowed.
But multiple classes with the same name but different assigned name for the bean are.

Full example: @ManagedBean(name = "testBean")
*/
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
