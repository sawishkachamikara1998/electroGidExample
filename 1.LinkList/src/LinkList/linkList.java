package LinkList;



public class linkList {

	public String name;
	public double avg;
	public linkList Next;
	
	public linkList(String name, double avg) {
		super();
		this.name = name;
		this.avg = avg;
		Next = null;
	}
	
	public void displayDetails() {
		System.out.println(name + " " + avg);
	}
	
}
