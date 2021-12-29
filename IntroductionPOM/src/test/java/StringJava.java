
public class StringJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object that represents the sequence of characters
		//we can define string in 2 ways
		// 1. By literal
		// 2. By memory allocation
String s= "rahul shetty academy";
String s1="narmeen";

String s2=new String("welcome");
String s3=new String("welcome");
//String[] splittedstring=s.split(" ");
//14     15     -
for(int i=s.length()-1;i>=0;i--) {
	
	System.out.println(s.charAt(i)+" "+i);
}
	
	}

}
