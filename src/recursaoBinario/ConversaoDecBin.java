package recursaoBinario;

public class ConversaoDecBin {
    public String converter(int numDec) {
        if (numDec == 2) {
            return "10";
        }
        
        if (numDec == 3) {
            return "11";
        }

        return this.converter(numDec / 2) + numDec % 2;
    }
}