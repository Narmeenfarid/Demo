import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2= {1,2,4,5,6,7,8,9,10,122};
for(int i=0;i<arr2.length;i++) {
	
	if(arr2[i]%2==0) {
		System.out.println("The multiple of 2 is "+ arr2[i]);
	}
	else
	{
		System.out.println("Not a multiple of 2= " + arr2[i]);
	}
}
ArrayList<String> a =new ArrayList<String>();
a.add("narmeen");
a.add("Farid");
a.add("Sharmeen");
a.add("rahul");

a.remove(0);


System.out.println(a.get(3));
	}

}
