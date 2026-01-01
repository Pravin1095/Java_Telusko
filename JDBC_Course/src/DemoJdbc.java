import javax.xml.transform.Result;
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception{

        /*
        Import package
        Load and Register
        Create connection
        Create Statements
        Execute Statement
        Process Result
        Close connection
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "Prav@9184";  // password that we set
        String sql = "select sname from students where sid = 1";
        String sql2 = "select * from students";
        String insertQuery = "insert into students values(5,'John', 48)";
        String updateQuery = "update students set sname='Max' where sid=5";
        String deleteQuery = "delete from students where sid=5";

        //Creating connection
        Connection conn = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");

        //Creating and Executing a statement
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery(sql2); //Response from the executed query is stored in rs

        //rs.next() is necessary so that when you want output of row , the pointer
        //will be moved according to rs.next(), it moves to row by row and then getString fetches the name
//        System.out.println(rs.next()+ " "+ rs.getString("sname")); //rs.next() returns true if the row is present else false


        //Fetching all records
//        while(rs.next()){
//            System.out.println(rs.getInt(1) +" - "+rs.getString(2)+ " - "+rs.getInt(3));
//        }

        //Inserting
//        st.execute(insertQuery);

        //Update
//        st.execute(updateQuery);

        //Delete
//        st.execute(deleteQuery);


        //Prepared statement
        //Many times we would be setting the data that is coming from frontend ,so
        //we won't be hardcoding the values in the statements. Instead we would be
        //passing the values to the query. Hence to pass a value it is difficult to
        //concatenate those values. Also the queries that we execute are each time going
        //from Java to database , hence performance can be improved if these statements are
        //cached. So here we use the PreparedStatement for this

        int sid = 5;
        String sname  = "Lavanya";
        int marks = 70;

        String sqlp = "insert into students values(?,?,?)";
        PreparedStatement st = conn.prepareStatement(sqlp);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);
        //With above setMethods we can set column index and values for inserting
        st.execute();

        //Closing connection

        conn.close();
        System.out.println("Connection closed");



    }
}
