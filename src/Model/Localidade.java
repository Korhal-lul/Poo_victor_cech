package Model;

public class Localidade implements ICadastro{
    private String continente;
    private String pais;
    private String regiao;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String país) {
        pais = país;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Localidade{" +
                "Continente='" + continente + '\'' +
                ", País='" + pais + '\'' +
                ", Região='" + regiao + '\'' +
                ", Estado='" + estado + '\'' +
                ", Cidade='" + cidade + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", Rua='" + rua + '\'' +
                ", Número='" + numero + '\'' +
                '}';
    }

    @Override
    public void autoCadastro() {
        this.continente = "Americano";
        this.pais = "Brasil";
        this.regiao = "Sul";
        this.estado = "Santa Catarina";
        this.cidade = "Jaragua do Sul";
        this.bairro = "Barra do rio Molha";
        this.rua = "Isodoro Pedri";
        this.numero = "263";
    }
}
