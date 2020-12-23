public class part_03 {

    // method overloading, this is a form of polymorphism in which a single method
    // can have multiple signature(parameters) to support operations of different
    // nature. This concept can also be applied to constructors and its refered to
    // as constructor overloading.

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 4));
        System.out.println(calc.add(2.5, 4.7));
        System.out.println(calc.add(7, 4, 6));
        System.out.println(calc.add(2.3, 4, 6.8));
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b, double c) {
        return a + b + c;
    }
}
