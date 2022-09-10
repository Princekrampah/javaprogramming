import java.sql.*;

public class DBOperations extends DBConnection {

    @Override
    public void insertOperation(String student_name, String student_course, String student_year) {
        String result = "";
        // create a local variable for the query
        String insertQuery = "INSERT INTO `student` (`student_name`, `student_course`, `student_year`) VALUES (?,?,?,?)";

        // create a preparedStatement
        PreparedStatement pst;

        try {
            pst = conn.prepareStatement(insertQuery);
            pst.setString(1, student_name);
            pst.setString(2, student_course);
            pst.setString(3, student_year);
            pst.executeUpdate();

            System.out.println("New student inserted");

        } catch (SQLException sqle) {
            System.out.println("Could not insert new student: " + sqle.getMessage());
        }
    }

    @Override
    public void updateOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void deleteOperation(int student_id) {
        String deleteQuery = "DELETE FROM 'quadrilaterals' WHERE id= ?";

        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(deleteQuery);
            pst.setInt(1, student_id);
            pst.executeUpdate();

            System.out.println("Student record deleted");

        } catch (SQLException sqle) {
            System.out.println("could not delete student details" + sqle.getMessage());
        }
    }

    public void selectOperation(String new_student_id) {
        try {

            String query = "SELECT* FROM  `students` WHERE `student_id`  " + new_student_id;
            // Create an object of the statement interface to hold

            PreparedStatement pst;

            pst = conn.prepareStatement(query);
            // Execute Statement
            // We create an object of the ResultSet interface to hold the result of
            // executing
            ResultSet rs;
            rs = pst.executeQuery();

            // Execute Process ResultSet
            while (rs.next()) {
                System.out.println(rs.getString("student_id") + "" + rs.getString("student_name"));
            }
            // Step 6: Close Connection
            conn.close();

        } catch (SQLException sqle) {
            System.out.println("Could not insert :" + sqle.getMessage());
        }
    }
}