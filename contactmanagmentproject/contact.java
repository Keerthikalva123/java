package contactmanagmentproject;

public class contact   {
	private String name;
	private long num;
	private String mailid;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	@Override
	public String toString() {
		return name+"\t\t"+num+"\t\t"+mailid+"\n\n" ;
	}
	public contact(String name, long num, String mailid) {
		super();
		this.name = name;
		this.num = num;
		this.mailid = mailid;
	}
	public contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
