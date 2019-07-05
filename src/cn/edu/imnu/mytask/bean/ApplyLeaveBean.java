package cn.edu.imnu.mytask.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class ApplyLeaveBean {
	private String realnumber;
	private String realname;
	private String realgrade;
	private Date starttime;
	private Date endtime;
	private String telephone;
	private String operate1;
	private String operate2;
	private String leavereason;	
	public ApplyLeaveBean(String realnumber, String realname, String realgrade, Date starttime, Date endtime, String telephone, String operate1, String operate2, String leavereason) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.realnumber = realnumber;
		this.realname = realname;
		this.realgrade = realgrade;
		this.starttime = starttime;
		this.endtime = endtime;
		this.telephone = telephone;
		this.operate1 = operate1;
		this.operate2 = operate2;
		this.leavereason = leavereason;
		
	}
	
	public String getRealNumber() {
		// TODO Auto-generated method stub
		return realnumber;
	}
	
	public void setRealNumber(String realnumber) {
		this.realnumber = realnumber;
	}

	public String getRealName() {
		// TODO Auto-generated method stub
		return realname;
	}
	
	public void setRealName(String realname) {
		this.realname = realname;
	}
	
	public String getRealGrade() {
		// TODO Auto-generated method stub
		return realgrade;
	}

	public void setRealGrade(String realgrade) {
		this.realgrade = realgrade;
	}
	
	public Date getStartTime() {
		// TODO Auto-generated method stub
		return starttime;
	}
	
	public void setStartTime(Date starttime) {
		this.starttime = starttime;
	}
	
	public Date getEndTime() {
		// TODO Auto-generated method stub
		return endtime;
	}

	public void setEndTime(Date endtime) {
		this.endtime = endtime;
	}
	
	public String getTelephone() {
		// TODO Auto-generated method stub
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getOperate1() {
		// TODO Auto-generated method stub
		return operate1;
	}

	public void setOperate1(String operate1) {
		this.operate1 = operate1;
	}
	
	public String getOperate2() {
		// TODO Auto-generated method stub
		return operate1;
	}

	public void setOperate2(String operate2) {
		this.operate2 = operate2;
	}
	
	public String getLeaveReason() {
		// TODO Auto-generated method stub
		return leavereason;
	}
	
	public void setLeaveReason(String leavereason) {
		this.leavereason = leavereason;
	}

}
