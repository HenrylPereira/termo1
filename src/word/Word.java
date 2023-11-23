package word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Word {
    public List<String> formater() {
        // Obtém o diretório de trabalho do projeto
        String diretorioProjeto = System.getProperty("user.dir");

        // Especifica o caminho do arquivo relativo ao diretório de trabalho do projeto
        String caminhoArquivo = diretorioProjeto + "\\words.txt";

        // Lista para armazenar palavras com 5 letras
        List<String> palavrasComCincoLetras = new ArrayList<>();

        // Use try-with-resources para garantir o fechamento automático do BufferedReader
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(Word.class.getResourceAsStream("/word/words.txt"), StandardCharsets.UTF_8))) {

            String linha;

            // Leia cada linha do arquivo enquanto houver linhas a serem lidas
            while ((linha = br.readLine()) != null) {
                // Divida a linha em palavras
                String[] palavras = linha.split("\\s+");

                // Verifique cada palavra e adicione aquelas com 5 letras à lista
                for (String palavra : palavras) {
                    if (palavra.length() == 5) {
                        palavrasComCincoLetras.add(palavra);
                    }
                }
            }
        } catch (IOException e) {
            // Trate qualquer exceção de leitura de arquivo aqui
            e.printStackTrace();
        }

        // Imprima as palavras com 5 letras
        return palavrasComCincoLetras;
    }
}
