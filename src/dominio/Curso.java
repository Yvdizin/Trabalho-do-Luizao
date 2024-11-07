package dominio;

public class Curso extends BaseParametro {
    public Curso(){
        super();
    }

    public Curso(int codigo, String nome, String descricao, int cargahoraria){
        super(codigo, nome, descricao, cargahoraria);
    }
}
