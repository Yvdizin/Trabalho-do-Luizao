package fakedb;

import java.util.ArrayList;

import dominio.ClasseCurso;

public class ClasseCursoFakeDB extends BaseFakeDB<ClasseCurso> {
    
    @Override
    protected void preencherDados() {
        this.tabela = new ArrayList<>();
        this.tabela.add(new ClasseCurso(1, "Fisica" , "Bacharelado", 120));
        this.tabela.add(new ClasseCurso(2, "Matemática" , "Bacharelado", 100));
        this.tabela.add(new ClasseCurso(3, "Ciencias" , "Bacharelado", 162));
    }
    
    public ClasseCursoFakeDB(){
        super();
    }
}
