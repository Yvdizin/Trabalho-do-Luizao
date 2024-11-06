package servico;

import java.util.ArrayList;

import dominio.ClasseCurso;
import repositorio.ClasseCursoRepositorio;

public class ClasseCursoServico extends BaseServico<ClasseCurso> {

    private ClasseCursoRepositorio repositorio;

    public ClasseCursoServico(){
        this.repositorio = new ClasseCursoRepositorio();
    }

    @Override
    public ClasseCurso Criar(ClasseCurso obj) {
        return this.repositorio.Create(obj);
    }

    @Override
    public ArrayList<ClasseCurso> LerTodos() {
        return this.repositorio.ReadAll();
    }

    @Override
    public ClasseCurso Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public ClasseCurso Atualizar(ClasseCurso obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public ClasseCurso Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }
    
}
