package fakedb;

import java.util.ArrayList;

import dominio.Curso;

public class CursoFakeDB extends BaseFakeDB<Curso> {
    
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new Curso(1, "Fisica" , "Bacharelado", 120));
        this.tabela.add(new Curso(2, "Matemática" , "Bacharelado", 100));
        this.tabela.add(new Curso(3, "Ciencias" , "Bacharelado", 162));
    }
    
    public CursoFakeDB(){
        super();
    }
}
