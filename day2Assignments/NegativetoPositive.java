package day2Assignments;

public class NegativetoPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -40;
		
		if(number<0) {
			
//			-40*-1=40
			
			int n=number*-1;
			System.out.println("The converted number is : " + n);
		}
		
		else{
			System.out.println("The given number is positive");
			
		}
	}

}
