public class _90AnagramChecker {
    public static void main(String[] args) {
         String s1 = "abcd";
         String s2 = "dabc";
         int count = 0;
         
        
         for(int i = 0; i < s1.length(); i++){
           
             for(int j = 0; j < s2.length(); j++){
               
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                } 
             }
               
               } 
               if(count == s1.length() && count == s2.length()){
                System.out.println("Anagram");
               } else {
                System.out.println("Not Anagram");
               }
               
       
    }
}
