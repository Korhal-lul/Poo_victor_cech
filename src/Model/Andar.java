package Model;

public class Andar extends Bloco implements ICadastro{
    private int piso;
    private String andar;

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Andar{" +
                "andar='" + andar + '\'' +
                '}';
    }

    @Override
    public void autoCadastro() {
        this.piso = 1;
        this.andar = ( piso == 0 ? "terreo": (piso + "º piso"));
    }
}
