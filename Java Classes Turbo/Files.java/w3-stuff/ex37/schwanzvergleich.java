import java.util.*;
public class schwanzvergleich {
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        int lenght = str.length();
        int stringlength = 0;
        String longestSubstring = null;
        for (int i = 0; i < lenght; i++) {
            for (int j = i + 1; j <= lenght; j++) {
                String subStr = str.substring(i, j);
                if (isUnique(subStr)) {
                    if (stringlength < subStr.length()) {
                        stringlength = subStr.length();
                        longestSubstring = subStr;
                    }
                }
            }
        }
        System.out.println("Input String : " + str);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + stringlength);
        
    }
    
}