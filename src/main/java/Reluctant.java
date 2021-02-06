// Пример сверхжадного квантификатора
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// "А.++а"? // Работает также как и жадный режим, но не производит реверсивный поиск при захвате строки.
// Explanation : Since the quantifier is reluctant, it matches the shortest part of test with pattern.
// It processes one character at a time.

public class Reluctant {
    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("a++");
        Matcher m = p.matcher("aaa");

        while (m.find())
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));
    }
}
