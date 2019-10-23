import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class Myfirs{
    public static void main(String[]args){
        try{
            //Connection conn = DriverManger.getConnection("jdbc:sqlite:/home/rbeeazeez/IdeaProjects/DataBase/testjava.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/rbeeazeez/IdeaProjects/DataBase/testjava.db");
            Statement statement = conn.createStatement();
             statement.execute("CREATE TABLE IF NOT EXISTS studentsData (name TEXT, phone INTEGER, email TEXT)");

            statement.execute("INSERT INTO studentsData (name,phone, email ) VALUES ('Robiat', 09088993993, 'rr@bc.com') ");

            statement.close();
            conn.close();


        }catch(SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}