class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null|| digits.isEmpty()){
            return result;
        }

        Map< Integer, List<String>> MultiMap= new HashMap<>();

        MultiMap.put(2, Arrays.asList("a","b","c"));
        MultiMap.put(3, Arrays.asList("d","e","f"));
        MultiMap.put(4, Arrays.asList("g","h","i"));
        MultiMap.put(5, Arrays.asList("j","k","l"));
        MultiMap.put(6, Arrays.asList("m","n","o"));
        MultiMap.put(7, Arrays.asList("p","q","r","s"));
        MultiMap.put(8, Arrays.asList("t","u","v"));
        MultiMap.put(9, Arrays.asList("w","x","y","z"));

        backtrack(result, digits, MultiMap, new StringBuilder(), 0);
        return result;
    }
    private void backtrack(List<String> result, String digits, Map<Integer, List<String>> multiMap, StringBuilder current, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        List<String> letters = multiMap.get(digit);

        for (String letter : letters) {
            current.append(letter);                                 
            backtrack(result, digits, multiMap, current, index + 1); 
            current.deleteCharAt(current.length() - 1);             
        }
    }
}