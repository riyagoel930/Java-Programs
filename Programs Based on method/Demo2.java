import java.util.LinkedList;
class Demo2
	{
	public static void main(String[] args){
	
	LinkedList ll = new LinkedList();
	ll.add(45);
	ll.add(65);
	boolean res=ll.add(35);
	ll.add(65);
	System.out.println(ll);
	}
}
