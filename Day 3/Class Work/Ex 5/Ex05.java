import java.util.Scanner;
class Ex05{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int Number = scan.nextInt();
	for(int i=1; i<=Number; i++){
		System.out.print(i+"\t");
	}
	}
}