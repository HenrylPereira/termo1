import word.Word;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Word word = new Word();
        List<String> words = word.formater();

        String assertWords = words.get(random.nextInt(5000));
        System.out.println(assertWords);
    }
}
