package pilha;

public class Palindromo {
    private Pilha<Character> pil = new Pilha<Character>();

    public boolean verificarPalindromo(String palavra) {
        boolean palindromo = true;
        palavra = palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {
            this.pil.empilhar(palavra.charAt(i));
        }
        for (int i = 0; i < palavra.length(); i ++) {
            if (this.pil.desempilhar() != palavra.charAt(i)) {
                palindromo = false;
                break;
            }
        }

        return palindromo;
    }
}
