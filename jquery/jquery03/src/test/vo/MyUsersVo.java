package test.vo;

public class MyUsersVo {
	private String id;
	private String pwd;
	private String email;
	public MyUsersVo() {}
	public MyUsersVo(String id, String pwd, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
