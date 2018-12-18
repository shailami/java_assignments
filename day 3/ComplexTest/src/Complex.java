
public class Complex {

	private double real;
	private double imaginary;
	private double sumReal;
	private double sumImaginary;


	public Complex(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex()
	{
		
	}

	public void set(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}

	public void display() {
		System.out.println(+this.real+"+"+this.imaginary);
		
	}

	public Complex sum(Complex complex1, Complex complex2) {
		sumReal=(complex1.real+complex2.real);
		sumImaginary=(complex1.imaginary+complex2.imaginary);
	   
	     return new Complex(sumReal,sumImaginary) ;
	}

	public double getReal() {
		
		return real;
	}

	public double getImaginary() {
		
		return imaginary;
	}

}
