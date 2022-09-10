package ru.zanuda.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */
public class Main {
    public static void main(String[] args) {

        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false
        fuzzySearch("",null);


    }
    static boolean fuzzySearch(String s1, String s2) {

        if (s1.isEmpty()|| s1 == null || s2.isEmpty()|| s2 == null) return false;

        List<String> list1 = new ArrayList(Arrays.asList(s1.split("")));
        List<String> list2 = new ArrayList(Arrays.asList(s2.split("")));

        list2.retainAll(list1);

        return list1.equals(list2);
    }

}
