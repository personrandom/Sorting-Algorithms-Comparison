import java.util.*;

// Ricky Espino

public class QuickSort {
    
    private String[] words;
    private int comparisons;

    //constructor
    public QuickSort(String[] arr){
        words = arr;
        comparisons = 0;
    }

    public void sort() {
        LinkedList<String> q = new LinkedList<>();
        for (String word : words) {
            if (word != null) q.add(word);
        }

        quickSort(words, 0, words.length - 1);

        int i = 0;
        for (String word : q) {
            words[i++] = word;
        }
    }

    private void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
    
        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    
    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    //returns # comparisons
    public int comparisons() {
        return comparisons;
    }

}//End of class