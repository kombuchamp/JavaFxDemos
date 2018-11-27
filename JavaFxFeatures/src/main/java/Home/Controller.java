package Home;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

// Класс-контроллер для scene. Здесь находится логика работы с view
public class Controller {
    // Тип и название совпадают с типом и id в fxml-файле.
    // С помощью аннотации получаем ссылки на соответствующие ноды
    @FXML
    private TextField mFormula;
    @FXML
    private LineChart<Double, Double> mLineChart;
    @FXML
    private TextArea mTxtOutput;

    // Обработчик события нажатия на кнопку (задается в fxml)
    public void btnClick(ActionEvent actionEvent) {
        System.out.printf("Formula: %s%n", mFormula.getText());

        try {
            Model.plotToChart(mLineChart, mFormula.getText());
        } catch (Exception e) {
            mTxtOutput.appendText(e.getMessage());
            mTxtOutput.appendText("\r\n");
        }


    }
}
