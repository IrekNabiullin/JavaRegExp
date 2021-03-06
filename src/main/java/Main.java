import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Pattern pattern1 = Pattern.compile("[x-z]+");//Поиск будет происходить от x до z включительно.
//Поиск будет происходить только по символам нижнего регистра.
//Чтобы отключить чувствительность к регистру, можно использовать Pattern.CASE_INSENSITIVE.

        Matcher matcher1 = pattern1.matcher("x y z 1 2 3 4 ");
        System.out.println(matcher1.find()); //Поиск любого совпадения с шаблоном.
//Выводится значение true, так как в строке есть символы шаблона.

        Matcher matcher2 = pattern1.matcher("X Y Z 1 2 3 4");
        System.out.println(matcher2.find()); //Выводится значение false.
//Так как в строке нет символов, подходящих по шаблону.

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
//Добавляется поиск по символам нижнего и верхнего регистра, а также цифр.

        Matcher matcher3 = pattern2.matcher("A B C D X Y Z a b c d x y z 1 2 3 4");
        System.out.println(matcher3.find()); //Выводится значение true
    }
}