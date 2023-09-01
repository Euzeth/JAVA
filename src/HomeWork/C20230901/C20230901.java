package HomeWork.C20230901;



abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class C20230901 {
	
	public static void main(String[] args) {
		
		//도형을 나타내는 추상 클래스 "Shape"을 정의하세요. 이 클래스는 추상 메서드 "calculateArea"를 가지고 있어야 합니다. 
		//이 메서드는 각 도형의 면적을 계산하고 반환해야 합니다.
		//도형 클래스 "Shape"을 상속받아 구체적인 도형 클래스인 "Circle" (원)과 "Rectangle" (직사각형)을 구현하세요. 
		//각 도형 클래스에서는 "calculateArea" 메서드를 구현하여 해당 도형의 면적을 계산하고 반환하세요.
		
		// 원 생성 및 면적 계산
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        System.out.println("원의 면적: " + circleArea);

        // 직사각형 생성 및 면적 계산
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("직사각형의 면적: " + rectangleArea);
		
	}
}
