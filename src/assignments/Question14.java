package assignments;

class Shape
{
	int area (int a)
	{
		return a*a;
	}
	int area(int length,int width)
	{
		return length*width;
		
	}
	
	int perimeter(int b) {
		return 4*b;
	}
	int perimeter(int length,int width)
	{
		return 2*(length+width);
	}
	
	
}




public class Question14 {

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		System.out.println("Area Of Square:"+s.area(6));
		System.out.println("Area of Rectangle:"+s.area(10, 20));
		System.out.println("Perimeter of Square:"+s.perimeter(6));
		System.out.println("Perimeter of Rectangle:"+s.perimeter(4, 6));
	}

}

/*
 * output:
 * 
 * Area Of Square:36
Area of Rectangle:200
Perimeter of Square:24
Perimeter of Rectangle:20
*/
