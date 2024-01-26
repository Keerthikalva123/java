package contactmanagmentproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class getContactbasedOnName {
	
	
	public static void getDetailsBasedOnName()throws IOException	 
	{
		
		TreeSet<contact> contactFileList=new TreeSet<contact>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String newName=sc.next();
		
		contact c=null;
		boolean nameCheck=false;
		
		File f=new File("list.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String dataRead=br.readLine();
		while(dataRead!=null)
		{
			System.out.println(dataRead);
			dataRead=br.readLine();
			String dataFromFile[]=dataRead.split("\t\t");
			String filename=dataFromFile[0];
			if(newName.equals(filename)) 
			{
				nameCheck=true;
				String name=dataFromFile[0];
				Long num=Long.parseLong(dataFromFile[1]);
				String mailid=dataFromFile[2];
				c=contactUtil.convertContactData(name, num, mailid);
				
			}
			dataRead=br.readLine();
			
	}
		if(nameCheck)
		{
			System.out.println(c);
		}
		else
			System.out.println("the name you entered is wrong");

}
}
