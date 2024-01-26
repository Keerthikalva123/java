package contactmanagmentproject;

public class contactUtil {
	
	public static contact convertContactData(String name,long num,String mailid)
	{
		contact c=new contact();
		c.setName(name);
		c.setNum(num);
		c.setMailid(mailid);
		return c;
	
	}

}
