import java.util.Scanner;
class Ex02{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.println("Enter the 3 Numbers");
	int num1 = ob.nextInt();
	int num2 = ob.nextInt();
	int num3 = ob.nextInt();
	
	if(num1>num2 && num1>num3){
		System.out.println("Largest Number is " +num1);
	}
		
		else if(num2>num1 && num2>num3) {
			System.out.println("Largest number is "+num2);
		}
	
	else {
		System.out.println("Largest number is "+num3);
	}
	}
}