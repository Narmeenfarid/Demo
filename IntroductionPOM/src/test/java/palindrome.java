import java.util.Scanner;

public class palindrome {

	public static boolean palindromeNum(int num) {
		
		int rem, orgNum, revNum=0;
		
		orgNum = num;
		
		while(num!=0) {
		rem = num % 10;
		revNum = (revNum*10) + rem;
		num = num/10;
		}
		if(orgNum == revNum) {
			System.out.println("Palindrome Num");
		}
		else{
			System.out.println("Not a Palindrome Num");
		}
		return false;
	}
public boolean palindromeNum2(int num) {
		
		int rem, orgNum, revNum=0;
		
		orgNum = num;
		
		while(num!=0) {
		rem = num % 10;
		revNum = (revNum*10) + rem;
		num = num/10;
		}
		if(orgNum == revNum) {
			System.out.println("Palindrome Num");
		}
		else{
			System.out.println("Not a Palindrome Num");
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a num: ");
		palindromeNum(in.nextInt());
		palindrome p = new palindrome();

	}

}
