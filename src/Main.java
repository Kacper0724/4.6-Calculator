public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sumAdd = calculator.add(10, 11.5);
        double sumSubstract = calculator.substract(10.5, 10);

        System.out.println(sumAdd);
        System.out.println(sumSubstract);
    }
}

class Calculator {
    public double add(double a, double b) {
        return a +b;
    }

    public double substract(double a, double b) {
        return a - b;
    }
}