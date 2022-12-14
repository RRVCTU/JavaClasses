package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {

// This is the time for Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(0,"Test");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("LinkedList: "+(endTime-startTime));

// This is the time for Array List
        ArrayList<String> arrayList = new ArrayList<>();
        long startTimeA = System.currentTimeMillis();
        for (int i=0; i < 1000000; i++) {
            arrayList.add(0,"Test");
        }
        long endTimeA = System.currentTimeMillis();
        System.out.println("Array List: " +(endTimeA-startTimeA));

    }
}
