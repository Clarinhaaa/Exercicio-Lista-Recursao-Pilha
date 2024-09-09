package recursaoBinario;

public class Main {
    public static void main(String[] args) {
        String numBin = "1101100011";

        ConversaoBinDec con = new ConversaoBinDec();
        System.out.println(numBin + " em decimal: " + con.converter(numBin, numBin.length() - 1));
    }
}
