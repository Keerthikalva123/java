package contactmanagmentproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class deletecontact {
	public static  void todeleteContact() throws IOException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name to delete");
		String dName=sc.next();
    
		StringBuilder sb=new StringBuilder();
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
			if(dName.equals(filename)) 
			{
				dataRead=br.readLine();
				continue;
			}
			else
			{
				sb.append(dataRead);
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
