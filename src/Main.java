
//реализуйте метод int min(int a, int b, int c), находящий минимальный из трех аргументов

import java.util.Scanner;
public class Main {
    public static int minFunction(int a, int b, int c) { //Метод находящий минимальный из трех аргументов
        int min;
        if (a > b)
            min = b;
        else
            min = a;
        if (min > c)
            min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ВВедите первое число");
        int Ch1  = in.nextInt();
        System.out.print("ВВедите второе число");
        int Ch2  = in.nextInt();
        System.out.print("ВВедите третье число");
        int Ch3 = in.nextInt();
        int y = minFunction(Ch1,Ch2,Ch3);
        System.out.println(y);
    }
}
