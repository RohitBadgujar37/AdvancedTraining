import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter the length of Rectangle");
			double a1=sc.nextDouble();
			
			System.out.println("Enter the breadth of Rectangle");
			double a2=sc.nextDouble();
			
			Rectangle r=new Rectangle(a1,a2);
			double result=r.calculatearea();
			r.display(result,i);
			
		}

	}

}
