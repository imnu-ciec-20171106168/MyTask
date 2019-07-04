package cn.edu.imnu.mytask.bean;

import java.util.Date;

public class InformationBean {
	private int applicantId;
	private String applicantEmail;
	private String applicantPwd;
	private int loginTag;
	public InformationBean() {
		super();
	}

	public InformationBean(int applicantId, String applicantEmail, String applicantPwd, int loginTag) {
		super();
		this.applicantId = applicantId;
		this.applicantEmail = applicantEmail;
		this.applicantPwd = applicantPwd;
		this.loginTag = loginTag;
		
		
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantPwd() {
		return applicantPwd;
	}
	public void setApplicantPwd(String applicantPwd) {
		this.applicantPwd = applicantPwd;
	}
	public int getloginTag() {
		return loginTag;
	}
	public void setloginTag(int loginTag) {
		this.loginTag = loginTag;
	}
}
