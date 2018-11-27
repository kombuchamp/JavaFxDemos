package Home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    /**
     * Точка входа в приложение. Запускает метод launch класса Application
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    // Вызывается при инициализации приложения. Базовая реализация пустая.
    @Override
    public void init() { }

    // Вызывается при завершении приложения. Базовая реализация пустая.
    @Override
    public void stop() { }

    /**
     * Вызывается при запуске приложения. Внутри необходимо
     * создать исходную scene приложения и отобразить его. Вся
     * дальнейшая работа с gui происходит в контроллере.
     * @param stage Главный Stage приложения
     * @throws Exception
     */
    public void start(Stage stage) throws Exception {

        // Создание корневой ноды, загрузка в него дерева
        // нодов из fxml-файла
        String fxmlFile = "/fxml/main_layout.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = loader.load(getClass().getResourceAsStream(fxmlFile));

        // Создание scene с корневой нодой, добавление css-ки
        Scene scene = new Scene(rootNode, 1024, 768);
        scene.getStylesheets().add("/styles/styles.css");

        // Подготовка и отображение stage
        stage.setTitle("JavaFxFeatures");
        stage.setMinWidth(800);
        stage.setMinHeight(600);
        stage.setScene(scene);
        stage.show();
    }
}
