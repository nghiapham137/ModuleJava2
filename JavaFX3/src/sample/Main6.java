package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main6 {

    public static void main(String[] args) {
        MyNumber example = new MyNumber();
        example.numbersProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(observable);
            System.out.println(oldValue);
            System.out.println(newValue);
        });
        example.setNumbers(10);
        example.setNumbers(11);
    }



}
