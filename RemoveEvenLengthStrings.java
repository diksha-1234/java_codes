/*Collection and Generic Framework:
Write a method removeEvenLength that takes an ArrayList of Strings as a
parameter and that removesall the strings of even length from the list.
(Use ArrayList)*/

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenLengthStrings {
    public static void removeEvenLength(ArrayList<String> list) {
        // Use an iterator to safely remove elements while iterating
        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String str = iterator.next();
            // Check if the length of the string is even
            if (str.length() % 2 == 0) {
                // Remove the string if its length is even
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");
        strings.add("Java");
        strings.add("programming");
        strings.add("is");
        strings.add("fun");

        System.out.println("Original list: " + strings);
        
        // Remove strings of even length
        removeEvenLength(strings);
        
        System.out.println("Modified list: " + strings);
    }
}