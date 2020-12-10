package neco;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class data {
    private Object meno;
    private String prieyvisko;
    private String vek;
    private String id;
    private String sqlinsert;

    public void main(String[] args) throws SQLException {
try {
    

            String url = "jdbc:h2:C:\\Users\\Kucka\\IdeaProjects\\skola";
            String name = "sa";
            String pass = "sa";
            Statement stmt;
            Connection connection = DriverManager.getConnection(url, name, pass);



            Statement statement = connection.createStatement();
            String sql="CREATE TABLE   POKUS"+
                   "(id INTIGER not NULL)" +
                    "priezvisko VARCHAR(255)"+
                    "vek INTIGER"+
                    "PRIMARY KEY(id)";
            statement.execute(sql);
            System.out.println("vytvor tabulku POKUS");
    statement.execute(sqlinsert);
            System.out.println("vlozeny zaznam ");
            connection.close();










            //            String sqlinsert="INSERT INTO TESTTRI VALUES(2,'Nicolas','Kucka',20);";
//            String meno = this.meno.getText().trim();
//            String priezvisko=this.prieyvisko.getText().trim();
//        String vek=this.vek.getText().trim();
//        String id=this.id.getText().trim();
//        String insert="INSERT INTO TESTTRI VALUES("+id+""

} catch (SQLException ex){
    System.out.println(ex);
}
    }
}


