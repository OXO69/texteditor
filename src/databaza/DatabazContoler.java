package databaza;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executor;

public class DatabazContoler {
    @FXML
    TextField id;
    @FXML
    TextField meno;
    @FXML
    TextField priezvisko;
    @FXML
    TextField vek;
    @FXML
    TextArea select;

    @FXML
    public void save() {
        String Db_URL="jdbc:h2:tcp://localhost/C:\\Users\\Kucka\\IdeaProjects\\skola";
        String USER="sa";
        String Pass="sa";
        String localId=id.getText().trim();
      String localVek=vek.getText().trim();
      String localMeno=meno.getText().trim();
      String localPriezvisko=priezvisko.getText().trim();

String sql="INSERT INTO TESTTERI VALUES("+localId+",'"
                                       +localMeno+",'"
                                        +localPriezvisko+",'"
                                         +localVek +");";
        try {

            Connection spojenie= DriverManager.getConnection(Db_URL,USER,Pass);
            Statement prikaz=spojenie.createStatement();
            prikaz.execute(sql);
            spojenie.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    @FXML
    public void load() {

    }

}