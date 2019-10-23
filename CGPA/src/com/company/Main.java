package com.company;
import java.sql.*;


public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/rbeeazeez/IdeaProjects/CGPA/cgpa.db");
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM students");

            while (res.next()) {
                int csc103score = res.getInt("CSC103");
                int csc203score = res.getInt("CSC203");
                int csc303score = res.getInt("CSC303");
                int csc403score = res.getInt("CSC403");
                int csc503score = res.getInt("CSC503");
                int csc603score = res.getInt("CSC603");
                int csc703score = res.getInt("CSC703");
                int csc803score = res.getInt("CSC803");
                int csc903score = res.getInt("CSC903");
                int csc102score = res.getInt("CSC102");
                int csc202score = res.getInt("CSC202");
                int csc302score = res.getInt("CSC302");
                int csc402score = res.getInt("CSC402");
                int csc502score = res.getInt("CSC502");
                int csc602score = res.getInt("CSC602");
                int csc702score = res.getInt("CSC702");
                int csc802score = res.getInt("CSC802");
                int csc902score = res.getInt("CSC902");
                int csc301score = res.getInt("CSC301");
                int csc501score = res.getInt("CSC501");

                int[] allCourseScores = {csc103score, csc203score, csc303score, csc403score, csc503score, csc603score,
                        csc703score, csc803score, csc903score, csc102score, csc202score, csc302score, csc402score,
                        csc502score, csc602score, csc702score, csc802score, csc902score, csc301score, csc501score};

                String[] allCourses = {"CSC 103", "CSC 203", "CSC 303", "CSC 403", "CSC 503", "CSC 603", "CSC 703",
                        "CSC 803", "CSC 903", "CSC 102", "CSC 202", "CSC 302", "CSC 402", "CSC 502", "CSC 602", "CSC 702",
                        "CSC 802", "CSC 902", "CSC 301", "CSC 501"};

                String nameOfStudent = res.getString("name");

                for(int i = 0; i < allCourseScores.length; i++) {
                    System.out.println(allCourseScores[i]);
                }
                res.close();



                statement.close();
                conn.close();
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    static int gradePoint(int score) {
        int gradepoint;
        if(score >= 70) {
            gradepoint = 7;
        } else if(score > 64 && score <=69) {
            gradepoint = 6;
        } else if(score > 59 && score <=64) {
            gradepoint = 5;
        } else if(score > 54 && score <=59) {
            gradepoint = 4;
        } else if(score > 49 && score <=54) {
            gradepoint = 3;
        } else if(score > 44 && score <=49){
            gradepoint = 2;
        }else if (score > 39 && score <=44){
            gradepoint = 1;
        }else
            gradepoint = 0;
        return gradepoint;
    }
}