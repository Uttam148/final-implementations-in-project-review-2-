package com.cybercrafters;

import com.cybercrafters.controller.StudentController;
import com.cybercrafters.service.StudentService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/com/cybercrafters/views/main.fxml"));
        
        Parent root = loader.load();
        StudentController controller = loader.getController();
        controller.setStudentService(new StudentService("binary"));
        
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Student Database Management");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
