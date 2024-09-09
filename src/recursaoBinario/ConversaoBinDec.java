package recursaoBinario;

public class ConversaoBinDec {
    private int numDec = 0;
    private int expoente = 0;

    public int converter(String numBin, int posicao) {
        if (posicao < 0)
            return 0;
        
        this.numDec = Character.getNumericValue(numBin.charAt(posicao)) * (((int)Math.pow(2, this.expoente)));
        this.expoente++;
        return this.numDec + this.converter(numBin, posicao - 1);
    }
}
