import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("八神太一");
        names.add("石田ヤマト");
        names.add("武之内空");
        names.add("泉光子郎");
        names.add("太刀川ミミ");
        names.add("城戸丈");
        names.add("高石タケル");
        names.add("八神ヒカリ");

        List<String> partners = new ArrayList<String>();

        partners.add("アグモン");
        partners.add("ガブモン");
        partners.add("ピヨモン");
        partners.add("テントモン");
        partners.add("パルモン");
        partners.add("ゴマモン");
        partners.add("パタモン");
        partners.add("テイルモン");

        int number = 0;

        if (!names.isEmpty()) {
            for (String name : names) {
                // リストの名前を一つずつ取り出す
                System.out.println("Hello　" + name);
                System.out.println("Your partner is "+partners.get(number));
                number++;

            }

            System.out.println("Fight! everyone");
        }
    }
}
