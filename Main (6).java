public class Main {
    public static void main(String[] args) {
        String input = "t6hj7ui";
        System.out.println(expandString(input));
    }

    public static String expandString(String str) {
        StringBuilder result = new StringBuilder();
        int n = str.length();
        
        
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            
            if (Character.isLetter(ch)) {
                if (i + 1 < n && Character.isDigit(str.charAt(i + 1))) {
                    int count = str.charAt(i + 1) - '0';
                    result.append(String.valueOf(ch).repeat(count));
                    i++; 
                } else {
                    result.append(ch);
                }
            }
        }
        
        return result.toString();
    }
}
