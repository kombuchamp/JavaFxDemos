package Home;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.ValidationResult;

// Класс-model в архитектуре mvc. Здесь я расположил некоторую бизнес-логику, никак не связанную с отображением.
class Model {
    static void plotToChart(LineChart<Double, Double> lineChart, String formula) throws Exception {
        Expression exp;
        try {
            exp = new ExpressionBuilder(formula)
                    .variable("x")
                    .build();
        } catch (Exception e) {
            System.out.printf("Invalid formula %n");
            throw new Exception("Invalid formula");
        }

        XYChart.Series<Double, Double> newSeries = new XYChart.Series<>();
        newSeries.setName(formula);

        double evaluationResult;
        try {
            for (double i = -100; i < 100.; i++) {
                exp.setVariable("x", i);
                evaluationResult = exp.evaluate();

                newSeries.getData().add(new XYChart.Data<>(i, evaluationResult));
            }
        } catch (ArithmeticException e) {
            System.out.printf("Cannot divide by zero :(%n");
            throw new Exception("exp4j can't divide doubles by zero (for some reason)");
        } catch (Exception e) {
            System.out.printf("SOMETHING FAILED%n");
            throw e;
        }

        lineChart.getData().add(newSeries);

    }
}

