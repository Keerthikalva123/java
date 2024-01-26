package contactmanagmentproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class updateContact {
	public static void updatecontactmethod()throws IOException
	 {
		StringBuilder sb=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String newName=sc.next();
		System.out.println("enter last name to update");
		String firstname=sc.next();
		System.out.println("enter.first name to update");
		String lastname=sc.next();
		System.out.println(" new name saved as");
		String uname=firstname+lastname;
		System.out.println(uname);
		System.out.println("enter mobile number to  update");
		long unum=sc.nextLong();
		System.out.println("enter mail id to update");
		String umailid=sc.next(); 
		

		
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
				c=contactUtil.convertContactData(uname, unum, umailid);
				sb.append(c.toString());
			}
			else
			{
				sb.append(dataRead);
			}
			if(!nameCheck)
			{
				System.out.println("enteredname is available");
			}
			dataRead=br.readLine();
			
	}
		System.out.println(sb);
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(sb.toString());
		bw.close();
		
	}

}
