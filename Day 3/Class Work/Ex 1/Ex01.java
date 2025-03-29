import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int num = ob.nextInt();
	
	if(num>0){
		System.out.println("It is Positive Number");
	}
	else if(num<0){
		System.out.println("It is Negative Number");
	}
	else {
		System.out.println("It is Zero");
	}
	}
}