//Пример жадного квантификатора
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// “A.+a”// Ищет максимальное по длине совпадение в строке.
// Explanation : The pattern g+ means one or more occurrences of "a". Text is "aaa".
// The greedy matcher would match the longest text even if parts of matching text also match.
// In this example, "a" and "aa" also match, but the greedy matcher produces "aaa".
public class Greedy {
    public static void main(String[] args)
    {

        Pattern p = Pattern.compile("a+");
        Matcher m = p.matcher("aaa");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));

    }
}
