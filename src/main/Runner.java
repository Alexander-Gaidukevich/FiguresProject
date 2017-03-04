package main;

import beans.CircleFurniture;
import beans.SquareFurniture;

public class Runner {
    public static void main(String[] args) {
        // создание обекта класса SquareFurniture
        SquareFurniture squareFurniture = new SquareFurniture(2, 3); //создание обьекта
        
        //сохраняем площадь обьекта в переменной Square.
        double squareRectangle = squareFurniture.getSquareFiguare();
        System.out.println("S = " + squareRectangle);

        double perimeter = squareFurniture.getPerimeter();
        System.out.println("P = " + perimeter);

        // создание обекта класса CircleFurniture
        CircleFurniture circleFurniture = new CircleFurniture(5);

        double squareCircle = circleFurniture.getSquareFiguare();
        System.out.println("S2 = " + squareCircle);

        double perimeterCircle = circleFurniture.getPerimeter();
        System.out.println("P2 = " + perimeterCircle);
    }
}
