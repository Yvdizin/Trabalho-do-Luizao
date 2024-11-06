package dominio;

public class Curso extends BaseParametro{
    private int codigoSubClasse;
    private double valor;
    public int getCodigoSubClasse() {
        return codigoSubClasse;
    }
    public void setCodigoSubClasse(int codigoSubClasse) {
        this.codigoSubClasse = codigoSubClasse;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Curso() {
        super();
    }
    public Curso(int codigo, String nome, String descricao, int cargahoraria, int codigoSubClasse, double valor) {
        super(codigo, nome, descricao, cargahoraria);
        this.codigoSubClasse = codigoSubClasse;
        this.valor = valor;
    }
    
    
}
