import java.util.Arrays;

public class StringFreq {
    public static void main(String[] args) {
        String s1 = "tree";
        int[] freq = new int[256]; // Assuming ASCII characters
        int[] firstOccurrence = new int[256];
        Arrays.fill(firstOccurrence, -1);

        // Count frequency of each character and record their first occurrence
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freq[c]++;
            if (firstOccurrence[c] == -1) {
                firstOccurrence[c] = i;
            }
        }

        // Create an array of characters
        Character[] charArray = new Character[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            charArray[i] = s1.charAt(i);
        }

        // Sort the array based on frequency and first occurrence
        Arrays.sort(charArray, (a, b) -> {
            if (freq[a] != freq[b]) {
                return freq[b] - freq[a]; // Sort by frequency in descending order
            } else {
                return firstOccurrence[a] - firstOccurrence[b]; // Sort by first occurrence
            }
        });

        // Convert the result array to a string
        StringBuilder sortedStr1 = new StringBuilder();
        for (char c : charArray) {
            sortedStr1.append(c);
        }

        System.out.println("Sorted string by frequency: " + sortedStr1.toString());
    }
}
