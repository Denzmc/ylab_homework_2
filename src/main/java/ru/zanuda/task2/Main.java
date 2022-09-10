package ru.zanuda.task2;
/*
       Task2

           [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
        */
public class Main {
    public static void main(String[] args) {


        int [] arr = {3, 4, 2, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (i == j) continue;
                if ((arr[i] + arr[j]) == 10){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                    return;
                }
            }
        }

    }
}
