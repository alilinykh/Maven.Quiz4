package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + getMiddleCharacter(str).toString().toUpperCase() + str.substring(str.length()/2 + 1) ;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        return str.substring(0, str.length()/2) + getMiddleCharacter(str).toString().toLowerCase() + str.substring(str.length()/2 + 1) ;
    }

    public static Boolean isIsogram(String str) {
        String[] arr = str.split("");
        Set set = new HashSet(Arrays.asList(arr));

        if (str.length() == set.size()) {
            return true;
        }else return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String[] arr = str.split("");
        if (!isIsogram(str)) {
            for (int i = 1; i < arr.length ; i++) {
                if (arr[i].equals(arr[i-1])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String[] arr = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        if (hasDuplicateConsecutiveCharacters(str)) {
            for (int i = 1; i < arr.length ; i++) {
                if (!arr[i].equals(arr[i-1])) {
                    if (i == arr.length-1) {
                        stringBuilder.append(arr[i]);
                    }
                    else
                    {stringBuilder.append(arr[i-1]);}
                }
            }
            return stringBuilder.toString();
        }
        else {return str;}
    }

    public static String invertCasing(String str) {
        String[] arr = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: arr
             ) {
            if (s.equals(s.toUpperCase())) {
                stringBuilder.append(s.toLowerCase());
            }
            else if (s.equals(s.toLowerCase())) {
                stringBuilder.append(s.toUpperCase());
            }
        }
        return stringBuilder.toString();
    }
}
