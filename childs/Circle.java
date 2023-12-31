package childs;

import parents.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        // TODO Auto-generated constructor stub
    }

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // override dan implementasi method abstract getArea untuk class circle
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
