/**
 * Given the string, check if it is a palindrome.
 */

boolean solution(String inputString) {
   String reverse = "";
   for(int i=inputString.length() - 1; i >= 0; i--) {
       reverse += inputString.charAt(i);
   }    
   
   return inputString.contentEquals(reverse);
}
