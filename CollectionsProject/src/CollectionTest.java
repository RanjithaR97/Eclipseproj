import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
        LinkedList lst=new LinkedList();
        lst.add(12);
        lst.add("ram");
        lst.add("war");
        lst.add(1, 77);
        lst.add(3, 8.6);
        System.out.println(lst);
        Iterator itr1=lst.iterator();
        while(itr1.hasNext()) {
        	System.out.println(itr1.next());
        }
		List arrList=new ArrayList();
		arrList.add("Nandhini");
		arrList.add(24);
		arrList.add("Ranjitha");
		arrList.add("true");
		arrList.add(24);
		arrList.remove(2);
		arrList.contains(24);
		System.out.println(arrList);
		System.out.println(arrList);
		System.out.println("The size of arraylist is " + arrList.size());
		for(Object x : arrList) {
			System.out.println(x);
		}
		System.out.println("==============================");
         System.out.println("Iterator using Iterable");
         
        	Iterator itr=arrList.iterator();
        	while(itr.hasNext()) {
        		System.out.println(itr.next());
        	 }
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(23);
        ar.add(34);
       System.out.println(ar);
       
       ArrayList<Number> ar1=new ArrayList<Number>();
       ar1.add(23);
       ar1.add(34);
      System.out.println(ar1);
      for(Number x:ar1) {
    	  System.out.println(x);
      }
        
        
        	 
         }
	}


