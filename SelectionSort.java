//Ricky Espinio

public class SelectionSort {
    
    private String[] words;
    private int comparisons;

    //constructor
    public SelectionSort(String[] arr){
        words = arr;
        comparisons = 0;
    }

    //Selection sort
    public void sort(){
        int n = words.length;
        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (words[j] != null && words[min_idx] != null) {
                    comparisons++; 
                    if (words[j].compareTo(words[min_idx]) < 0) {
                        min_idx = j;
                    }
                }
            }
            String temp = words[min_idx];
            words[min_idx] = words[i];
            words[i] = temp;
        }
    }
    
    //returns # comparisons
    public int comparisons(){
        return comparisons;
    }
}//End of class