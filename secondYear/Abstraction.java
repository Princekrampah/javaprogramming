package secondYear;
// Abstraction can be achieved in two ways
// 1. Abstract classes
// 2. Interfaces

// An abstract class can not be instantiated.
// this is as they do not have a constractor.


abstract class Calc{

    // These are abstract methods and must be implemented by
    // whatever class that extends this abstract class.
    // abstract classes must have a parameter defined 
    // or (); without the {}. They contain only the signature of the
    // method.
    abstract public float add(float a, float b);
    abstract public float sub(float a, float b);

    // this is just a normal method that will be inherited.
    public float div; 

    public void sayHello(){
        System.out.println("Hello world");
    }
}



// A non-abstract class that is extending an abstract class
// MUST implement its methods.
abstract class CalcAbstract{}

class RealCalc extends Calc{
    public float add(float a, float b){
        return a + b;
    }

    public float sub(float a, float b){
        return a - b;
    }
}

// Implementation using interfaces
// by default all methods in an interface class are abstract 
interface Calc2{
    public float add(float a, float b);
    // you can use or not use the abstract method.
    abstract public float sub(float a, float b);
    public float div(float a, float b);
}

// a class that implements an interface must implement all its methods
// all methods in an interface are abstract by default.
class RealCalc2 implements Calc2{

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float sub(float a, float b) {
        return a - b;
    }

    @Override
    public float div(float a, float b) {
        return a / b;
    }
}

// difference between abstract class and an interface
// An abstract class permits you to make functionality 
// that subclasses can implement or override whereas an 
// interface only permits you to state functionality but 
// not to implement it. A class can extend only one abstract 
// class while a class can implement multiple interfaces.

public class Abstraction {
    public static void main(String[] args){
        RealCalc myCalc = new RealCalc();

        float result = myCalc.add(2.0F, 4.9F);

        // when dealing with an abstract class, we should by best practice
        // use the abstract class to create an instance of the child class
        // this is becuase, an abstract class contains both implemented and 
        // non-implemented classes. Hence we'll have access to both the abstract
        // methods and non abstract methods from the parent class.

        // If we create an object only using the child class that extends
        // the abstract class. We will MUST define the abstract methods but, you
        // won't have access to the other non-abstract methods in from the abstract
        // parent class.

        Calc myClac2 = new RealCalc();

        System.out.println(result);


        myClac2.sayHello();


        myCalc.sayHello();

    }    
}
