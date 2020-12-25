public class part_06 {

    // Imagine you want to create a method that adds up  numbers, the thing is you don't know how any numbers the user will decide to pass at the point of creating the method. The best thing to do is to create a method with a varargs as the parameter. When the user passes in the arguments at the point of calling the method, the values will be passed as an array to the function.
    public static void main(String[] args) {

        add(1, 2, 3);

    }

    public static void add(int ...num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }
}


