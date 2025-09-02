package org.example.D01;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
//        c1.radius = 10;
//        c1.area = 3.14 * c1.radius * c1.radius;
//        System.out.println(c1.area);
//        c1.area = 500;
//        System.out.println(c1.area);

        c1.setRadius(10);
        System.out.println(c1.getRadius() + " : " + c1.getArea());

    }
}
