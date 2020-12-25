public class part_09 {
    public static void main(String[] args) {

        B obj = new B();

        obj.call();

    }
}

// Method overloading, we use the @Override to annotate overriding. This helps
// to prevent logial errors like typos. What if I want to override the method
// but still call the super class methos? To achieve this we use the super
// keyword. When ever you want to access anything(methods, attributs) from the
// super class use the super keyword


// When you extend a class, methods are overriden, but fields are hidden.
// Dynamic dispatch works for methods, but not for fields. Why is the language
// designed so, god knows why.

class A {
    public void call() {
        System.out.println("in call A");
    }
}

class B extends A {
    @Override
    public void call() {
        super.call();
        System.out.println("in call B");
    }
}
