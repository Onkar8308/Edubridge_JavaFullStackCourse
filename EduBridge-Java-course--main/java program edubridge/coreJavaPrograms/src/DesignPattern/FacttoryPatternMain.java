package DesignPattern;

interface Shape{
	void draw();
}

class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub;
		System.out.println("This is square draw method");
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is the circle Draw method");
	}	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is rectangle Draw Mthod");
		
	}
	
}
class Factory{
	Shape obj ;
	public Shape getObject(String str) {
		if(str.equalsIgnoreCase("Circle")) {
		 obj = new Circle();
		return obj;
		}
		else if(str.equalsIgnoreCase("Rectangle")) {
			obj = new Rectangle();
			return obj;
		}
		else if(str.equalsIgnoreCase("Square")) {
			obj = new Square();
			return obj;
		}
		else
		return null;
	}
	
	
}

public class FacttoryPatternMain {
	public static void main(String[] args) {
		
		Factory fobj = new Factory();
		Shape obj = fobj.getObject("circle");
		obj.draw();
	}

}
