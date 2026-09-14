//Ricky Espino

public class HeapSort {
    
    private String[] words;
    private int comparisons;
    private int size; 

    //constructor
    public HeapSort(String[] arr, int s) {
        words = arr;
        comparisons = 0;
        size = s;
    }

    public void sort() {
        buildHeap();
        for (int i = size - 1; i > 0; i--) {
            swap(0, i); 
            downheap(0, i); 
        }
    }

    //builds heap
    private void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            downheap(i, size); 
        }
    }

    public void downheap(int index, int heapSize) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallerChildIndex;

        while (leftChildIndex < heapSize) {
            if (rightChildIndex < heapSize) {
                if (words[leftChildIndex] != null && words[rightChildIndex] != null) {
                    comparisons++;
                    if (words[leftChildIndex].compareTo(words[rightChildIndex]) > 0) {
                        smallerChildIndex = rightChildIndex;
                    } else {
                        smallerChildIndex = leftChildIndex;
                    }
                } else {
                    smallerChildIndex = leftChildIndex;
                }
            } else {
                smallerChildIndex = leftChildIndex;
            }

            if (words[index] != null && words[smallerChildIndex] != null) {
                comparisons++;
                if (words[index].compareTo(words[smallerChildIndex]) > 0) {
                    swap(index, smallerChildIndex);
                    index = smallerChildIndex;
                    leftChildIndex = 2 * index + 1;
                    rightChildIndex = 2 * index + 2;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }

    //swaps two elements
    private void swap(int index1, int index2) {
        String temp = words[index1];
        words[index1] = words[index2];
        words[index2] = temp;
    }

    //returns # comparisons
    public int comparisons() {
        return comparisons;
    }
}//end of class