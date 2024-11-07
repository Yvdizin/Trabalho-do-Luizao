package repositorio;

import dominio.Curso;
import fakedb.CursoFakeDB;

public class CursoRepositorio extends BaseRepositorio<Curso> {

    private CursoFakeDB db;

    public CursoRepositorio(){
        this.db = new CursoFakeDB();
        this.FonteDeDados = this.db.getTabela();
    }

    @Override
    public Curso Create(Curso instancia) {                      
        int proxChave = this.FonteDeDados.getLast().getCodigo() + 1;
        instancia.setCodigo(proxChave);
        this.FonteDeDados.add(instancia);
        return instancia;
    }

    @Override
    public Curso Read(int chave) {
        for (Curso cp : this.FonteDeDados) {
            if (cp.getCodigo() == chave){
            return cp;
            }
        }
        return null;
    }

    @Override
    public Curso Update(Curso instancia) {
        Curso cp = this.Read(instancia.getCodigo());
        if(cp != null){
            cp.setDescricao(instancia.getDescricao());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public Curso Delete(int chave) {
        Curso cp = this.Read(chave);
        if(cp != null){
            this.FonteDeDados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }
}
