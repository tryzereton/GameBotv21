package net.ferhatkurt;

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;


public class Arayuz extends Application {
	

	
	double x =0, y=0;
	public Parent root;
	
		
    public void start(Stage primaryStage) throws Exception{
    	 
		Image i = new Image(getClass().getResourceAsStream("Logo_SON.png"));

        primaryStage.setTitle("Game Bot v2.0");
        primaryStage.getIcons().add(i);
       
        root = FXMLLoader.load(this.getClass().getResource("GameBotGUI.fxml"));
                        
        root.setOnMousePressed(new EventHandler<MouseEvent>() {

        	@Override
			public void handle(MouseEvent e) {
				x =	e.getSceneX();
				y = e.getSceneY();
										
			}
        	
        });
        
       
        root.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
				
				primaryStage.setX(e.getScreenX()-x);
				primaryStage.setY(e.getScreenY()-y);
				
			}
        	
        });
        
        
                
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);
    	primaryStage.setResizable(false);
    	primaryStage.requestFocus();
    	primaryStage.centerOnScreen();
    	primaryStage.show();
    	
    	primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
    		

			@Override
			public void handle(WindowEvent arg0) {
				System.exit(0);
				
			}
    		
    	});
    	
    }
    public static void main(String[] args) {
        launch(args);
        
    }
   	
}

        

