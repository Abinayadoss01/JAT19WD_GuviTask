package OopsConcepts;

public class Circle {
	int radius=2;
	
	
	public Circle(int i) {
		double c=2*3.14*i;
		System.out.println("Circumference of a circle"+c);
	}


	public Circle() {
		this.radius=radius;
	}


	public void Circumference() {
		double c=2*3.14*radius;
		System.out.println("Circumference of a circle"+c);
	}
	

	public static void main(String[] args) {
		// Creating constructor without arguments
		Circle cir = new Circle();
		cir.Circumference();
		// Creating constructor with arguments
		Circle cir1 = new Circle(3);
		cir1.Circumference();
	}
}
