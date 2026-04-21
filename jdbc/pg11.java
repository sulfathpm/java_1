import java.sql.*;

public class pg1 {
    // Added 'throws Exception' here to satisfy the compiler
    public static void main(String[] args) throws Exception {
        
        // Corrected URL: added 'thin' and removed '.com'
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        
        Connection conn = DriverManager.getConnection(url, "system", "manager");
        Statement st = conn.createStatement();
        
        try {
            // Note: Changed to java_test to match your CREATE statement
            st.executeUpdate("DROP TABLE java_test");
        } catch(Exception e) {
            System.out.println("Table didn't exist yet, that's fine.");
        }
        
        st.executeUpdate("CREATE TABLE java_test (id NUMBER PRIMARY KEY, name VARCHAR(20))");
        System.out.println("Table created");
        
        st.executeUpdate("INSERT INTO java_test VALUES(1,'a')");
        st.executeUpdate("INSERT INTO java_test VALUES(2,'b')");
        st.executeUpdate("INSERT INTO java_test VALUES(3,'c')");
        System.out.println("Inserted to Table");

        ResultSet r = st.executeQuery("SELECT * FROM java_test");
        System.out.println("Table content: ");
        while(r.next()) {
            System.out.println(r.getInt(1) + " - " + r.getString(2));
        }
        
        r.close();
        st.close();
        conn.close();
    }
}
