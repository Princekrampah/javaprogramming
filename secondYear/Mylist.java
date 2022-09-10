import java.util.ArrayList;

public class Mylist{
    public static void main(String[] args){

        // primary DS
        String[] names = new String[3];
        names[0] = "Hellen";
        names[1] = "Doe";
        names[2] = "Sam";
        
        for(int i = 0; i < 3; i++){
            System.out.println(names[i]);
        }

        // array list
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Hellen");
        myList.add("Doe");
        myList.add("Sam");

        for(int i = 0; i < myList.size(); i++){
            System.out.print(myList.get(i));
        }
    }
}