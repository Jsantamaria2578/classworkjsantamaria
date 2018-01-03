package whackAMole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.*;
import javafx.scene.layout.FlowPane;
import java.lang.*;
public class setStage extends Application {

	public void start(Stage primaryStage) throws Exception{
		 
		primaryStage.setTitle("Whack a mole");
		Button button = new Button("dirty mole");
		button.setMaxSize(1200,10); // this will be the dimensions if the button is at the top
		button.setMinSize(1200,10);
		Label label = new Label("");
	//	HBox hbox = new HBox(button,label);
		
		Button button1 = new Button("dirty mole");
		button1.setShape(new Circle((2)));
		button1.setMaxSize(100,100);
		button1.setMinSize(100,100);
		FlowPane flowpane = new FlowPane();

		flowpane.getChildren().add(button);
		flowpane.getChildren().add(button1);
		
		//button.setVisible(false);
		//button1.setVisible(false);
		// if i have to make visibility differences the buttons will be relative to last? YES... 
		// flowpane.getChildren().clear(); THIS WORKS 
		flowpane.setVgap(250);
		flowpane.setHgap(250);
		
		button1.setOnAction(value ->  {
	           /*button1.setVisible(false);
	           flowpane.getChildren().clear();
	           flowpane.getChildren().add(button);
	           flowpane.getChildren().add(button1);				// this works but it may be a bit excessive. can i just change the gap midway 
	           flowpane.setVgap(100);								yes yes i can Q-Q
	           flowpane.setHgap(100);
	           button1.setVisible(true);
	           primaryStage.show();*/
			
			flowpane.setStyle("-fx-alignment : top-left");
			double verticalGap = Math.random() *690;// correct max based off top height and width
			double horizontalGap = Math.random() *600;			// solution: create a random set style, set button one to either the entire top or left hand edge of the screen
			flowpane.setVgap(verticalGap);						// then create a vgap if its at the top or hgap if its and the left
	           flowpane.setHgap(0);								// basically creating random intervals
	           
	        });
		
		Scene potato = new Scene(flowpane,1200,800);
		primaryStage.setScene(potato);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
			Application.launch(args);
	}

}
 