
public class Rectangle extends Figure {

	double area;
	double perimeter;
	int width;

	public Rectangle(double dim1, int width) {
		super(dim1);
		this.width = width;

	}

	public static void main(String[] args) {

		Rectangle R = new Rectangle(19, 5);
		R.findArea();
		R.findPerimeter();
	}

	@Override
	void findArea() {
		area = dim1 * width;
		System.out.println("Area of the Rectangle is " + area);

	}

	@Override
	void findPerimeter() {
		perimeter = 2 * (dim1 + width);
		System.out.println("Perimeter of the Rectagle is " + perimeter);

	}

}
