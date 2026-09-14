//Ricky Espino

public class InsertionSort {
    
    private String[] words;
    private int comparisons;

    //constructor
    public InsertionSort(String[] arr){
        words = arr;
        comparisons = 0;
    }

    //Insertion sort
    public void sort(){
        int n = words.length;
        for(int i = 0; i < n; i++){
            String key = words[i];
            int j = i - 1;
            while(j >= 0 && words[j] != null && key != null){
                comparisons++; 
                if (words[j].compareTo(key) > 0) {
                    words[j+1] = words[j];
                    j--;
                } else {
                    break;
                }
            }
            words[j+1] = key;
        }
    }

    //returns # comparisons
    public int comparisons(){
        return comparisons;
    }
}//End of class