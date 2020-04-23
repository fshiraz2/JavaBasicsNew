import java.util.*;

class Main {
	public static void main(String[] args) {
		List <Boolean>listA = new LinkedList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		List <Boolean>listB = new LinkedList<>();
		listB.addAll(listA);
		
		Iterator<Boolean> it=listB.iterator();
		while(it.hasNext()){
		  System.out.println(it.next());
		}
	}
}