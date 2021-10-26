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


    private Label l1;
	private Label l2;
	private Label l3;
	private Label l4;
	private Label l5;
	private Label l6;
	private Label l7;
	private Label l8;
	private Label l9;
	private Label l10;
	private Label l11;
	private Label l12;
	private Label l13;
	private Label l14;
	private Label l15;
	private Label l16;

	@Override
    public void start(Stage stage) {
    	GridPane root = new GridPane();
    	setUpRoot(root);
    	
    	initialisationLabels();
    	
    	addToRoot(root, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16);
    	
    	Label[] tabLabel = {l1, l2, l3, l4, l5, l6, l7, l8 , l9, l10, l11, l12, l13, l14, l15, l16};
    	
    	setUpLabels(tabLabel);
    	
    	Scene scene = new Scene(root, 720, 640);
    	stage.setScene(scene);
    	stage.setTitle("2048");
    	stage.show();
    	
    }

	private void initialisationLabels() {
		l1 = new Label();
    	l2 = new Label();
    	l3 = new Label();
    	l4 = new Label();
    	l5 = new Label();
    	l6 = new Label();
    	l7 = new Label();
    	l8 = new Label();
    	l9 = new Label();
    	l10 = new Label();
    	l11 = new Label();
    	l12 = new Label();
    	l13 = new Label();
    	l14 = new Label();
    	l15 = new Label();
    	l16 = new Label();
	}

	private void setUpRoot(GridPane root) {
		root.setCacheShape(true);
    	root.setAlignment(Pos.CENTER);
    	root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
	}

	private void addToRoot(GridPane root, Label l1, Label l2, Label l3, Label l4, Label l5, Label l6, Label l7,
			Label l8, Label l9, Label l10, Label l11, Label l12, Label l13, Label l14, Label l15, Label l16) {
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
	}

	private void setUpLabels(Label[] tabLabel) {
		for (Label l : tabLabel) {
    		l.setCenterShape(true);
    		l.setPadding(new Insets(20));
    		l.setTextFill(Color.WHITE);
    		l.setFont(new Font(60));
			l.setText("0");
		}
	}
    
    /**
     * Drag and drop : 
     * http://www.java2s.com/Tutorials/Java/JavaFX/1160__JavaFX_Drag_Drop.htm
     */


    public static void main(String[] args) {
    	Application.launch(args);
    }

}