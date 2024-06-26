package javafxmlapplication;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.Charge;

public class ChargePruebaController {

    @FXML
    private Text name;
    @FXML
    private Button buttonMover;
    @FXML
    private Text price;
    @FXML
    private StackPane back;
    @FXML
    private Text date;

    private int pos;
    private Node node;
    ChargeViewerController fatherController;
    ChargePruebaController cPC;
    //In order to move the node inside the screen
    private double x, y, xL, yL;
    double getX(){ return this.x; }
    double getY(){ return this.y; }
    void setX( double x ){ this.x = x; }
    void setY( double y ){ this.y = y; }
    double getXL(){ return this.xL; }
    double getYL(){ return this.yL; }
    void setXL( double x ){ this.xL = x; }
    void setYL( double y ){ this.yL = y; }
    String getName(){ return this.name.getText(); }
    void setName(String name)
    {
        this.name.setText(name);
    }
    void setDate(String date){
        this.date.setText(date);
    }
    void setPrice(String price)
    {
        this.price.setText(price);
    }


    void setFatherController(ChargeViewerController fatherController, Node node, ChargePruebaController cPC){
        this.fatherController = fatherController;
        this.node = node;
        this.cPC = cPC;
    }

    StackPane getBack()
    {
        return back;
    }
    @FXML
    void move(MouseEvent event) {
        //fatherController.moveCat(node, event, cPC);
    }
    @FXML
    void moving(MouseEvent event)
    {
        //fatherController.movingCat(node, event, cPC);
    }
    @FXML
    void moved(MouseEvent event) {
        //fatherController.movedCat(node, event, cPC);
    }
}
