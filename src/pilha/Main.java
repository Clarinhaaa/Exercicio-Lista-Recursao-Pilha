package pilha;

public class Main {
    public static void main(String[] args) {
        Palindromo pali = new Palindromo();
        if (pali.verificarPalindromo("SocorramMeSubiNoOnibusEmMarrocos")) {
            System.out.println("A palavra É um palíndromo");
        } else {
            System.out.println("A palavra NÃO É um palíndromo");
        }
    }
}
