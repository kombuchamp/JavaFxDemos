package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layout/sample.fxml"));

        primaryStage.setTitle("The title");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


        // Код ниже генерирует и показывает второе окно (без использования xml)
        /*
        Stage stage = new Stage();
        VBox vBox = new VBox();
        Button btn = new Button("CREATING CONTROLS FROM CODE");
        vBox.getChildren().add(btn);
        Scene s = new Scene(vBox);
        stage.setScene(s);
        stage.show();
        */

    }


    public static void main(String[] args) {
        launch(args);
    }
}
