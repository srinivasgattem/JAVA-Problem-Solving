import java.io.*;
import java.util.*;

class Result {

    public static int findNumOfPairs(List<Integer> a, List<Integer> b) {
        // Sort lists a and b in non-decreasing order
        Collections.sort(a);
        Collections.sort(b);
        
        // Initialize variables
        int pairs = 0;
        int i = 0;
        int j = 0;
        
        // Iterate through lists a and b
        while (i < a.size() && j < b.size()) {
            // If a[i] is greater than b[j], increment pairs and move to the next element in b
            if (a.get(i) > b.get(j)) {
                pairs++;
                j++;
            }
            // Move to the next element in a
            i++;
        }
        
        return pairs;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < aCount; i++) {
            a.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < bCount; i++) {
            b.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int result = Result.findNumOfPairs(a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
