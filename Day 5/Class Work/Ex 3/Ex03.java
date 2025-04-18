import java.util.Scanner;
class Ex03{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int[] num=new int[5];
		
		
		
	for (int  i =0; i < 5; i++){
		System.out.println("Enter the Integer"+(i+1));
		num[i] =scan.nextInt();
			
		}
		int max =num(0);
		for(int  i =0; i < 5; i++){
			if (num[i]>max){
			max = num[i];
			
		}
		System.out.println("Largest Number is "+max);
			
		}
		
		
	}
}