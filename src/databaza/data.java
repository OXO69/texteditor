package databaza;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;


public class data {
    @FXML
 TextField meno;
    @FXML
    TextField priezvisko;
@FXML
TextField vek;
@FXML
    TextField id;
@FXML
    TextArea select;


@FXML
public void save() {
    try (Connection connection = initDb()) {
        Statement statement = connection.createStatement();
        String sqInsert = "INSERT INTO  VALUES(2,'Nicolas','Kucka',25);";
        String meno = this.meno.getText().trim();
        String prezvisko = this.priezvisko.getText().trim();
        String vek = this.vek.getText().trim();
        String id = this.id.getText().trim();
        String insert = "INSERT INTO TESTTERI VALUES(" + id + "." + meno + "." + prezvisko + "." + vek + ");";
      boolean vysledok=  statement.execute(insert);

    } catch (SQLException ex) {
        System.out.println(ex);
    }

}
private Connection initDb()throws SQLException {
    String Db_URL=" jdbc:h2:C:\\Users\\Kucka\\IdeaProjects\\skola";
    String USER="sa";
    String Pass="sa";


    return DriverManager.getConnection(Db_URL,USER,Pass);
}
@FXML
    private void loadTable(){
    try (Connection connection=initDb()){
        try {
            Statement statement =connection.createStatement();
            String dalsi="select+from TESTERI";
            String vysledok="";
            ResultSet rs=statement.executeQuery(dalsi);
            while (rs.next());

        } catch (SQLException exception) {
            exception.printStackTrace();

        }

    } catch (SQLException exception) {
        exception.printStackTrace();
    }
}
}




