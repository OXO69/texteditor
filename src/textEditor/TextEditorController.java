package textEditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.*;

public class TextEditorController {

    @FXML
    TextArea myTextFile;


    @FXML
    public void save() {
        String a = myTextFile.getText();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("a.txt"));
            writer.write(a);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

 /*       dostat text z textArea
        dopisat metodu na zapis do suboru.
        Pouzit Bufferedwriter na zapis do dokumentu */
        //nejaka zmena
    }

    public void initialize() {
        try {
//            FileReader i= new FileReader("a.txt");
            BufferedReader vstup = new BufferedReader(new FileReader("a.txt"));

            String b ;
            while ((b = vstup.readLine()) != null) {
                System.out.println(b);
                myTextFile.setText(b);
            }
            vstup.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
  /*      Nacitat textovy dokument
         zobrazit v textarea*/

    }


}
