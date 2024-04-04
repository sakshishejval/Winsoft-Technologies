
public class WordCount {
    public static void main(String[] args) {
        String str = "This is a sample string with some words. Words will be counted.";
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
       
        String[] words = str.split("\\s+");
        
        
        for (String word : words) {
            word = word.toLowerCase(); 
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
        
        int totalWords = words.length;
        System.out.println("\nTotal Number of Words: " + totalWords);
    }
}
