/*
Mark Witt
CSD-405
Module 7
Code Portion of Assignment
Example of HBox and GridPane
Opens 2 windows (Stages), one with HBox layout 
and the other with GridPane layout
*/
package markwitt_module_7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
/**
 *
 * @author markw
 */
public class Markwitt_module_7 extends Application{

    @Override
    public void start(Stage stage){
        stage.setTitle("HBox Example");
        HBox hbox = new HBox(6);
        hbox.setAlignment(Pos.CENTER);
        for (int i=0; i<6; i++){
            hbox.getChildren().add(new Button("button " + (int)(i + 1)));
        }
        Scene scene = new Scene(hbox, 500, 200);
        stage.setScene(scene);
        stage.show();
        
        Stage stage2 = new Stage();
        stage2.setTitle("GridPane Example");
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        int btnNum = 1;
        for(int i=0; i<3; i++){
            for(int j =0; j<3; j++){
                gridpane.add(new Button("button " + btnNum), j, i);
                btnNum++;
            }
        }
        stage2.setScene(new Scene(gridpane, 300, 150));
        stage2.show();
        
        
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
