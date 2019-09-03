package Model;

public class Bloco extends Localidade implements ICadastro{
    private char bloco;

    public char getBloco() {
        return bloco;
    }

    public void setBloco(char bloco) {
        this.bloco = bloco;
    }

    @Override
    public String toString() {
        return "Bloco{" +
                "bloco=" + bloco +
                '}';
    }

    @Override
    public void autoCadastro() {
        this.bloco = 'D';
    }
}
