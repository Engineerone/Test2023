package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("word");
        list.add("wor");
        list.add("wordsdf");
        list.add("wordcxvczxcv");
        list.add("wordzxcvzxcvxz");
        list.add("wo");
        List<String> filter = list.stream().filter(p->p.length()<4).collect(Collectors.toList());
        System.out.println(filter);
    }
}
