	package whackAMole;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.*;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.*;
import javafx.scene.layout.FlowPane;
import java.lang.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;
import java.awt.*;
public class setStage extends Application {
	int count = 0;
	Label score = new Label("" + count);
	Label timer = new Label("");
	int timeLeft = 0;
	boolean start = false;
	long secondcounter = System.nanoTime();
	public void start(Stage primaryStage) throws Exception{
		 
		//int count = 0;
	//	 Label score = new Label("" + count);
		primaryStage.setTitle("Whack a mole");
		Button button = new Button("dirty mole");
		button.setMaxSize(1200,10); // this will be the dimensions if the button is at the top
		button.setMinSize(1200,10);
		HBox hbox = new HBox(button,score);
		
		Button button1 = new Button("dirty mole");
		button1.setShape(new Circle((2)));
		button1.setMaxSize(100,100);
		button1.setMinSize(100,100);
		Pane flowpane = new Pane();

		flowpane.getChildren().add(button);
		flowpane.getChildren().add(button1);
		flowpane.getChildren().add(hbox);
		flowpane.getChildren().add(timer);
		//hbox.setStyle("-fx-alignment : top-center");
		hbox.setTranslateX(550);
		hbox.setTranslateY(75);
		timer.setTranslateX(550);
		timer.setTranslateY(125);
		button1.setTranslateX(500);
		button1.setTranslateY(300);
		//score.setAlignment(Pos.CENTER);
		button.setVisible(false);
		//button1.setVisible(false);
		// if i have to make visibility differences the buttons will be relative to last? YES... 
		// flowpane.getChildren().clear(); THIS WORKS 
		score.setStyle("-fx-font-size : 30pt; -fx-text-fill : #228b22");
		button1.setOnAction(value ->  {
			hbox.setTranslateX(550);
		           /*button1.setVisible(false);
	           flowpane.getChildren().clear();
	           flowpane.getChildren().add(button);
	           flowpane.getChildren().add(button1);				// this works but it may be a bit excessive. can i just change the gap midway 
	           flowpane.setVgap(100);								yes yes i can Q-Q
	           flowpane.setHgap(100);
	           button1.setVisible(true);
	           primaryStage.show();*/
			//flowpane.setStyle("-fx-alignment : " + styleListTop[random]);
			count++;
			score.setText("" + count);
				button1.setTranslateX(Math.random() * 900);
				button1.setTranslateY((Math.random() * 500) + 100);
				if(timeLeft == 0) {
					timeLeft = 10;
					timer.setText("" + timeLeft);
					secondcounter = System.nanoTime() + 1000000000L;
					new AnimationTimer() {	
						@Override
						public void handle(long now) {
							// TODO Auto-generated method stub
							if(timeLeft == 0) {
								button1.setTranslateX(500);
								button1.setTranslateY(300);
								score.setText("Wow you got a score of " + count + " nice job! Whack the mole to start again");
								hbox.setTranslateX(25);
								count = 0;
								start = false;
								stop();
							}
						   if(now > secondcounter) {
								timeLeft = timeLeft - 1;
								timer.setText("" + timeLeft);
								secondcounter += 1000000000L;
								
							}
						}
						
					}.start();
				}
	        });
		Scene potato = new Scene(flowpane,1200,800);
		primaryStage.setScene(potato);
		primaryStage.show();
	}
	
	public static void main(String[] args) throws IOException {
			Application.launch(args);
			try (BufferedWriter pw = new BufferedWriter(new FileWriter("scores.csv"))){
				String potato = "Name,High Score\n";
				pw.write(potato);
				pw.close();
			}
			catch(FileNotFoundException e){
				System.err.println(e);
			}
			
	}

}
 