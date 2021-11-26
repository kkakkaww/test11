package test11;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object1 = new Object();
		Object object2 = new Object();
		
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof Circle) {
			System.out.println("The circle area is "+
				((Circle)object).getArea());
			System.out.println("The circle diameter is "+
					((Circle)object).getDiamter());
		}
		else if (object instanceof Rectangle) {
			System.out.println("The rectangle area is "+
					((Rectangle)object).getArea());
		}
	}
}
