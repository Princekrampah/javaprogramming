public class part_07 {
    // Inheritance
    public static void main(String[] args) {

        Boy James = new Boy();

        James.isMale();

    }
}

// in Java we use the terms super-class and subclass . Single level inheritance
// is the one in which a given class inherits the methods and attibutes of one
// and only one other class. Multi-level inheritance is when a given class has
// inherited from another class that was in a single inheritance chain. Example
// Male class is of single inheritance type while Boy class is of multiple
// inheritance class.

// Unlike other programming languages like Python Java does not support multiplt
// inheritance, it only supports single inheritance.

// In Java there are two types of relationships 'IS-A' and 'HAS-A'. IS-A is when
// a class extends another class. HAS-A is when a class has the object of
// another class inside of it. Example the class containing the main method has
// a HAS-A relationship with other classes since the objects of other classes
// can be created inside of it.

// Java does not support multiple inheritance, take an example of a multiple
// inheritance scenerio in which both super classes of the sub-class have the
// same method. In such a case, Java will be confused as to what super class
// method to use since both are the same, to avoid this confusion java does not
// support multiple inheritance. This is unlike in Python where we have a Method
// Resolution Order to tackle this issue.

class Animal {
    public void isAnimal() {
        System.out.println("is animal");
    }
}

class Human extends Animal {
    public void isHuman() {
        System.out.println("is Human");
    }
}

class Male extends Human {
    public void isMale() {
        System.out.println("is Male");
    }
}

class Boy extends Male {
    public void isBoy() {
        System.out.println("Is boy");
    }
}
