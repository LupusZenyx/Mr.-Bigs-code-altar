public class stuff {
        public static void main(String[] args) {
            //task 1
            System.out.println("Task 1:");
            String task1 = "Java Exercises!";
            System.out.println(getCharAt(task1, 0));
            //task 2
            System.out.println("Task 2:");
            String task2 = "w3resource.com";
            getCodePointAt(task2, 5);
            //task 3
            System.out.println("Task 3:");
            String task3 = "w3resource.com";
            getCodePointBefore(task3, 5);
            //task 4
            System.out.println("Task 4:");
            String task4 = "w3resource.com";
            countUnicodePoints(task4);
            //task 5
            System.out.println("Task 5:");
            String task5_1 = "This is Exercise 1";
            String task5_2 = "This is Exercise 2";
            //task 6
            System.out.println("Task 6:");
            String task6_1 = "This is Exercise 1";
            String task6_2 = "This is Exercise 1";
            //task 7
            System.out.println("Task 7:");
            String task7_1 = "PHP Exercises and";
            String task7_2 = "Python Exercises";
            concatStrings(task7_1, task7_2);
            //task 8
            System.out.println("Task 8:");
            String task8_1 = "PHP Exercises and Python Exercises";
            containsString(task8_1, "and");
            //task 9
            System.out.println("Task 9:");
            String task9_1_1 = "example.com";
            String task9_1_2 = "example.com";
            String task9_2_1 = "Example.com";
            String task9_2_2 = "example.com";
            compareStrings(task9_1_1, task9_1_2);
            compareStrings(task9_2_1, task9_2_2);
            //task 10
            System.out.println("Task 10:");
            String task10_1_1 = "example.com";
            String task10_1_2 = "example.com";
            String task10_2_1 = "Example.com";
            String task10_2_2 = "example.com";
            equalsStringBuffer(task10_1_1, task10_1_2);
            //task 11
            System.out.println("Task 11:");
            char[] arr_num = new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
            mixIntString(arr_num);
            //task 12
            System.out.println("Task 12:");
            // does String end with "se"?
            String task12_1_1 = "Python Exercises";
            String task12_1_2 = "Python Exercise";
            endsWith(task12_1_1, "se");
            endsWith(task12_1_2, "se");
            //task 13
            System.out.println("Task 13:");
                /*
                "Stephen Edwin King" equals "Walter Winchell"? false
                "Stephen Edwin King" equals "Mike Royko"? false
                */
            stringContains("Stephen Edwin King", "Walter Winchell");
            stringContains("Stephen Edwin King", "Mike Royko");
            //task 14
            System.out.println("Task 14:");
            String task14_1 = "Stephen Edwin King"; // equals "Walter Winchell"? false
            String task14_2 = "Stephen Edwin King";  //equals "stephen edwin king"? true
            equalsIgnoreCase(task14_1, "Walter Winchell");
            equalsIgnoreCase(task14_2, "stephen edwin king");
        }
        //task 15
    
        public static Character getCharAt(String str, int index) {
            return str.charAt(index);
        }
    
        public static int getCodePointAt(String str, int index) {
            return str.codePointAt(index);
        }
    
        public static int getCodePointBefore(String str, int index) {
            return str.codePointBefore(index);
        }
    
        public static int countUnicodePoints(String str) {
            return str.codePointCount(0, str.length());
        }
    
        public static int compareStrings(String str1, String str2) {
            return str1.compareTo(str2);
        }
    
        public static String concatStrings(String str1, String str2) {
            return str1.concat(str2);
        }
    
        public static boolean containsString(String all, String criterea) {
            return all.contains(criterea);
        }
    
        public static boolean equalsStrings(String str1, String str2) {
            return str1.equals(str2);
        }
    
        public static boolean equalsStringBuffer(String str1, String str2) {
            StringBuilder strbuf = new StringBuilder(str1);
            return str1.contentEquals(strbuf);
        }
    
        public static String mixIntString(char[] arr_num) {
            return String.copyValueOf(arr_num, 1, 3);
        }
    
        public static boolean endsWith(String str, String criterea) {
            return str.endsWith(criterea);
        }
    
        public static boolean stringContains(String str, String criterea) {
            return str.contains(criterea);
        }
        
        public static boolean equalsIgnoreCase(String str1, String str2) {
            return str1.equalsIgnoreCase(str2);
        }

        // Task 16
        public static byte[] getBytes(String str) {
            return str.getBytes();
        }

        // Task 17
        public static char[] getChars(String str) {
            return str.toCharArray();
        }

        // Task 18
        public static String getIdentifier(String str) {
            return str.intern();
        }

        // Task 19
        public static void getAlphabetIndex(String str) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLetter(c)) {
                    System.out.println("Letter: " + c + " has index " + i);
                }
            }
        }

        // Task 20
        public static String getCanonical(String str) {
            return str.intern();
        }
        
        // Task 21
        public static int getLastIndex(String str, String criterea) {
            return str.lastIndexOf(criterea);
        }

        // Task 22
        public static int getLength(String str) {
            return str.length();
        }

        // Task 23
        public static boolean regionMatches(String str1, String str2, int index) {
            return str1.regionMatches(0, str2, 0, index);
        }

        // Task 24
        public static String replaceChar(String str, char oldChar, char newChar) {
            return str.replace(oldChar, newChar);
        }

        // Task 25
        public static String replaceRegex(String str, String regex, String replacement) {
            return str.replaceAll(regex, replacement);
        }

        // Task 26
        public static boolean startsWith(String str, String criterea) {
            return str.startsWith(criterea);
        }

        // Task 27
        public static String getSubstring(String str, int beginIndex, int endIndex) {
            return str.substring(beginIndex, endIndex);
        }

        // Task 28
        public static char[] getCharArray(String str) {
            return str.toCharArray();
        }

        // Task 29
        public static String toLowerCase(String str) {
            return str.toLowerCase();
        }

}