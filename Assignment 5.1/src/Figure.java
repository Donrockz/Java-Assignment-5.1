
public abstract class Figure {

	double dim1;

	public Figure(double dim1) {
		this.dim1 = dim1;
	}

	public Figure() {

	}

	abstract void findArea();

	abstract void findPerimeter();

}
