import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

public class StudentCRUD {

    public void insertStudent(String name, int marks) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students(name, marks) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, marks);

            ps.executeUpdate();
            System.out.println("Student Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM students";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateStudent(int id, int newMarks) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "UPDATE students SET marks=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, newMarks);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Student Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteStudent(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "DELETE FROM students WHERE id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Student Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}