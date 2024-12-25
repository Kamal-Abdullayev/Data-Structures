package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            arrayList.add(i);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - now));

        List<Integer> linkedList = new LinkedList<>();
        now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            linkedList.add(i);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - now));

    }

}