import game.Termo;
import word.Word;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Word word = new Word();
        List<String> words = word.formater();

        String palavraEscolhida = words.get(random.nextInt(5000));

        Termo termo = new Termo(palavraEscolhida);
        System.out.println(termo.jogar());
    }
}
