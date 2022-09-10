public class Test {
    public static void main(String[] args) {
        DBConnection dbc = new DBOperations();
        dbc.selectOperation("136669");
        dbc.deleteOperation(200);
        dbc.insertOperation("John Doe","BBIT", "2022");
    }
}