import java.util.Scanner;

public class RoomChargeCalculator {
	 public double getChargeDeluxDouble(boolean Balcony,boolean parking,boolean Tv,boolean Kitchen,boolean wifi)
     {
    	 double full_charge;
    	 double Fixed_charge=5000;
    	 double Balcony_charge;
    	 double parking_charge;
    	 double tv_charge;
    	 double kitchen_charge;
    	 double wifi_charge;
    	 
    	 if(Balcony==true)
    	 {
    		 Balcony_charge=500;
    	 }
    	 else
    	 {
    		 Balcony_charge=0;
    	 }
    	 if(parking==true)
    	 {
    		 parking_charge=200;
    	 }
    	 else
    	 {
    		 parking_charge=0;
    	 }
    	 if(Tv==true)
    	 {
    		 tv_charge=200;
    	 }
    	 else
    	 {
    		 tv_charge=0;
    	 }
    	 if(Kitchen==true)
    	 {
    		 kitchen_charge=1000;
    	 }
    	 else
    	 {
    		 kitchen_charge=0;
    	 }
    	 if(wifi==true)
    	 {
    		 wifi_charge=100;
    	 }
    	 else
    	 {
    		 wifi_charge=0;
    	 }
    	
         full_charge=Fixed_charge+Balcony_charge+parking_charge+tv_charge+kitchen_charge+wifi_charge;
         
    	 return full_charge;
     }
     
     public double getChargeStandarFamily(boolean parking,boolean Kitchen,boolean garden)
     {
    	 double fixed_charge=3000;
    	 
    	 double full_charge;
    	 
    	 double parking_charge;
    	 double kitchen_charge;
    	 double garden_charge;
    	
    	 
    	 if(parking==true)
    	 {
    		 parking_charge=200;
    	 }
    	 else
    	 {
    		 parking_charge=0;
    	 }
    	 if(Kitchen==true)
    	 {
    		 kitchen_charge=500;
    	 }
    	 else
    	 {
    		 kitchen_charge=0;
    	 }
    	 if(garden==true)
    	 {
    		 garden_charge=200;
    	 }
    	 else
    	 {
    		 garden_charge=0;
    	 }
    
    	
         full_charge=fixed_charge+parking_charge+kitchen_charge+garden_charge;
         
    	 return full_charge;
     }

     public double getChargeStandardSingle(boolean parking,boolean AC,boolean wifi)
     {
     
    	 double fixed_charge=2000;
    	 
    	 double full_charge;
    	 
    	 double parking_charge;
    	 double AC_charge;
    	 double wifi_charge;
    	
    	 
    	 if(parking==true)
    	 {
    		 parking_charge=200;
    	 }
    	 else
    	 {
    		 parking_charge=0;
    	 }
    	 if(AC==true)
    	 {
    		 AC_charge=500;
    	 }
    	 else
    	 {
    		 AC_charge=0;
    	 }
    	 if(wifi==true)
    	 {
    		 wifi_charge=100;
    	 }
    	 else
    	 {
    		 wifi_charge=0;
    	 }
    
    	
         full_charge=fixed_charge+parking_charge+AC_charge+wifi_charge;
         
    	 return full_charge;
     
    	 }
     
     
     
     public static void main(String[] args) {
 		
 		Scanner myScanner=new Scanner(System.in);
 		
 		System.out.println("Room Charge calculator\n1. Deluxe-Double\n2.Standar-Family\n3.Standard-Single\n4. Quit\nEnter your choice(1-4) :");
 		int roomNo=myScanner.nextInt();
 		
 		RoomChargeCalculator NewRoom= new RoomChargeCalculator();
 		
 		double finalAmount=0;
 		
 		while(roomNo!=4) {
 		
 		if(roomNo==1)
 		{
 			System.out.print("Do you want a balcony(true/false) :");
 			boolean Balcony=myScanner.nextBoolean();
 			
 			System.out.print("Do you want parking(true/false) :");
 			boolean Parking=myScanner.nextBoolean();
 			
 			System.out.print("Do you want a Tv(true/false) :");
 			boolean Tv=myScanner.nextBoolean();
 			
 			System.out.print("Do you want a Kitchen(true/false) :");
 			boolean Kitchen=myScanner.nextBoolean();
 			
 			System.out.print("Do you want wifi(true/false) :");
 			boolean Wifi=myScanner.nextBoolean();
 			
 			double RoomChargeDeluxe = NewRoom.getChargeDeluxDouble(Balcony,Parking,Tv,Kitchen,Wifi);
 			
 			finalAmount=finalAmount+RoomChargeDeluxe;
 			
 		}
 		else if(roomNo==2)
 		{
 			System.out.print("Do you want parking(true/false) :");
 			boolean Parking=myScanner.nextBoolean();
 			
 			System.out.print("Do you want a Kitchen(true/false) :");
 			boolean Kitchen=myScanner.nextBoolean();
 			
 			System.out.print("Do you want a Garden(true/false) :");
 			boolean Garden=myScanner.nextBoolean();
 			
 			double RoomChargeFamily= NewRoom.getChargeStandarFamily(Parking, Kitchen, Garden);

 			finalAmount=finalAmount+RoomChargeFamily;
 			
 		}
 		else if(roomNo==3)
 		{
 			System.out.print("Do you want Parking(true/false) :");
 			boolean Parking=myScanner.nextBoolean();
 			
 			System.out.print("Do you want AC(true/false) :");
 			boolean AC=myScanner.nextBoolean();
 			
 			System.out.print("Do you want wifi(true/false) :");
 			boolean Wifi=myScanner.nextBoolean();
 			
 			double RoomChargeSingle=NewRoom.getChargeStandardSingle(Parking, AC, Wifi);
 			
 			finalAmount=finalAmount+RoomChargeSingle;
 		}
 		
 		
 		else
 		{
 			System.out.print("Invalid Input.");
 			
 		}
 		
 		System.out.println("Room Charge calculator\n1. Deluxe-Double\n2.Standar-Family\n3.Standard-Single\n4. Quit\nEnter your choice(1-4) :");
 		roomNo=myScanner.nextInt();
 		
 		}
 	
         System.out.println("Total charge for the rooms :"+finalAmount);
 	}

 }

     
     




     
     


