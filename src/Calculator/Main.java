package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator sum = new Sum();
        Calculator sub = new Sub();
        Calculator div = new Div();
        sum.calculate(4, 9);
        sub.calculate(4, 9);
        div.calculate(4, 0);
    }
}
