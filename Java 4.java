import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        str = str.toLowerCase();
        
       
        for (char c : str.toCharArray()) {  
            if (c != ' ' && c != ',' && c != '!' && c != '.') {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        
        System.out.println("Duplicate characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c);
            }
        }
    }
}

