/*Write a method called alternate that accepts two Lists of integers as its
parameters and returns a
new List containing alternating elements from the twolists, in the
following order:
• First element from first list
• First element from second list
• Second element from first list
• Second element from second list
• Third element from first list
• Third element from second list
If the lists do not contain the same number of elements, the remaining elements
from the longer list should be placed consecutively at the end. For example,
for a first list of (1, 2, 3, 4, 5) and a second
list of (6, 7, 8, 9, 10, 11, 12), a call of alternate (list1,
list2) should return a list containing (1, 6, 2, 7, 3, 8, 4,
9, 5, 10, 11, 12). Do not modify the parameter lists passed in.*/

import java.util.ArrayList;
import java.util.List;

public class AlternateLists {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        
        // Iterate through both lists simultaneously
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i)); // Add element from list1
            }
            if (i < size2) {
                result.add(list2.get(i)); // Add element from list2
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(6, 7, 8, 9, 10, 11, 12);

        List<Integer> result = alternate(list1, list2);
        System.out.println(result); // Output: [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12]
    }
}