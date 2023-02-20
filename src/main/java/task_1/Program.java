package task_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        float s=0;
        array.add(1);
        array.add(10);
        array.add(5);
        array.add(7);
        array.add(0);
        array.add(4);
        System.out.println(Collections.max(array));
        System.out.println(Collections.min(array));
        for (int i:array) {
            s+=(float)i/ array.size();
        }
        System.out.println(s);
    }
}






