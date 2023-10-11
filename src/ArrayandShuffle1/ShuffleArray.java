package ArrayandShuffle1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.println("Shuffled array:");
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}

