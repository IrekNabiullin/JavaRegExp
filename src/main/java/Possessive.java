//Пример ленивого квантификатора
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Possessive quantifier (Appending a + after quantifier)
// This quantifier matches as many characters as it can like greedy quantifier.
// But if the entire string doesn’t match, then it doesn’t try removing characters from end.

public class Possessive {
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("g+?");
        Matcher m = p.matcher("ggg");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));

    }
}
