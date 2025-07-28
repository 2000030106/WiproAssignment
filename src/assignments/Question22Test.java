package assignments;

class Line implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Line :Black COlor ");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Size is : 20 units");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing color:Green");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("Thickness:2px");
	}
	
}

class Square implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Line :Blue COlor ");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Size is : 50 units");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing color:Orange");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("Thickness:3px");
	}
	
}


class Circle implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		// TODO Auto-generated method stub
		System.out.println("Line :Violet COlor ");
	}

	@Override
	public void size() {
		// TODO Auto-generated method stub
		System.out.println("Size is : 60 units");
	}

	@Override
	public void drawingColor() {
		// TODO Auto-generated method stub
		System.out.println("Drawing color:Purple");
	}

	@Override
	public void thickness() {
		// TODO Auto-generated method stub
		System.out.println("Thickness:5px");
	}
	
}
public class Question22Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable d = new Line();
		Fillable f= new Line();
		

		Drawable d1 = new Circle();
		Fillable f1= new Circle();
		

		Drawable d2 = new Square();
		Fillable f2= new Square();
		
		System.out.println("Line :");
		d.drawingColor();
		d.thickness();
		f.fillingColor();
		f.size();
		
		System.out.println("Square");
		d2.drawingColor();
		d2.thickness();
		f2.fillingColor();
		f2.size();
		
		System.out.println("Circle");
		d1.drawingColor();
		d1.thickness();
		f1.fillingColor();
		f1.size();
	}

}


/*
 * output:
 * Line :
Drawing color:Green
Thickness:2px
Line :Black COlor 
Size is : 20 units
Square
Drawing color:Orange
Thickness:3px
Line :Blue COlor 
Size is : 50 units
Circle
Drawing color:Purple
Thickness:5px
Line :Violet COlor 
Size is : 60 units
*/
  
