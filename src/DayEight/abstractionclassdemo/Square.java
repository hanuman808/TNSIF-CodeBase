package DayEight.abstractionclassdemo;

public class Square extends Shape{
	float side;
	

	public Square(float side) {
		this.side=side;
	}
	public void calArea() {
		this.area=side*side;
	}
}
