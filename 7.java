public class mergeString { 
  
    
    public static String merge(String s1, String s2) { 
        StringBuilder merged = new StringBuilder(); 
        int maxLength = Math.max(s1.length(), s2.length()); 

        
        for (int i = 0; i < maxLength; i++) { 
            if (i < s1.length()) {
                merged.append(s1.charAt(i)); 
            } 
            if (i < s2.length()) {
                merged.append(s2.charAt(i)); 
            } 
        } 

        return merged.toString(); 
    }

    public static void main(String[] args) { 
        String s1 = "happy"; 
        String s2 = "birthday"; 
        System.out.println(merge(s1, s2)); 
    } 
}