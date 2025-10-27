package session6.D_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

    public static void main(String[] args) {
        List<String> cards = new LinkedList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");

        cards.remove(1);

        int index = cards.indexOf("Ten of Hearts");
        System.out.println(index);

        //Print all elements of the list using a for-loop
        for (String cardq43134 : cards) {

            System.out.println(cardq43134);

        }

    }

}
