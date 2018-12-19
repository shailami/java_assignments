
public class Triangle {
	private int length1;
	private int length2;
	private int length3;
	private boolean flag;
	

	public Triangle(int length1, int length2, int length3) {
		this.length1=length1;
		this.length2=length2;
		this.length3=length3;
	}

	public int getLength1() {
		return length1;
	}

	public void setLength1(int length1) {
		this.length1 = length1;
	}

	public int getLength2() {
		return length2;
	}

	public void setLength2(int length2) {
		this.length2 = length2;
	}

	public int getLength3() {
		return length3;
	}

	public void setLength3(int length3) {
		this.length3 = length3;
	}

	public boolean isRight(Triangle triangle) {
		if(triangle.length1>triangle.length2 && triangle.length1>triangle.length3)
		{
			if((triangle.length1*triangle.length1)==(triangle.length2*triangle.length2+triangle.length3*triangle.length3))
			{
				flag=true;
			}
			else flag=false;
		}
		else if(triangle.length2>triangle.length3)
		{
			if((triangle.length2*triangle.length2)==(triangle.length1*triangle.length1+triangle.length3*triangle.length3))
			{
				flag=true;
			}
			else flag=false;
		}
		else
		{
			if((triangle.length3*triangle.length3)==(triangle.length1*triangle.length1+triangle.length2*triangle.length2))
			{
				flag=true;
			}	
			else flag=false;
		}
		return flag;
	}

	public boolean isScalene(Triangle triangle) {
		flag=(triangle.length1!=triangle.length2&&triangle.length2!=triangle.length3)?true:false;
		System.out.println(flag);
		return flag;
	}

	public boolean isIsosceles(Triangle triangle) {
		flag=((triangle.length1==triangle.length2)&&!(triangle.length1==triangle.length3))||((triangle.length1==triangle.length3)&&!(triangle.length1==triangle.length2))||((triangle.length2==triangle.length3)&&!(triangle.length3==triangle.length1))?true:false;
		System.out.println(flag);
		return flag;
	}

	public boolean isEquilateral(Triangle triangle) {
		flag=(triangle.length1==triangle.length2&&triangle.length2==triangle.length3)?true:false;
		System.out.println(flag);
		return flag;
	}

}
