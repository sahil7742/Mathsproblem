package Maths;

public class sumcomplex {

	public static void main(String[] args) {
		complex real,imag,result;
		//creating two complex item
		real = new complex(2.8,6.7);
		imag = new complex(8.9,2.6);
	
		// add complex 
		result = real.add(imag);
		System.out.println(" complex number sum = " + result.real + " + " + result.imaginary + "i");
		
	}

}
