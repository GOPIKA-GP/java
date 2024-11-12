package Encapsulation;

public class Employee {
	
	private String name;//right click---source---getter and setter
	private int accnum;
	private String mailid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getMailid() {
		return mailid;
		
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	

}
