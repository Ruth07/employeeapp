package myJava;
import java.util.*;

public class Employee1 {

	public static void main(String args[]){
		
		Scanner intype = new Scanner(System.in);
		System.out.println("please choose employee Category: "); 
		System.out.println("1. montly employee"); 
		System.out.println("2.houly  employee"); 
		System.out.println("3.weekly employee"); 
         int type = intype.nextInt();
         
         
         
         if (type==1) {
		
		
		
		
		
		
		
		 Montly b=new  Montly();
		 
		 
		 System.out.println("please enter your montly salary"); 
		 b.montly_gross = intype.nextFloat();
		
		 b. montly_net = b.montly_gross- (b.montly_gross*90/1000);
		 
		 
        System.out.println("your salary is:"+b.montly_net); 
        
        
        intype.close();
         
     }  
         
         else if (type==2)  {
        	 Daily x= new   Daily();
        	 System.out.println("please enter your number of hours"); 
        	 x.number_hours = intype.nextFloat();
        	 System.out.println("please enter your payment per   hours"); 
        	 x.hour_payment = intype.nextFloat();
        	 
        	 
        	 if (x.number_hours > 40 ) {
        		 
        		 x.bonus= (x.number_hours-40)*10/100;
        		 
        		 x.houly_payment = x.bonus+ ( x.number_hours*x.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+x.houly_payment); 
        	 
        	 }
        	 
        	 else { x.houly_payment =  ( x.number_hours*x.hour_payment );
        	 
        	 System.out.println("your daily payment is:"+x.houly_payment);}
         
         }
         
         else if (type==3)  {
        	 
        	Weekly  f= new Weekly();
        	
        System.out.println("please enter your weekly working hour"); 
        f.number_weeks = intype.nextFloat();
       	 System.out.println("please enter your weekly salary"); 
       	 f.week_payment = intype.nextFloat();
        	 
       	 f.weekly_payment =  (  f.number_weeks* f.week_payment ); 
     
        	 
       	System.out.println("your  payment is:"+ f.weekly_payment); }
         else    {System.out.println("invalid type"); }
	
	}
		
}


class Employe{  
    float montly_gross;  
    float montly_net;
    float houly_payment;
    float number_hours;
    float hour_payment;
    float bonus;
    float week_payment;
    float weekly_payment;
    
    float number_weeks;
    
   }  
   class Montly extends Employe{  
    // class for monthly employee
    
   }  
   
   
   class Weekly extends Employe{  
	   
	   // class for weekly employee
	   
	    
	   }  
   class Daily extends Employe{ 
	   // class for daily employee
	    
	   }  



