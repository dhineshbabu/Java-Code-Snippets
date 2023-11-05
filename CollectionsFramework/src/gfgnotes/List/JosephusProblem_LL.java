package gfgnotes.List;

import java.util.Iterator;
import java.util.LinkedList;

public class JosephusProblem_LL {
    /*
    creata a circular linked list
    1. create linked list
    2. move the iterator to start once  the end is reached
     */

    public static int josephusProblem(int n, int k) {
        LinkedList<Integer> members = new LinkedList<>();
        //  add the members to the linked list
        for(int i=0; i<n; i++) {
            members.add(i);
        }

        // Initiate an iterator. once the hasNext() returns false, then initiate another iterator
        // to make it as a circularly linked list
        Iterator<Integer> it = members.iterator();

        // remove all members until the size is 1 and return the last person as survivor

        while(members.size() > 1) {
            int count = 0;
            // k is the token to be counted for each iteration for a member to be removed
            while(count < k) {
                while(it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                // if count is less than k, but hasNext() failed then we reached the end of the linked list
                // then initiate a new iterator to make it like circular
                if(count < k) {
                    it = members.iterator();
                    it.next();
                    count++;
                }
            }
            //if not then count is equal to K then remove the member
            it.remove();
        }

        // return the last available item in the member list
        return members.getFirst();
    }

    public static void main(String[] args) {
        /*
        n=7, k=3 then  output will be 3
         */

        System.out.println(josephusProblem(7, 3));
    }
}
