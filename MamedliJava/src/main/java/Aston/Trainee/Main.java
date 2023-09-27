package Aston.Trainee;

import Aston.Trainee.Methods.Check;
import Aston.Trainee.Methods.Input;


public class Main {

    public static void main(String[] args) {
        // Составить алгоритм: если введенное число больше 7, то вывести “Привет”

        System.out.println("Привет, введи цифру: ");
        Check.checkSeven(Input.getLine());

        // Составить алгоритм: если введенное имя совпадает с Вячеслав,
        // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

        System.out.println("Привет, введи имя: ");
        Check.checkVyacheslav(Input.getLine());

        // Составить алгоритм: на входе есть числовой массив,
        // необходимо вывести элементы массива кратные 3

        System.out.println("Привет, введи числовой массив через пробелы: ");
        Check.checkArray(Input.getArray());
    }
}




