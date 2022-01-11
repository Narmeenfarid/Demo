import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class JavaStream {
 // @Test
  public void regular() {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ayan");
		names.add("narmeen");
		names.add("sharmeen");
		names.add("Ali");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
  @Test
  public void teststreamfilter() {
	  ArrayList<String> names= new ArrayList<String>();
	  names.add("Ayan");
		names.add("narmeen");
		names.add("sharmeen");
		names.add("Ali");
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		Long d=Stream.of("Ayan","narmeen","sharmeen","Ali","ana").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		//print all the names of the arraylist
		names.stream().filter(s->s.length()<4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()<4).limit(1).forEach(s->System.out.println(s));
  }
  @Test
  public void streamMap() {
	  ArrayList<String> names= new ArrayList<String>();
	  names.add("man");
		names.add("don");
		names.add("women");
		
	  //print names which have last letter as "a" with uppercase
	  Stream.of("narmeen","sana","sara","ali","abdullah","alvina","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach
	  (s->System.out.println(s));
	  
	  //print names which has first letter with "a" with uppercase and sorted
	 List<String>names1= Arrays.asList("narmeen","sana","sara","ali","abdullah","alvina","Rama");
	 names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach
	  (s->System.out.println(s));
	 
	 //merging 2 different lists
	Stream<String> newStream= Streams.concat(names.stream(),names1.stream());
	//newStream.sorted().forEach(s->System.out.println(s));
	boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("narmeen"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	//mach the merged list
	
	  
  }
  @Test
  public void streamCollect() {
	  //collect is used to collect any result and return it back to list
	 List<String> Ls= Stream.of("narmeen","sana","sara","ali","abdullah","alvina","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	  .collect(Collectors.toList());
	 System.out.println("name is"+Ls.get(0));
	 
	 List<Integer>values=Arrays.asList(3,2,2,7,5,19,7);
	 values.stream().sorted().distinct().forEach(s->System.out.println(s));
	 List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
	 System.out.println(li.get(2));
	 
  }
}
