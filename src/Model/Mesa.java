package Model;

public class Mesa extends  Sala implements ICadastro{
    private String tipo;
    private String lado;
    private String fileira;
    private String coluna;

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public String getColuna() {
        return coluna;
    }

    public void setColuna(String coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "tipo='" + tipo + '\'' +
                ", lado='" + lado + '\'' +
                ", fileira='" + fileira + '\'' +
                ", coluna='" + coluna + '\'' +
                '}';
    }

    @Override
    public void autoCadastro() {
        this.tipo = "Dupla";
        this.lado = "Direito";
        this.coluna = "3";
        this.fileira = "1";
    }
}
