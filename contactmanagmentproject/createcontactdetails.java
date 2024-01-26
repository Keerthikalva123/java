package contactmanagmentproject;

import java.io.*;
import java.util.*;

public class createcontactdetails {
	public static void createContactData() throws IOException
	{
	
		Scanner sc=new Scanner(System.in);
		
		
		
		
		System.out.println("enter.first name");
		String firstname=sc.next();
		System.out.println("enter.first name");
		String lastname=sc.next();
		System.out.println(" name saved as");
		String name=firstname+lastname;
		System.out.println(name);
		System.out.println("enter mobile number");
		long num=sc.nextLong();
		System.out.println("enter mail id");
		String mailid=sc.next(); 
		contact c=contactUtil.convertContactData(name, num, mailid);
		File f=new File("list.txt");
		
		
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(c.toString());
		bw.close();
		
		
		
		
		
	}

}


