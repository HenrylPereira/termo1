package game;

public class Termo {

    private String palavraEscolhida;

    public Termo(String palavraEscolhida){
        this.palavraEscolhida = palavraEscolhida;
    }
    public String jogar(){
        String tentativa = "TURNO";
        if(this.palavraEscolhida == tentativa){
            return "ACERTOU - TURNO";
        };
        return this.verificaLetras(tentativa);
    }


    private String verificaLetras(String palavra) {
        char[] mascaraArray = "*,*,*,*,*".toCharArray();

        for (int i = 0; i < 5; i++) {
            char letraTentativa = palavra.charAt(i);
            char letraPalavra = this.palavraEscolhida.charAt(i);
            System.out.println(letraTentativa);
            System.out.println(letraPalavra);
            if (letraTentativa == letraPalavra) {
                mascaraArray[i] = letraTentativa;
            }
        }

        String mascara = new String(mascaraArray);
        System.out.println(mascara);
        return "mascara";
    }

}
