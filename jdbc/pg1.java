import java.sql.*;
public class pg1 {
    public static void main(String[] args) {
        String url="jdbc:oracle.com:thin:@localhost:1521:xe";
        Connection conn=DriverManager.getConnection(url,"system","manager");
        Statement st=conn.createStatement();
        try{
            st.executeUpdate("DROP TABLE java.test");
        }catch(Exception e){
            e.printStackTrace();
        }
        st.executeUpdate("CREATE TABLE java_test (id NUMBER PRIMARY KEY,name VARCHAR(20))");
        System.out.println("Table created");
        st.executeUpdate("INSERT INTO java_test VALUES(1,'a')");
        st.executeUpdate("INSERT INTO java_test VALUES(2,'b')");
        st.executeUpdate("INSERT INTO java_test VALUES(3,'c')");
        System.out.println(" inserted to Table");

        ResultSet r=st.executeQuery("SELECT * FROM java_test");
        System.out.println("table content : ");
        while(r.next()){
            System.out.println(r.getInt(1)+" - "+r.getString(2));
        }
        r.close();
        st.close();
        conn.close();
    }

}
