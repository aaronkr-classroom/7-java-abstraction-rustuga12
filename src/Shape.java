
public abstract class Shape {
	String color;
	
	abstract double area();
	public abstract String toString();
	

	public shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	//일반 메서드를 생성
	public String getColor() {
		return color;
	}
}