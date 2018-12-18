
public class Rectangle {

	private double area;
	private int length;
	private int breadth;
	private boolean flag;

	public double getArea(int length,int breadth) {
		area=length*breadth;
		return area;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public boolean compareAreaIsSAme(Rectangle rec1, Rectangle rec2) {
	flag=(getArea(rec1.length,rec2.breadth)==getArea(rec2.length,rec2.breadth)? true:false);
	return flag;
	}

}
