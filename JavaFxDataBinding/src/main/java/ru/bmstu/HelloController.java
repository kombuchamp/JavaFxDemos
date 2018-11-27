package ru.bmstu;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HelloController {
    // Свойство в джаве
    private StringProperty prop = new SimpleStringProperty("Binded value");

    // Геттер для свойства
    public StringProperty propProperty() {
        return prop;
    }

    // Геттер для значения свойства
    public String getProp() {
        return prop.get();
    }

    // Сеттер для значения свойства
    public void setProp(String value) {
        prop.set(value);
    }
}