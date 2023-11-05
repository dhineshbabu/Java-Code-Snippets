package gfgnotes.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Prob_GenerateNumberWithGivenDigits {
    /*
    generate first n numbers with combinations of 6 and 5
    like 5,6,55,56,65,66,555,565,...
    cer
     */
    public static void firstNPrint(int n) {
        Queue<String> queue = new LinkedList<>();

        //insert the first 2 items
        queue.offer("5");
        queue.offer("6");


        for(int i=0; i<n; i++){
            String curr = queue.poll();
            //print the value
            System.out.println(curr + " ");
            // add 5 and 6 with exiting combinations
            queue.add(curr + "5");
            queue.add(curr + "6");
        }
    }

    public static void main(String[] args) {
        firstNPrint(5);
    }
}
