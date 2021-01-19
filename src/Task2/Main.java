package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольника: ");
        Rectangle rectangle = new Rectangle(in.nextDouble(), in.nextDouble());

        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator() +
                "\nПериметр прямоугольника: " + rectangle.perimetrCalculator());
    }
}
