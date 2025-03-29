import java.util.Scanner;
class Ex04{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Letter");
	char Letter =sc.next().charAt(0);
	switch(Letter){
		case 'a':System.out.println("It is Vowel");
		break;
		case 'e':System.out.println("It is Vowel");
		break;
		case 'i':System.out.println("It is Vowel");
		break;
		case 'o':System.out.println("It is Vowel");
		break;
		case 'u':System.out.println("It is Vowel");
		break;
		case 'A':System.out.println("It is Vowel");
		break;
		case 'E':System.out.println("It is Vowel");
		break;
		case 'I':System.out.println("It is Vowel");
		break;
		case 'O':System.out.println("It is Vowel");
		break;
		case 'U':System.out.println("It is Vowel");
		break;

		default: System.out.println("It is not Vowel");
	}
	
	
	}
}