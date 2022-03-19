
public class Rectangle {
	private double length;
	private double breadth;
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double calculatearea()
	{
		double rs=length*breadth;
		return rs;
		
	}
	public void display(double calculatearea,int a)
	{
		System.out.println("area of rectangle "+a+"is" + calculatearea);
		System.out.println("==========================================");
		
	}
	
	
	

}
