import java.util.*;
class Hashsetdemo 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("B");
		h.add("A");
		h.add("C");
		h.add("5");
		h.add("9");
		//h.add(null);
		System.out.println(h.add("A"));
		//System.out.println(h.add(null));
		System.out.println(h);
	}
}
