package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class banks {

	public static void main(String[] args) {

		
	
		
		Scanner console = new Scanner(System.in);
		 ArrayList<String> arrlist = new ArrayList<String>();
		
		arrlist.add("ahmed");
        arrlist.add("hassan");
        arrlist.add("ali");
        arrlist.add("huda");
        arrlist.add("khaled");
        arrlist.add("hussien"); 
		 
		 ArrayList<String> pass = new ArrayList<String>();
        
        pass.add("1524");
        pass.add("1345");
        pass.add("1587");
        pass.add("1427");
        pass.add("1123");
        pass.add("1524");

		 ArrayList<Integer> balance = new ArrayList<Integer>();

		 balance.add(5800);
	     balance.add(8200);
	     balance.add(6200);
	     balance.add(9500);
	     balance.add(5850);
	     balance.add(9000);        
        while(true) {
        System.out.print("to login enter1\nfor sign up enter 2: ");
 		 int input = console.nextInt();


   		 if(input == 1) {
   	 		while(true) {
   			 Scanner console1 = new Scanner(System.in);

   			 System.out.println("enter user name: ");

   		 String user_name = console1.nextLine();
   	
   	     
   	     if (arrlist.contains(user_name)) {
   		  System.out.println("enter user pass: ");
   		 
   	       String password = console1.nextLine();
             int index_num = arrlist.indexOf(user_name);	  
             String passd = pass.get(index_num);
   	              
             if(passd.equals(password)) {
   	
            		
         		int balance2 =balance.get(index_num);
;	
         	while(true)
         	{
         		Scanner console4 = new Scanner(System.in);
         			
         			
         	
         	System.out.println("Enter 1 for withdraw");
         	System.out.println("Enter 2 for deposit");
         	System.out.println("Enter 3 for check balance");
         	System.out.println("Enter 4 for change password");         	
         	System.out.println("Enter 5 for EXIT");
         	System.out.print("Enter your choice please: ");
         	int num = console.nextInt();
         	
         	if(num == 1)
         	{
         		System.out.print("how much do you would to withdraw please: ");
         		int withdraw = console.nextInt();
         	 if(balance2 - withdraw > 0) {
         		balance2 -= withdraw ;
         	System.out.println("collect your money");
         	
         	 }
         	 else {
         		 System.out.println("sorry wrong amount money");
         	 }
         	
         	}

         		else if(num == 2)

         		{	
         			System.out.print("how much do you would to deposit please: ");
         			int deposit = console.nextInt();	
         			System.out.println("Your money has been deposited successfully");
         			balance2 += deposit ; 
         	

         		}
         		else if (num == 3)
         		{
         			System.out.println("your Balance is "+balance2);
         		}
         	
         		else if(num == 4) {
             		Scanner console5 = new Scanner(System.in);

while(true) {

	System.out.println("enter your user name: ");
 			String chuse = console5.nextLine();	
         	int cc = 	arrlist.indexOf(chuse);
	        
if (arrlist.contains(chuse)) {
	 String dd = pass.get(cc);
	System.out.println("enter your old password: ");
 			String chpass = console5.nextLine();	
           
 			if(dd.equals(chpass)) {

 			
 			int v = pass.indexOf(chpass);
 			System.out.println("enter your new password: ");
 			String newpass = console5.nextLine();	
            if(newpass.length()==4) {
 			pass.set(v,newpass);         			
 			System.out.println("password changed");

 			break;
 			}
 			}
            else
            {
            	System.out.println("input is wrong");
            }
 			}
          
            else {
            	System.out.println("user name is wrong" );
            }         		
	  
}
         		}
         		else if (num == 5)
         		{
         			System.out.println("you are welcome MR: "+user_name);
         		break;
         		}
         		
         		else {
         			System.out.println("wrong choice");
        		}
         	    	}	
         	

           
         
           break;
             }

           else
           {
       
           System.out.print("password is wrong\n");
     }
         	     }
   	     
   	    else {
	    	System.out.print("User Doesn't exist\n");
	      }

   		 }
   		 break;
   		
   		 }
   		 
   		
   		 else if(input == 2) {
   	      
   			while(true) {
 
   			 Scanner console2 = new Scanner(System.in);

   				 System.out.println("enter new user name: ");
   				 String doot = console2.nextLine();
    	      
    	       if(arrlist.contains(doot)) {
    	    	  System.out.println("User already exist");
    	       }
    	       
    	       else {
    	    	   while(true) {
    	    	   System.out.println("Enter password (4number) : ");
    	    	       String poss = console2.nextLine();
    	    	     if(poss.length()>4 || poss.length()<4) {
       	    	    
    	    	    	 System.out.println("password Wrong");
    	    	     }     
    	    	     
    	    	   
    	    	     
    	    	     
    	    	     
    	    	     else {
    	    	    	
    	    	    	 while(true) {
         	    		  System.out.println("please Enter your balance (min 5000$): ");
       	    	       int bal = console2.nextInt();
       	    	       if(bal <= 5000)
       	    	       {
          	    		  System.out.println("please (min 5000$) ");

       	    	    	   
       	    	       }
    	    	     
    	    	    	 
    	    	     
       	    	       else {
           	    		  System.out.println("Enter is successful");
                          arrlist.add(doot);
       	    	          pass.add(poss);
       	    	          balance.add(bal);
     	    	    	 break;
       	    	       }
       	    	      }
         	    	   
    	    	    	
    	    break;	   }
    	     	 }
    	    	     
    	    	}
    	   	    
    	  break;      }
   		 
   			 
	
   		 }
   		 else {
    		  System.out.println("Wrong choice ERROR");
 
    		  }
	
	
	}

		
		
	}

}
