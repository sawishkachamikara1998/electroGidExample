package LinkList;

public class linkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part 1
		
	/*	linkList l1 = new linkList("sawishka",65.8);
		linkList l2 = new linkList("kanaka",34.4);
		linkList l3 = new linkList("alwis",87.2);
		
		l1.Next = l2;
		l2.Next = l3;
		l3.Next = null;
		
		l1.Next.displayDetails();    */
		
		linkList2 thelink = new linkList2();
		
		thelink.insertFirst("sawishka", 54.5);
		thelink.insertFirst("kanaka", 34.6);
		thelink.insertFirst("alwis", 23.5);
		thelink.displayList();
		
		
	}

}
