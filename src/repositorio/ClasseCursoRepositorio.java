package repositorio;

import dominio.ClasseCurso;
import fakedb.ClasseCursoFakeDB;

public class ClasseCursoRepositorio extends BaseRepositorio<ClasseCurso> {

    private ClasseCursoFakeDB db;

    public ClasseCursoRepositorio(){
        this.db = new ClasseCursoFakeDB();
        this.FonteDeDados = this.db.getTabela();
    }

    @Override
    public ClasseCurso Create(ClasseCurso instancia) {                      
        int proxChave = this.FonteDeDados.getLast().getCodigo() + 1;
        instancia.setCodigo(proxChave);
        this.FonteDeDados.add(instancia);
        return instancia;
    }

    @Override
    public ClasseCurso Read(int chave) {
        for (ClasseCurso cp : this.FonteDeDados) {
            if (cp.getCodigo() == chave){
            return cp;
            }
        }
        return null;
    }

    @Override
    public ClasseCurso Update(ClasseCurso instancia) {
        ClasseCurso cp = this.Read(instancia.getCodigo());
        if(cp != null){
            cp.setDescricao(instancia.getDescricao());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseCurso Delete(int chave) {
        ClasseCurso cp = this.Read(chave);
        if(cp != null){
            this.FonteDeDados.remove(cp);
            return cp;
        }
        else{
            return null;
        }
    }
}
