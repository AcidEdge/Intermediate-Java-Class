/* 
Mark Witt
CSD-405
Module 10 Assignemnt
display 5 random cards from a deck with a refresh button underneath the cards
that will randomly redraw 5 different cards and change them on in the javafx 
window
*/

package markwitt_mod_10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class Markwitt_mod_10 extends Application {
    //initialize deck ArrayList:
    private ArrayList<Integer> deck = new ArrayList<>();  
    
    
    @Override
    public void start(Stage stage){
        //popluate ArrayList deck with card list:
        for(int i = 1; i<55;i++){
            deck.add(i);
        }
        //shuffle the deck:
        java.util.Collections.shuffle(deck);
        
        //create label
        Text label = new Text("Your Hand:");
        label.setFill(Color.WHITE);
        label.setFont(Font.font(null, FontWeight.BOLD, 30));
        //create StackPane for label, then set allignemnt/positioning
        StackPane labels = new StackPane();
        labels.getChildren().add(label);
        labels.setPadding(new Insets(20, 10, 20, 10));
        labels.setAlignment(Pos.CENTER);
        
        //create button pane and button
        StackPane buttons = new StackPane();
        Button newDeal = new Button("Deal New Hand");
        buttons.getChildren().add(newDeal);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(30, 10, 10, 10));
        
        
        //create hbox of cards
        HBox cards = new HBox();
        cards.setAlignment(Pos.CENTER);
        cards.setSpacing(5);
        // get cards add cards to hbox
        ImageView card1 = new ImageView(new Image("/markwitt_mod_10/cards/"+deck.get(0)+".png"));
        ImageView card2 = new ImageView(new Image("/markwitt_mod_10/cards/"+deck.get(1)+".png"));
        ImageView card3 = new ImageView(new Image("/markwitt_mod_10/cards/"+deck.get(2)+".png"));
        ImageView card4 = new ImageView(new Image("/markwitt_mod_10/cards/"+deck.get(3)+".png"));
        ImageView card5 = new ImageView(new Image("/markwitt_mod_10/cards/"+deck.get(4)+".png"));
        cards.getChildren().add(card1);
        cards.getChildren().add(card2);
        cards.getChildren().add(card3);
        cards.getChildren().add(card4);
        cards.getChildren().add(card5);
       
        //create overall pane for display
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color:Green");
        pane.setPadding(new Insets(10, 25, 30, 25));
        //add label and cards panes to border pane
        pane.setTop(labels);
        pane.setCenter(cards);
        pane.setBottom(buttons);
        //setup the scene with border parent pane & set stage
        Scene scene = new Scene(pane);
        stage.setTitle("Your Cards");
        stage.setScene(scene);
        stage.show();
        
        //button handler - shuffle deck and refresh images
        newDeal.setOnAction((ActionEvent e) -> {
            java.util.Collections.shuffle(deck);
            card1.setImage(new Image("/markwitt_mod_10/cards/"+deck.get(0)+".png"));
            card2.setImage(new Image("/markwitt_mod_10/cards/"+deck.get(1)+".png"));
            card3.setImage(new Image("/markwitt_mod_10/cards/"+deck.get(2)+".png"));
            card4.setImage(new Image("/markwitt_mod_10/cards/"+deck.get(3)+".png"));
            card5.setImage(new Image("/markwitt_mod_10/cards/"+deck.get(4)+".png"));
        });
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}


