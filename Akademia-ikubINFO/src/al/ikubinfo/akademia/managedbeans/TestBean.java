package al.ikubinfo.akademia.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TestBean {
	
	private String text;
	
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
	
	

}
