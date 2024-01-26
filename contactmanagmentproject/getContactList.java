package contactmanagmentproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class getContactList {
	
	public  static void contactList() throws Exception
	{
		File f=new File("list.txt");
		TreeSet<contact> contactFileList=new TreeSet<contact>();
		
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String dataRead=br.readLine();
		
		while(dataRead!=null)
		{
			System.out.println(dataRead);
			dataRead=br.readLine();
			String dataFromFile[]=dataRead.split("\t\t");
			String name=dataFromFile[0];
			Long num=Long.parseLong(dataFromFile[1]);
			String mailid=dataFromFile[2];
			contact c=contactUtil.convertContactData(name, num, mailid);
			contactFileList.add(c);
			dataRead=br.readLine();
		}

		
		
	}
	

}
