package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcDemos {

	public static void main(String[] args) 
	{
		Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro", "root", "S@isrujan123");

            st = con.createStatement();

            rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                int age=rs.getInt("age");
                String course=rs.getString(4);
                double marks=rs.getDouble(5);
                

                System.out.println(id + " " + name + " " +age + " " + course+" "+marks);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (st != null)
                    st.close();
                if (con != null)
                    con.close();
            } catch (Exception e) {
                System.out.println("Finally Block::" + e);
            }
        }
    }

}


/*
 * 1 satya 22 cse 98.0
2 sai 20 cse 96.0
3 kiran 23 ese 89.0
4 rooha 21 eee 92.0
5 srujan 20 cse 94.0
*/
