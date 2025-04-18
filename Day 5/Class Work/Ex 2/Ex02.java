import java.util.Scanner;
class Ex02{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the  10 Integers");
		int[] Num=new int[10];
		
		
		
	for (int  i =0; i < 10; i++){
		System.out.println("Enter the Integer"+(i+1));
		Num[i] =scan.nextInt();
			
		}
		
		for(int  i =0; i < 10; i++){
			System.out.println(Num[i]);
			
		}
		
		System.out.println("************************************");
		System.out.println("Week Days");
		
		String days[]= {"Monday","Tuesday","Wednesday","Thursday","Friday", "Satarday", "Sunday"};
		
	for(String day: days){
		System.out.println(day);
	}
		
	}
}
		