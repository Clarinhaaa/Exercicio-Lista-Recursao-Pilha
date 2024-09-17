package recursaoBinario;

public class ConversaoDecBin {
    public String converter(int numDec) {
        if (numDec > 0)
            return this.converter(numDec / 2) + numDec % 2;
        return "";
    }
}
