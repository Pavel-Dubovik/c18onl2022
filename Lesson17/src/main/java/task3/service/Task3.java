package task3.service;

import task3.model.MinMax;

public class Task3 {

//     * 3)Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
//     * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
//     * Написать метод принимающий MinMax объект и печатающий информацию об элементах.

    public static void main(String[] args) {
        Double[] numbersDouble = {1.2, 2.2, 89.2, 19032.23, 23.22323};
        Integer[] numbersInteger = {123, 32, 23145432, 231};
        MinMax<?> minMaxDouble = new MinMax<>(null);
        MinMax<Integer> minMaxInteger = new MinMax<>(numbersInteger);
        printMinAndMaxValue(minMaxDouble);
        getInfo(minMaxDouble);
        printMinAndMaxValue(minMaxInteger);
        getInfo(minMaxInteger);
    }

    private static void printMinAndMaxValue(MinMax<?> minMax) {
        System.out.println("Минимальный элемент " + minMax.getMin() + "\n" + "Максимальный элемент " + minMax.getMax());
    }

    private static void getInfo(MinMax<?> minMax) {
        for (int i = 0; i < minMax.getArrayOfNumbers().length; i++) {
            System.out.println("Элемент " + minMax.getArrayOfNumbers()[i] + " типа " + minMax.getArrayOfNumbers()[i].getClass().getName());
        }
        System.out.println();
    }
}