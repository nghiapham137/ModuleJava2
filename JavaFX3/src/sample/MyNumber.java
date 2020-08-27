package sample;
import javafx.beans.property.*;
public class MyNumber {
    private DoubleProperty numbers = new SimpleDoubleProperty();

    public double getNumbers() {
        return numbers.get();
    }

    public DoubleProperty numbersProperty() {
        return numbers;
    }

    public void setNumbers(double numbers) {
        this.numbers.set(numbers);
    }
}
