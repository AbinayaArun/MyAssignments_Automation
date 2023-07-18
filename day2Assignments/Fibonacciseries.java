package day2Assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=8,  firstnum=0,secondnum=1,sum ;
		
		System.out.println("The given firstnumber is : " + firstnum);
		for(int i=1;i<=8;i++) {
			
			sum= firstnum+secondnum;// sum=0+1
			firstnum=secondnum;  
			secondnum=sum;
			System.out.println(sum);
		}
		
	}

}
