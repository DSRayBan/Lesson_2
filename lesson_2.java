
package ru.geekbrains.lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(within10and20B(1,2));
        PositiveOrNegative(777);
        System.out.println(isNegative(-15));
        printWordNTimes(3, "Hoorey");

    }
    public static boolean within10and20B(int a, int b) {
        int c = a + b;
        return (10 <= c && c <= 20);
    }

    public static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static boolean isNegative(int a) {
        if (a <= 0) return true;
        return false;
    }

    public static void printWordNTimes(int a, String b) {
        for (int i = 0; i < a; i++) {
            System.out.println(b);
        }
    }
}
