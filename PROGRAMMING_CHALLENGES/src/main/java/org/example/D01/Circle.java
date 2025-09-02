package org.example.D01;

import org.example.constants.MathConstant;

import static org.example.constants.MathConstant.PI;
//import static org.example.constants.MathConstant.pi;

class Circle {
    private double radius;
    private double area;
    public double getRadius(){                                // read write property
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;                                // what is variable shadowing
//        this.area = 3.14 * radius * radius;                // never use magic numbers in code
//        MathConstant m1  = new MathConstant();
//        this.area = m1.pi * radius * radius;
//        pi = 100;
//        this.area = pi * radius * radius;
        this.area = PI * radius * radius;


    }
    public double getArea(){                                //  read only property
        return area;
    }

}
// write constructor for circle class
// Write toString method in circle class
// what is default constructor
// input = "2H 3D 5S 9C KD 2C 3H 4S 8C AH"
// expected output =
// duice of hearts
// three of diamond
// five of spread
// nine of club
// king of diamond
// duice of club
// three of heart
// four of spread
// eight of club
// ace of heart

