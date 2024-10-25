package lesson_3_6;

public class Main {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(5);
        Dice dice3 = new Dice(6);
        dice1.setValue(dice2.getValue());

        System.out.println(dice1 == dice3);
        System.out.println(dice1.equals(dice3));
        System.out.println(dice1 == dice2);
        System.out.println(dice1.equals(dice2));

    }
}
