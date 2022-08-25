package secondYear;
class Farmers{
    // instance variables
    public String name;
    public int id;
    public int age;
    public String skills;
    public String emailAddress;
    // local variables
    private String country = "Kenya";
    private String city = "Mombasa";
    // class variables
    public static double interestRate = 10.9;
    public static double incomeTax = 2.0;


    public Farmers(String name, int id, int age, String skills){
        this.name = name;
        this.id = id;
        this.age = age;
        this.skills = skills;
    }

    public void platCrops(){}

    public void waterCrops(){}

    public void feedAnimals(){}

    public void sellProduce(){}

}

class Customer{
    public String name;
    public int id;
    public String city;
    public String comment;
    public String address;
    // class variables
    public static double interestRate = 10.0;
    public static String country = "Kenya";
    // local variables
    private String customerLocation = "Kenya";
    private int customerInterestRate = 10;

    public Customer(String name, int id, String city, String comment){
        this.name = name;
        this.id = id;
        this.city = city;
        this.comment = comment;
    }

    public void contactFarmer(){}

    public void buysProduce(){}

    public void sendMoney(){}

    public void comments(){}

    public void bargains(){}
}


class Produce{
    // instance variables
    public String name;
    public int id;
    public String category;
    public String color;
    public String quality;
    // class variables
    public static double interestRate = 10.0;
    public static String country = "Kenya";
    // local variables
    private String customerLocation = "Kenya";
    private int customerInterestRate = 10;

    public Produce(String name, int id, String category, String color){
        this.name =  name;
        this.id = id;
        this.category = category;
        this.color = color;
    }


    public void bePlanted(){}

    public void grow(){}

    public void eat(){}

    public void reproduce(){}

    public void areHavested(){}


}

public class FarmSystem {
    public static void main(String[] args){
        

        // farmers objects
        Farmers farmer1 = new Farmers("First Farmer", 20, 40, "Farming and harvesting");
        Farmers farmer2 = new Farmers("Second Farmer", 1, 50, "Communication and plating");

        // Customer objects
        Customer customer1 = new Customer("First customer", 2, "Nairobi", "Farmer from Nairobi, kenya");
        Customer customer2 = new Customer("Second customer", 23, "Mombasa", "Kenyan farmer from Mombasa");

        // Produce objects
        Produce produce1 = new Produce("Milk", 22, "Dairy", "White");
        Produce produce2 = new Produce("Flour", 34, "Whole grains", "White");
    }
}
