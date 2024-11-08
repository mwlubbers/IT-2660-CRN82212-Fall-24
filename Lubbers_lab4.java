import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      long bubbleStartTime = System.currentTimeMillis();
     
      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);
      long bubbleEndTime = System.currentTimeMillis();
      long bubbleElapsedTime = (bubbleEndTime - bubbleStartTime);


      integerList = Lab4.getList();
      long insertionStartTime = System.currentTimeMillis();

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      Lab4.outputList(insertionSortedList);
      System.out.println("");
      long insertionEndTime = System.currentTimeMillis();
      long insertionElapsedTime = (insertionEndTime - insertionStartTime);
      System.out.println("Bubble Sort Time: " + bubbleElapsedTime);
      System.out.println("Insertion Sort Time: " + insertionElapsedTime);
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
  
    for (int i = 1; i < integerList.size(); i++) {
      int currentElement = integerList.get(i);
      int k;
      for (k = i - 1; k >= 0 && integerList.get(k) > currentElement; k--) {
    
    integerList.set(k+1, integerList.get(k));
     }
     integerList.set(k+1, currentElement);
    }
         return integerList;
  }
  
  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean needNextPass = true;
    
    for (int k = 1; k < integerList.size() && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < integerList.size() - k; i++) {
        if (integerList.get(i) > integerList.get(i + 1)) {
          // Swap list[i] with list[i + 1]
          int temp = integerList.get(i);
          integerList.set(i, temp);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, temp);
          
          needNextPass = true; // Next pass still needed
        
    
     } 
    }
   }
   return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
  /*1. If I were implementing a sort algorithm for a new language, I would use a quick sort because it is efficient for large datasets.
2. There was a significant difference in the Bubble Sort Time and Insertion Sort Time. The Bubble Sort took more time than the insertion sort. This is surprising because the Bubble Sort time complexity (worst-case) and Insertion time complexity are both O(n^2).  
3. The images from Wikipedia that you included in this lesson were very helpful in visualizing all of the different sorts. However, even with those, I still have to work to wrap my head around how the heap sort. I also struggle to understand the benefits of the bubble sort. The easiest for me to understand are the insertion sort and merge sort.  */
}