package contactmanagmentproject;

import java.io.*;
import java.util.*;

public class phonebookmanagement {
	
	
	public static void main(String[] args) throws Exception 
	{ 
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
	
	int choice=0;
	boolean flag=true;
	System.out.println("enter 1 to create contact");
	System.out.println("enter 2 to get contact list");
	System.out.println("enter 3 to get contact based on name");
	System.out.println("enter 4 to update contact");
	System.out.println("enter 5 to delete contact");
	System.out.println("enter 6 to exit phonebook");
	
	while(flag)	
	{
		
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
			try
			{
				
				choice= Integer.parseInt(br.readLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("boss please enter numbers only...");
			}
		}
		if(choice>6)
		{
			System.out.println("enter only valid choice between 1 to  6");
		}
		
	
		switch(choice)
		{
		case 1:
			System.out.println("creation of contact started");
			createcontactdetails.createContactData();
			break;
		case 2:
		System.out.println("get contact list");
		getContactList.contactList();
		break;
	case 3:
	   System.out.println("get contact list based on name");
	   getContactbasedOnName.getDetailsBasedOnName();
	   break;

     case 4:
	    System.out.println("update process started");
	   updateContact.updatecontactmethod();
	break;

case 5:
	System.out.println("deletion process started");
	deletecontact.todeleteContact();
	break;

case 6:
	System.out.println("exit aapplication process started");
	flag=false;
	break;
}
	}
	
		}
	catch(ClassCastException e)
	{
	}
	catch(NullPointerException e)
		{
		
		}
		
		
	}

}
