package whackAMole;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.shape.*;
public class setStage extends Application {

	public void start(Stage primaryStage) throws Exception{
		 
		primaryStage.setTitle("Whack a mole");
		Button button = new Button("dirty mole");
	/*	button.setMaxSize(145.00, 75.00);
		button.setMinSize(145.00, 75.00);
		button.setPrefSize(145.00, 75.00);*/
		button.setShape(new Circle((2)));
		button.setMaxSize(100,100);
		button.setMinSize(100,100);
		Label label = new Label("");
		HBox hbox = new HBox(button,label);

		Scene potato = new Scene(hbox,1200,800);
		primaryStage.setScene(potato);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
			Application.launch(args);
	}

}
 