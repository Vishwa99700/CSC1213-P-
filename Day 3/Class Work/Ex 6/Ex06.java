import java.util.Scanner;
class Ex06{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int Num1 = scan.nextInt();
	System.out.println("Enter the Number");
	int Num2 = scan.nextInt();
	for(int i=0; i<=Num1; i++){
		System.out.print("Value for i " +i+" ");
		for(int j=0; j<Num2; j++){
			System.out.print("Value for j " +j+" ");
		}
		System.out.println();
	}
	}
}