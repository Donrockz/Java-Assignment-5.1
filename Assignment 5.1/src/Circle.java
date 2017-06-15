
public class Circle extends Figure {

	double area;
	double perimeter;
	int radius;

	public Circle(double dim1, int radius) {
		super(dim1);
		this.radius = radius;
	}

	public static void main(String[] args) {

		Circle fig = new Circle(3.14, 5);
		fig.findArea();
		fig.findPerimeter();
	}

	@Override
	void findArea() {

		this.area = dim1 * radius * radius;
		System.out.println("Area of the circle is " + area);

	}

	@Override
	void findPerimeter() {

		this.perimeter = 2 * dim1 * radius;
		System.out.println("Perimeter of the circle is " + perimeter);
	}

}
