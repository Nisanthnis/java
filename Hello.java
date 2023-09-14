import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Count the articles which are a, an and the.";
        String[] str = s.split(" ");
        ArrayList<String> articles = new ArrayList<>();
        articles.add("a");
        articles.add("an");
        articles.add("the");
        int count = 0;

        for (int i = 0; i < str.length; i++) {
            // Remove punctuation marks (e.g., commas)
            String word = str[i].replaceAll("[^a-zA-Z]", "");
            
            for (int j = 0; j < articles.size(); j++) {
                if (word.equalsIgnoreCase(articles.get(j))) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
