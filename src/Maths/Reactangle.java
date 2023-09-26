package Maths;

public class Reactangle {
	int length , breadth;
	   
	public Reactangle(int len, int bre) {
		
		this.length = len;
		this.breadth = bre;
	}
	public int getArea() {
		int area = this.length * this.breadth;
		return area;
	}


}
