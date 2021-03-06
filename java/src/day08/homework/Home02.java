package day08.homework;

//2. MyShape클래스를 상속받는 MyLine,MyRect클래스를
//만들고 draw메소드를 오버라이딩해보세요
//
//[ 출력결과 ]
//x좌표:100,y좌표:200의 위치에 사각형을 빨강색으로 그려요.
//x좌표:100,y좌표:200의 위치에 직선을 파란색으로 그려요.
//class MyShape{
//	protected int x,y;//x,y좌표
//	private String color;//색상
//	public MyShape(int x,int y,String color){
//		this.x=x;
//		this.y=y;
//		this.color=color;
//	}
//	public String getColor(){
//		return color;
//	}
//	public void draw(){
//		System.out.println("x좌표:"  + x + "y좌표:" + y +"의 위치에"+ color );
//	}
//}
public class Home02 {
	public static void main(String[] args) {
		System.out.println("[출력결과]");
		MyLine ml = new MyLine(100, 200, "빨강");
		ml.draw();
		MyRect mr = new MyRect(100, 200, "주황");
		mr.draw();
	}
}

class MyShape {
	protected int x, y;// x,y좌표
	private String color;// 색상

	public MyShape(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void draw() {
		System.out.println("x좌표:" + x + "y좌표:" + y + "의 위치에" + color);
	}
}

class MyLine extends MyShape {
	private String color2;

	public MyLine(int x, int y, String color) {
		super(x, y, color);
		color2 = color;
	}

	public void draw() {
		System.out.println("x좌표:" + x + "y좌표: " + y + "의 위치에 직선을 " + color2 + "색 으로 그려요.");
	}

}

class MyRect extends MyShape {
	private String color2;

	public MyRect(int x, int y, String color) {
		super(x, y, color);
		color2 = color;
	}

	public void draw() {
		System.out.println("x좌표:" + x + "y좌표: " + y + "의 위치에 사각형을 " + color2 + "색 으로 그려요.");
	}
}