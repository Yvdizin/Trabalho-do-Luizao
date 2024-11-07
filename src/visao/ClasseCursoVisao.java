package visao;

import java.util.ArrayList;

import dominio.Curso;
import servico.CursoServico;

public class ClasseCursoVisao {

    private CursoServico srv;

    public ClasseCursoVisao(){
        this.srv = new CursoServico();
    }
    public void  Criar(){
        Curso cp = new Curso();
        cp.setCodigo(0);
        cp.setNome("TEste");
        cp.setDescricao("Teste");
        cp.setCargahoraria(0);
        this.srv.Criar(cp);
    }

    public void Exibir(){
        ArrayList<Curso> lista = this.srv.LerTodos();
        System.out.println("=====================================================================================");
        for (Curso cp : lista) {
           this.imprimirEmLinha(cp);
       }
    }

    public void ExibirPorLinha(){
        ArrayList<Curso> lista = this.srv.LerTodos();
        System.out.println("=====================================================================================");
        for (Curso cp : lista) {
           this.imprimirEmLinha(cp);
        }
    }

    private void imprimirEmLinha(Curso cp){
        
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
