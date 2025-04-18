import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the  5 Integers");
		int[] num1=new int[5];
		int sum =0;
		
		
	for (int  i =0; i < 5; i++){
		//System.out.println("Enter the Integers");
		num1[i] =scan.nextInt();
			sum = sum +num1[i];
		}
		
		System.out.println ("Summation is = " +sum);
	}
}
		
	
	