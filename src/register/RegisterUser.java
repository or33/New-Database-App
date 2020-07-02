/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author kezia
 */
public class RegisterUser extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        
        Parent root = (Parent)FXMLLoader.load(getClass().getResource("RegisterUser.fxml"));
        primaryStage.setTitle("Resiter New User");
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/save-money.png")));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
