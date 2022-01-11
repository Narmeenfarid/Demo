import java.util.ArrayList;

public class javastream1 {

//count the number of names starting with alphabet A
	
	public void regular() {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("ayan");
		names.add("narmeen");
		names.add("sharmeen");
		names.add("ali");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
