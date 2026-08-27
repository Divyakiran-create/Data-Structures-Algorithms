import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        
        // Loop through all possible 10-letter substrings
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            
            // If the substring is already in 'seen', add it to 'repeated'
            if (!seen.add(substring)) {
                repeated.add(substring);
            }
        }
        
        return new ArrayList<>(repeated);
    }
}
