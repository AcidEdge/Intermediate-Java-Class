/* 
Mark Witt
CSD-405
Module 8 Assignemnt
*/

package markwitt_module_8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.layout.BorderPane;



public class Markwitt_module_8 extends Application {

    @Override
    public void start(Stage stage){
        //create ArrayList of cards (create deck of cards):
        ArrayList<String> deck = new ArrayList<>();
        for(int i = 1; i<55;i++){
            deck.add(i+".png");
        }
        //shuffle the deck:
        java.util.Collections.shuffle(deck);
        
        //create label
        Text label = new Text("Your Hand:");
        label.setFill(Color.WHITE);
        label.setFont(Font.font(null, FontWeight.BOLD, 30));
        label.setTranslateX(100);
        
       //create hbox to display cards        
        HBox cards = new HBox();
        cards.setAlignment(Pos.CENTER);
        cards.setSpacing(5);
        //add cards to hbox
        cards.getChildren().add(new ImageView(new Image("/cards/"+deck.get(0))));
        cards.getChildren().add(new ImageView(new Image("/cards/"+deck.get(1))));
        cards.getChildren().add(new ImageView(new Image("/cards/"+deck.get(2))));
        cards.getChildren().add(new ImageView(new Image("/cards/"+deck.get(3))));
        cards.getChildren().add(new ImageView(new Image("/cards/"+deck.get(4))));
        
        //create overall pane for display
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color:Green");
        pane.setPadding(new Insets(10, 25, 30, 25));
        //add label and cards panes to border pane
        pane.setTop(label);
        pane.setCenter(cards);
        //setup the scene with border parent pane & set stage
        Scene scene = new Scene(pane);
        stage.setTitle("My Cards");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
