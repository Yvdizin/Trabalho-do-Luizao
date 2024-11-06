package dominio;

public class SubClasseCurso extends BaseParametro {
    private int codigoClasse;

    public int getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(int codigoClasse) {
        this.codigoClasse = codigoClasse;
    }

    public SubClasseCurso() {
        super();
    }

    public SubClasseCurso(int codigo, String nome, String descricao, int cargahoraria, int codigoClasse) {
        super(codigo, nome, descricao, cargahoraria);
        this.codigoClasse = codigoClasse;
    } 
    
}
