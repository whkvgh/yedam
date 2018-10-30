package co.lsh.bean;

public class RegisterBean {

	private String u_id;
	private String u_pw;
	private String u_name;
	private String u_gender;
	private String u_birth;
	private String u_mail;
	private String u_phone;
	private String u_reg;
	
	public RegisterBean(String u_id, String u_pw, String u_name, String u_gender, String u_birth,String u_mail,String u_phone, String u_reg) {
		this.u_id=u_id;
		this.u_pw=u_pw;
		this.u_name=u_name;
		this.u_gender=u_gender;
		this.u_birth=u_birth;
		this.u_mail=u_mail;
		this.u_phone=u_phone;
		this.u_reg=u_reg;
		
	}
	public RegisterBean() {
		
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pw() {
		return u_pw;
	}
	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_gender() {
		return u_gender;
	}
	public void setU_gender(String u_gender) {
		this.u_gender = u_gender;
	}
	public String getU_birth() {
		return u_birth;
	}
	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}
	public String getU_mail() {
		return u_mail;
	}
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_reg() {
		return u_reg;
	}
	public void setU_reg(String u_reg) {
		this.u_reg = u_reg;
	}
	
}
