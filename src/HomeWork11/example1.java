package HomeWork11;

/**
 * project : Bootcamp1
 * package : HomeWork11
 * author  : Allamuradov Tal'at
 * date    : 08.09.2022_23:43
 */
public class example1 {
    public static void main(String[] args) {
        System.out.println("|=== === === === === === EXAMPLE 1 === === === === === ===|");
        B1 ba1 = new B1();
        System.out.println(ba1.Method(5));
        System.out.println("|=== === === === === === EXAMPLE 2 === === === === === ===|");
        Circle circle =new Circle(5);
        Triangle triangle =new Triangle(3,5,7);
        Rectangle rectangle = new Rectangle(2,6);
        System.out.println("circle => "+circle.getSquare());
        System.out.println("Perimeter => "+triangle.getPerimeter());
        System.out.println("Square => "+triangle.getSquare());
        System.out.println("|=== === === === === === EXAMPLE 3 === === === === === ===|");
        B3 b31=new B3(12);
        B3 b32=new B3(15);
        b31.equals(b32);
        B3 b35=new B3(13);
        B3 b36=b35;
        b35.equals(b36);
        System.out.println("|=== === === === === === EXAMPLE 4 === === === === === ===|");

    }
}
abstract class A1 {
    private int field;

    protected int Method(int temp) {
        return field = temp;
    }
}

class B1 extends A1 {
    @Override
    public int Method(int temp) {
        return super.Method(temp);
    }
}

abstract class Shape {
    abstract double getPerimeter();

    abstract float getSquare();
}

abstract class ShapeAngles extends Shape {
    @Override
    double getPerimeter() {
        return 0;
    }
}

class Circle extends ShapeAngles {
    int raduis;

    public Circle(int raduis) {
        this.raduis = raduis;
    }

    @Override
    float getSquare() {
        return (float) (Math.PI * Math.pow(raduis, 2));
    }

}

class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    float getSquare() {
        return a * b;
    }
}

class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    float getSquare() {
        float p = (float) (getPerimeter() / 2);
        return (float) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

abstract class A3 {
    abstract float getAge3();

    @Override
    public boolean equals(Object obj) {
        System.out.println("R=> : " + super.equals(obj));
        return super.equals(obj);
    }
}

class B3 extends A3 {
    private int age3;

    public B3(int age3) {
        this.age3 = age3;
    }

    @Override
    float getAge3() {
        return age3;
    }
}

class A4{
    private A4() {

    }
    A4 getInstance(){
        return new A4();
    }
}





