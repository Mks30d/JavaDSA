package DSA_Questions.Leetcode;

import java.util.HashMap;

public class HTMLEntityParser {

    public static String entityParser(String text) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("&quot;", "\"");
        hm.put("&apos;", "'");
        hm.put("&amp;", "&");
        hm.put("&gt;", ">");
        hm.put("&lt;", "<");
        hm.put("&frasl;", "/");
        int n = text.length();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (ch != '&') {
                ans.append(ch);
            } else {
                StringBuilder temp = new StringBuilder();
                temp.append('&');
                boolean entityFound = false;

                for (int j = i + 1; j < n; j++) {
                    char ch1 = text.charAt(j);
                    if (ch1 == '&') {
                        // If another '&' is found before ';', it's not a valid entity
                        break;
                    } else if (ch1 == ';') {
                        temp.append(';');
                        String entity = temp.toString();
                        if (hm.containsKey(entity)) {
                            ans.append(hm.get(entity));
                            i = j; // Move the index to the end of the entity
                            entityFound = true;
                        }
                        break;
                    } else {
                        temp.append(ch1);
                    }
                }

                // If no valid entity was found, append the '&' as is
                if (!entityFound) {
                    ans.append('&');
                }
            }
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "&&gt;";
        String str5 = "&&&";
        String str1 = "&amp; is an HTML entity but &ambassador; is not.";
        String str2 = "and I quote: &quot;...&quot;";
        String str4 = "&...&quot;"; // "&...\""

        System.out.println(entityParser(str5));
    }
}
