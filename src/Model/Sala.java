package Model;

public class Sala  extends Andar implements ICadastro{
    private String nome;
    private String tipo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    @Override
    public void autoCadastro() {
        this.nome = "D205";
        this.tipo = "Sala de Engenharia";
    }
}
