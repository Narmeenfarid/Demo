
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new comment
int num=5;
String name="Narmeen Farid";

char letter='a';
double dec=5.99;
boolean mycard=true;

System.out.println(num);
System.out.println();

int[] arr=new int[5];
arr[0]=1;
arr[1]=89;
arr[2]=38;
arr[3]=48;
arr[4]=58;

int[] arr2= {2,4,5,6,8,19,20,23,24,30};

//System.out.println(arr2[2]);

for(int i=1;i<arr.length;i++) {
	System.out.println(arr[i]);
}

for(int i=0;i<arr2.length;i++) {
	System.out.println(arr2[i]);
}

String[] names= {"narmeen", "farid", "sharmeen"};
for(int i=0;i<names.length;i++) {
	System.out.println(names[i]);
}

for( String s:names) {
	System.out.println(s);
}

	}
	
	

}
