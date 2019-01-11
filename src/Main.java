//  Main.java
//  Sample Google API
//
//  Created by Mohammadreza on 10/7/18.
//  Copyright © 2019 Mohammadreza Mohades. All rights reserved.

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class Main extends Application {

        @Override
        public void start(Stage primaryStage) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Views/SearchView.fxml"));
                primaryStage.setTitle("MC Books Library Manager");
                primaryStage.setScene(new Scene(root, 600, 600));
                primaryStage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


        public static void main(String[] args) {
            launch(args);
        }
    }


