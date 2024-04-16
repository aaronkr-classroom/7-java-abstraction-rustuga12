
public class Rectangle extends Shape {
	double length;// 반지름
	double width; // 세로	
	
	public Rectangle(String color, double length, double width) {
		super(color); //부모 클래스의 생성자 호출
		System.out.println("Circle 클래스의 생성자 호출");
		this.length = length;
		this.width = width;
	}
	//추상 메서드를 정의 
	double area() {
		return length * width;// Math에서 pi변수 있다.
		
	}
	
	public String toString() {
		return "사각형 색상은 " + super.getColor() +
				"그리고 면적은" + area();
	}
}
