package lesson_3_6;

import java.util.Objects;

public class Dice {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dice dice = (Dice) o;
        return value == dice.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
