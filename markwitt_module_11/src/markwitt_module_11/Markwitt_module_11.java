/*
Mark Witt
CSD-405
Module 11 Assignment
*/
package markwitt_module_11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.*;
import javafx.scene.layout.VBox;


public class Markwitt_module_11 extends Application{
    
    @Override
    public void start(Stage stage){
        //create v boxes radio buttons and checkboxes
        VBox radioBox = new VBox(20);
        VBox checkBox = new VBox(20);

        //create label
        Text labelText = new Text("Pick-A-Shape-o-nator-2000:");
        labelText.setFill(Color.BLACK);
        labelText.setFont(Font.font(null, FontWeight.SEMI_BOLD, 20));
        HBox label = new HBox();
        label.setPadding(new Insets(10,10,10,10));
        label.getChildren().add(labelText);
        label.setAlignment(Pos.CENTER);
    
        //create radio buttons
        RadioButton circleBtn = new RadioButton("Circle");
        RadioButton rectangleBtn = new RadioButton("Rectangle");
        RadioButton ellipseBtn = new RadioButton("Ellipse");
        
        //create reset button & reset pane
        Button clearBtn = new Button("Reset All");
        HBox clear = new HBox();
        clear.setAlignment(Pos.CENTER);
        clear.getChildren().add(clearBtn);

        //create check box for color fill
        CheckBox fillBox = new CheckBox("Fill with\nRandom Color");
        
        //setup radioBox pane
        radioBox.getChildren().addAll(circleBtn, rectangleBtn, ellipseBtn);
        radioBox.setAlignment(Pos.CENTER_LEFT);
        radioBox.setStyle("-fx-border-color: black");
        radioBox.setPadding(new Insets(5, 5, 5, 5));
        
        //setup toggle group for radio buttons so only one is active at a time
        ToggleGroup radioGroup = new ToggleGroup();
        circleBtn.setToggleGroup(radioGroup);
        rectangleBtn.setToggleGroup(radioGroup);
        ellipseBtn.setToggleGroup(radioGroup);

        //setup checkBox pane
        checkBox.getChildren().add(fillBox);
        checkBox.setAlignment(Pos.CENTER);
        checkBox.setStyle("-fx-border-color: black");
        checkBox.setPadding(new Insets(5, 5, 5, 5));
        
        //setup shape pane
        HBox shape = new HBox();
        shape.setPadding(new Insets(40, 40, 40, 40));
        shape.setAlignment(Pos.CENTER);

        //create overall pane and add boxes to pane
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(20, 20, 20, 20));
        pane.setTop(label);
        pane.setLeft(radioBox);
        pane.setRight(checkBox);
        pane.setCenter(shape);
        pane.setBottom(clear);
        pane.setPrefSize(450, 275);
        //set scene & stage
        Scene scene = new Scene(pane);
        stage.setTitle("Module 11 Assignment - Mark Witt");
        stage.setScene(scene);
        stage.show();
        
        //setup circle
        Circle circle = new Circle(40);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        //setup Rectangle
        Rectangle rect = new Rectangle(70,40);
        rect.setStroke(Color.BLACK);
        rect.setFill(Color.WHITE);
        
        //setup ellipse
        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.WHITE);

        //handle event        
        //determine which shape and fill selected
        //changes fill color first, then clears shape pane children
        //finally adds new updated shape to shape pane 
        EventHandler<ActionEvent> handler = e -> {
            //if circle with random selected:
            if (fillBox.isSelected() && circleBtn.isSelected()){
                circle.setFill(Color.color (Math.random(), Math.random(), Math.random()));
                shape.getChildren().clear();
                shape.getChildren().add(circle);
            }
            //if circle with no fill selected:
            else if (!fillBox.isSelected() && circleBtn.isSelected()){
                circle.setFill(Color.WHITE);
                shape.getChildren().clear();
                shape.getChildren().add(circle);
            }
            //if rectangle with fill selected:
            else if (fillBox.isSelected() && rectangleBtn.isSelected()){
                rect.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                shape.getChildren().clear();
                shape.getChildren().add(rect);
            }
            //if rectangle and no fill selected:
            else if (!fillBox.isSelected()&& rectangleBtn.isSelected()){
                rect.setFill(Color.WHITE);
                shape.getChildren().clear();
                shape.getChildren().add(rect);
            }
            //if ellipse with fill selected: 
            else if (fillBox.isSelected() && ellipseBtn.isSelected()){
                ellipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                shape.getChildren().clear();
                shape.getChildren().add(ellipse);
            }
            //if ellipse with no fill selected:
            else if (!fillBox.isSelected() && ellipseBtn.isSelected()){
                ellipse.setFill(Color.WHITE);
                shape.getChildren().clear();
                shape.getChildren().add(ellipse);
            }
            
        };
        
        //setup onEvent to call handler for each button/checkbox
        fillBox.setOnAction(handler);
        circleBtn.setOnAction(handler);
        rectangleBtn.setOnAction(handler);
        ellipseBtn.setOnAction(handler);
        clearBtn.setOnAction(e -> {
            shape.getChildren().clear();
            fillBox.setSelected(false);
            circleBtn.setSelected(false);
            rectangleBtn.setSelected(false);
            ellipseBtn.setSelected(false);
        });
        
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
