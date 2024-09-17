class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        //Split both sentences into words
        String[] s1Words = s1.split("\\s+");
        String[] s2Words = s2.split("\\s+");

        //Use a HashMap to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();

        //Count the frequency of words in both s1 and s2
        for (String word : s1Words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : s2Words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        //Create a list to collect uncommon words
        List<String> output = new ArrayList<>();

        //Find all words that occur exactly once
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                output.add(entry.getKey());
            }
        }

        //Convert the list to an array and return
        return output.toArray(new String[0]);
        
    }
}
