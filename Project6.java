//Ricky Espino

import java.util.*;

public class Project6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //making array of input
        int size = Integer.parseInt(in.nextLine().trim());
        String[] words = new String[size];
        for(int i = 0; i < size; i++){
            words[i] = in.nextLine().trim();
        }

        //copies of original array
        String[] sWords = Arrays.copyOf(words, words.length);
        String[] iWords = Arrays.copyOf(words, words.length);
        String[] hWords = Arrays.copyOf(words, words.length);
        String[] mWords = Arrays.copyOf(words, words.length);
        String[] qWords = Arrays.copyOf(words, words.length);

        //Selection Sort
        SelectionSort s = new SelectionSort(sWords);
        long startTime = System.currentTimeMillis();
        s.sort();
        long endTime = System.currentTimeMillis();
        long selectionTime = endTime-startTime;
        int selectionComp = s.comparisons();

        //Insertion Sort
        InsertionSort i = new InsertionSort(iWords);
        long startTime2 = System.currentTimeMillis();
        i.sort();
        long endTime2 = System.currentTimeMillis();
        long insertionTime = endTime2-startTime2;
        int insertionComp = i.comparisons();

        //Heapsort
        HeapSort h = new HeapSort(hWords, size);
        long startTime3 = System.currentTimeMillis();
        h.sort();
        long endTime3 = System.currentTimeMillis();
        long heapTime = endTime3-startTime3;
        int heapComp = h.comparisons();

        //Merge Sort
        MergeSort m = new MergeSort(mWords);
        long startTime4 = System.currentTimeMillis();
        m.sort();
        long endTime4 = System.currentTimeMillis();
        long mergeTime = endTime4-startTime4;
        int mergeComp = m.comparisons();

        //Quicksort
        QuickSort q = new QuickSort(qWords);
        long startTime5 = System.currentTimeMillis();
        q.sort();
        long endTime5 = System.currentTimeMillis();
        long quickTime = endTime5-startTime5;
        int quickComp = q.comparisons();

        //Output
        System.out.println("Algorithm       | Comparisons     | Time (Milliseconds)");
        System.out.println("========================================================");

        System.out.print("Selection Sort  | " + selectionComp);
        for (int k = 0; k < 16 - (""+selectionComp).length(); k++)
            System.out.print(" ");
        System.out.println("| "+selectionTime);
        System.out.println("----------------+-----------------+---------------------");

        System.out.print("Insertion Sort  | " + insertionComp);
        for (int k = 0; k < 16 - (""+insertionComp).length(); k++)
            System.out.print(" ");
        System.out.println("| "+insertionTime);
        System.out.println("----------------+-----------------+---------------------");

        System.out.print("Heapsort        | " + heapComp);
        for (int k = 0; k < 16 - (""+heapComp).length(); k++)
            System.out.print(" ");
        System.out.println("| "+heapTime);
        System.out.println("----------------+-----------------+---------------------");

        System.out.print("Merge Sort      | " + mergeComp);
        for (int k = 0; k < 16 - (""+mergeComp).length(); k++)
            System.out.print(" ");
        System.out.println("| "+mergeTime);
        System.out.println("----------------+-----------------+---------------------");

        System.out.print("Quicksort       | " + quickComp);
        for (int k = 0; k < 16 - (""+quickComp).length(); k++)
            System.out.print(" ");
        System.out.println("| "+quickTime);
        System.out.println("----------------+-----------------+---------------------");

        in.close();
    }
}//end of class