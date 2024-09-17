package recursaoBinario;

public class Main {
    public static void main(String[] args) {
        String numBin = "10000110";
        int numDec = 134;

        ConversaoBinDec conBiDe = new ConversaoBinDec();
        System.out.println(numBin + " em decimal: " + conBiDe.converter(numBin, numBin.length() - 1));

        ConversaoDecBin conDeBi = new ConversaoDecBin();
        System.out.println(numDec + " em binário: " + conDeBi.converter(numDec));
    }
}
