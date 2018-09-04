package Calculator;

import java.util.Random;
import java.util.Scanner;

/**
 * на одни и те же цифры объявить 3 разных объекта
 */
public class Main {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        Summ b = new Summ();
        Div c = new Div();
        a.Calculate();
        b.Calculate();
        c.Calculate();
    }
}
