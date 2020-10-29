package Exercise;


import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStream {
	@Test
	public void regular() {
		ArrayList<String> names=new ArrayList<String>();
		int count=0;
			
		names.add("Burhan");
		names.add("Funda");
		names.add("Fenerbahçe");
		names.add("Büþra");
		names.add("Burcu");
		names.add("Ali");
			
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("B")) {
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void streamFilter() {
		ArrayList<String> names=new ArrayList<String>();
		int count=0;
			
		names.add("Burhan");
		names.add("Funda");
		names.add("Fenerbahçe");
		names.add("Büþra");
		names.add("Burcu");
		names.add("Ali");
			
		Long c=names.stream().filter(s->s.startsWith("B")).count();
		
		System.out.println(c);
	}
	@Test
	public void streamFilter2() {
			
		Long d=Stream.of("Burhan","Funda","Fenerbahçe","Büþra","Burcu","Ali").filter(s->
			{
				s.startsWith("B"); 
				return true;
			}).count();
		
		System.out.println(d);
	}
	@Test
	public void streamFilterLength() {
			
		ArrayList<String> names=new ArrayList<String>();
		int count=0;
			
		names.add("Burhan");
		names.add("Funda");
		names.add("Fenerbahçe");
		names.add("Büþra");
		names.add("Burcu");
		names.add("Ali");
		
		names.stream().filter(s->s.length()<4).forEach(s->System.out.println(s));
	}
	@Test
	public void streamFilterLengthLimit() {
			
		ArrayList<String> names=new ArrayList<String>();
		int count=0;
			
		names.add("Burhan");
		names.add("Funda");
		names.add("Fenerbahçe");
		names.add("Büþra");
		names.add("Burcu");
		names.add("Ali");
		System.out.println("-----------------");
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap() {
			
		System.out.println("--------streamMap---------");
		Stream.of("Burhan","Funda","Fenerbahçe","Büþra","Burcu","Ali").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMapSort() {
			
		System.out.println("--------streamMapSort---------");
		List<String> names=Arrays.asList("Burhan","Funda","Fenerbahçe","Büþra","Burcu","Ali");
		names.stream().filter(s->s.startsWith("B")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamConcat() {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		System.out.println("-----------------streamConcat------------------");
		List<String> names1=Arrays.asList("Burhan","Funda","Fenerbahçe","Büþra","Burcu","Ali");
		names.stream().filter(s->s.startsWith("B")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		System.out.println("------");
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
	}

}
