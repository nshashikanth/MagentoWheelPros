package testmagento;

import java.util.HashSet;
import java.util.Iterator;

public class testprg {

	
	public static void main(String[] args) {

		HashSet<String>  ts=new HashSet<String>();
		ts.add("hello");
		ts.add("How are you");
		ts.add("What are you doing");
		ts.add("y");
		ts.add("a");
		ts.add("hello");
		
		Iterator<String> h=ts.iterator();
		
		while(h.hasNext()) {
			System.out.println(h.next());
		}
		
		
		
		
	}
	}
