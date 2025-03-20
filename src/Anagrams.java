import java.util.*;

public class Anagrams {
    public List<List<String>> anagramsListChecker(String[] anagramList) {

        Map<String, List<String>> anagramsMap = new HashMap<>();        // Create a map to store the anagrams

        for (String anagram : anagramList) {                            // Loop through the anagram list

            char[] charArray = anagram.toCharArray();                   // Convert the anagram to a character array

            Arrays.sort(charArray);                                     // Sort the character array

            String sortedAnagram = new String(charArray);               // Convert the sorted character array to a string

            if (!anagramsMap.containsKey(sortedAnagram)) {              // Check if the sorted anagram is already in the map

                anagramsMap.put(sortedAnagram, new java.util.ArrayList<>());    // If not, add it to the map
            }

            anagramsMap.get(sortedAnagram).add(anagram);                // Add the anagram to the list of anagrams
        }
        
        return new ArrayList<>(anagramsMap.values());                   // Return the list of anagrams
    }
}
