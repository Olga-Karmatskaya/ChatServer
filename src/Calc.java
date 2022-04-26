import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double val1;
        double val2;
        char operand;
        double result;
        System.out.println("Введите первый операнд:");
        val1 = scanner.nextDouble();
        System.out.println("Введите оператор:");
        operand = scanner.next().charAt(0);
        System.out.println("Введите второй операнд:");
        val2 = scanner.nextDouble();
        result = calculate(val1, val2, operand);
        System.out.println(val1+" "+operand+" "+val2+"="+result);
    }
    public static double calculate(double val1,double val2,char operand){
return switch (operand){
    case '+' -> val1+val2;
    case '-' -> val1-val2;
    case '*' -> val1*val2;
    case '/' -> val1/val2;
    default -> {
        System.out.println("Wrong operand");
        yield 0;
    }
};
    }
}
