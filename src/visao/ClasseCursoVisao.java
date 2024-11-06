package visao;

import java.util.ArrayList;

import dominio.ClasseCurso;
import servico.ClasseCursoServico;

public class ClasseCursoVisao {

    private ClasseCursoServico srv;

    public ClasseCursoVisao(){
        this.srv = new ClasseCursoServico();
    }
    public void  Criar(){
        ClasseCurso cp = new ClasseCurso();
        cp.setCodigo(0);
        cp.setNome("TEste");
        cp.setDescricao("Teste");
        cp.setCargahoraria(0);
        this.srv.Criar(cp);
    }

    public void Exibir(){
        ArrayList<ClasseCurso> lista = this.srv.LerTodos();
        System.out.println("=====================================================================================");
        for (ClasseCurso cp : lista) {
           this.imprimirPorLinha(cp);
       }
    }

    public void ExibirPorLinha(){
        ArrayList<ClasseCurso> lista = this.srv.LerTodos();
        System.out.println("=====================================================================================");
        for (ClasseCurso cp : lista) {
           this.imprimirPorLinha(cp);
        }
    }

    private void imprimirPorLinha(ClasseCurso cp){
        
        String mensagem = "";
        mensagem += "Classe do Curso: ";
        mensagem += "Código: " + cp.getCodigo() + " -- ";
        mensagem += "Nome: " + cp.getNome() + " -- ";
        mensagem += "Descrição: " + cp.getDescricao() + " -- ";
        mensagem += "Carga Horária: " + cp.getCargahoraria();
        System.out.println(mensagem);
        System.out.println("--------------------------------------------------------------------------------------------");

    }
}
