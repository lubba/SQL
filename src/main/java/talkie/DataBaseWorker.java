package talkie;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseWorker {

    private static boolean initialized = false;
    static int counter = 0;
    private static Connection connection;
    
    public static void init() {
        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver((Driver) Class.forName("com.mysql.jdbc.Driver").newInstance());
            initialized=true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unable to load the JDBC driver class");
        }
        connect();
    }

   

    public static void connect() {
        try {
            connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/talkie", "root", "");
            connection.createStatement().execute("set names cp1251");
        } catch (SQLException x) {
            x.printStackTrace();
            System.out.println("Couldn’t get connection!");
        }
    }

    public static void addAllAnswersToDatabase() throws SQLException {
    	if (!initialized) {
            init();
        }
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Of course you can!");
    	answers.add("Hmm.. You can try..");
    	answers.add("It is not good idea but you can try");
    	answers.add("You can but be careful");
    	answers.add("No-no-no!!");
    	answers.add("I said it to FBI. Wait");
    	System.out.println("in addAllAnsw");
    	System.out.println(answers);
        for (String s:answers){
            connection.createStatement().executeUpdate("insert into answers (ans) values (\"" + s + "\");");
            System.out.println(s);
        }
    }

    public static ArrayList<String> getAnswers() throws SQLException {
        ArrayList<String> outputList = new ArrayList<String>();

        PreparedStatement stmt = connection.prepareStatement("select * from answers;");
        ResultSet rs = stmt.executeQuery();
       // System.out.println("in addAllAnsw");
    	//System.out.println(answers);
        if (!rs.next()) {
            addAllAnswersToDatabase();
            return getAnswers();
        } else {
            rs.beforeFirst();
            while (rs.next()){
                outputList.add(rs.getString(1));
            }
            return outputList;
        }
    }

    public static void addQuestion(String a) {
        if (!initialized) {
            init();
        }
        try {
        	System.out.println("in add que");
        	String sql = "insert into questions (que) values (\"" + a + "\")";
        	System.out.println(sql);
            connection.prepareStatement(sql).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }


    }


}