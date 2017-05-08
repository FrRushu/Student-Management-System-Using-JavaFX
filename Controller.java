package sample;


import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public TextField tname;
    public TextField tid;
    public TextField tmarks;
    public TextField tcontacts;

    public TextArea texta;


    public void buttonClicked(){

        texta.appendText(tname.getText()+"\t"+tid.getText()+"\t\t"+tmarks.getText()+"\t"+tcontacts.getText()+"\n");

    }
}
