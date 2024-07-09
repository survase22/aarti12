package aarti;

public class Rectangle {
	float width;
	float height;
	
	
	public Rectangle() {
		width=3.2f;
		height=2.0f;
	}
	public Rectangle(float width, float height) {
		
		this.width = width;
		this.height = height;
	}

	public void calArea() {
		this.area=width*height;
		
	}

}



