package String;
import java.util.*;

class LongestCommonPrefix{
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        

        for(int i =0 ; i<first.length() ; i++){
            if(first.charAt(i) == last.charAt(i)){
                result.append(first.charAt(i));
            }
            else{
                break;
            }
        }
        return result.toString();
    }
}