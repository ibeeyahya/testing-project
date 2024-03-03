package cosc301.lab01;

import cosc301.*;

public class TestIterator {
	public static void main(String[] args) {
		MyContainer c = new MyContainer();
		for (int i=0; i<10; i++) 
			c.insert(new Integer(i));
			
	    Iterator e = c.iterator();
	    
	    while (e.hasNext())
	       System.out.println(e.next());
	 }
}
				