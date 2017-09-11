import java.util.*;

/* (Use iterators on linked lists) Write a test program that stores 5 million
integers in a linked list and test the time to traverse the list using an
iterator vs. using the get(index) method. */

public class Exercise_20_06
{
    public static void main(String[] args)
    {
        //create list of 5 million integers
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i<=5000000; i++)
        {
            arrayList.add(i);
        }
        //create linked list with 5 million integers
        LinkedList<Integer> linkedlist = new LinkedList<>(arrayList);

        //Start time of traversing list using iterator
        long iterateTimerStart = System.currentTimeMillis();

        //iterate
        ListIterator<Integer> listIterator = linkedlist.listIterator();
        while (listIterator.hasNext())
        {
            listIterator.next();
        }
        //end time of iterating
        long iterateTimerEnd = System.currentTimeMillis();

        //Show the time of traversing list using iterator
        System.out.println("Time taken to traverse list using an iterator: " + (iterateTimerEnd - iterateTimerStart) + " milliseconds");

        // Start time for traversing  list using get(index) method
        long getTimerStart = System.currentTimeMillis();
        for (int i = 1; i<=5000000; i++)
        {
            linkedlist.get(i);
        }
        long getTimerEnd = System.currentTimeMillis();

        //Show the time of traversing list using get(index)
        System.out.println("Time taken to traverse list using an get(index): " + (getTimerEnd - getTimerStart) + " milliseconds");

    }

}
