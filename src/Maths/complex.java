package Maths;

public class complex {
	public double real;
	public double imaginary;
	

	public complex(double real, double imaginary) {

		this.real = real;
		this.imaginary = imaginary;
	}

	public complex add( complex complex2) {
		complex temp = new complex(.0,.0);
		temp.real = this.real + complex2.real;
		temp.imaginary = this.imaginary + complex2.imaginary;
		return temp;

	}

}
