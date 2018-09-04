package Calculator;
/**
 *  Наследник класс
 *  переопределение Calculate +
 */
public class Summ extends Calculator {
    @Override
    void Calculate(){
        System.out.println(x + y);
    }
}
