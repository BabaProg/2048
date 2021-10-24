package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Main extends Application {


    @Override
    public void start(Stage stage) {
    	GridPane root = new GridPane();
    	root.setCacheShape(true);
    	root.setAlignment(Pos.CENTER);
    	root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
    	
    	Label l1 = new Label();
    	Label l2 = new Label();
    	Label l3 = new Label();
    	Label l4 = new Label();
    	Label l5 = new Label();
    	Label l6 = new Label();
    	Label l7 = new Label();
    	Label l8 = new Label();
    	Label l9 = new Label();
    	Label l10 = new Label();
    	Label l11 = new Label();
    	Label l12 = new Label();
    	Label l13 = new Label();
    	Label l14 = new Label();
    	Label l15 = new Label();
    	Label l16 = new Label();
    	
    	root.add(l1, 0, 0);
    	root.add(l2, 0, 1);
    	root.add(l3, 0, 2);
    	root.add(l4, 0, 3);
    	
    	root.add(l5, 1, 0);
    	root.add(l6, 1, 1);
    	root.add(l7, 1, 2);
    	root.add(l8, 1, 3);
    	
    	root.add(l9, 2, 0);
    	root.add(l10, 2, 1);
    	root.add(l11, 2, 2);
    	root.add(l12, 2, 3);
    	
    	root.add(l13, 3, 0);
    	root.add(l14, 3, 1);
    	root.add(l15, 3, 2);
    	root.add(l16, 3, 3);
    	
    	Label[] tabLabel = {l1, l2, l3, l4, l5, l6, l7, l8 , l9, l10, l11, l12, l13, l14, l15, l16};
    	
    	for (Label l : tabLabel) {
    		l.setCenterShape(true);
    		l.setTextFill(Color.WHITE);
    		l.setFont(new Font(60));
			l.setText("0");
		}
    	
    	Scene scene = new Scene(root, 720, 640);
    	stage.setScene(scene);
    	stage.setTitle("2048");
    	stage.show();
    	
    }


    public static void main(String[] args) {
    	Application.launch(args);
    }

}