package LinkList;



public class linkList2 {
	
	private linkList first;

	public linkList2() {
		super();
		this.first = null;
	}
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(String name, double avg) {
		linkList newLink = new linkList(name,avg);
		newLink.Next= first;
		first = newLink;
	}
	public linkList deleteFirst() {
		linkList temp = first;
		first = first.Next;
		return temp;
	}
	public void displayList() {
		System.out.println("list from first link to the last link");
		
		linkList current = first;
		
		while(current != null) {
			current.displayDetails();
			current = current.Next;
		}
		
	}

}
