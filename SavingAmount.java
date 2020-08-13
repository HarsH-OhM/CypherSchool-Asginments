package Assignment;

import java.util.*;

class SavingAmount{
	static int savings;
	public SavingAmount(int savings)
	{
		this.savings=savings;
	}
	public static int getter()
	{
		return savings;
	}
	public void setter(int savings)
	{
		this.savings=savings;
	}
	public static void decrement() {
		savings = savings-100;
	
	}
	public static void increment() {
		savings = savings+1000;
		
	}
	
	public static void checkSavings(int savings) {
		if(getter()>=1000)
			System.out.println("Congratulations! You have saved a good amount ");
		else if( getter()>=0 && getter()<1000) 
			System.out.println("Insufficient saving!");
		else
			System.out.println("You are in debt");
	}



	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		SavingAmount save = new SavingAmount(amount);
		
		
		
	    decrement();
	 	increment();
	 	checkSavings(amount);
	 
	 	System.out.println("Your current savings are Rs "+ getter());

		
		
	}
	

}

