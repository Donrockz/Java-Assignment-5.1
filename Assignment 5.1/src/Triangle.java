
public class Triangle extends Figure {

	double area;
	double perimeter;
	int base;
	int side1;
	int side2;

	public Triangle(double dim1, int base) {
		super(dim1);
		this.base = base;

	}

	public Triangle(int base, int side1, int side2) {
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;

	}

	public static void main(String[] args) {

		Triangle a = new Triangle(15, 5);
		a.findArea();

		Triangle b = new Triangle(5, 12, 19);
		b.findPerimeter();
	}

	@Override
	void findArea() {

		area = (dim1 * base) / 2;
		System.out.println("Area of the Triangle is " + area);

	}

	@Override
	void findPerimeter() {

		perimeter = base + side1 + side2;
		System.out.println("Perimeter of the Triangle is " + perimeter);
	}

}
