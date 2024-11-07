package visao;

import servico.CursoServico;

import java.util.ArrayList;

import dominio.Curso;

public class ClasseCursoMenu extends BaseMenu{

    public CursoServico srv;

    public ClasseCursoMenu(){
        super();
        this.srv = new CursoServico();
    }

    @Override
    public void ExibirMenu() {
       int opcao = 0;
       while(opcao != 9)
       {
        Util.ClearConsole();
        System.out.println("Curso");
        System.out.println("Menu de Opções");
        System.out.println("1 - Listar");
        System.out.println("2 - Localizar");
        System.out.println("3 - Adicionar");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Remover");
        System.out.println("9 - Sair");
        System.out.print("Escreva sua opção: ");
        opcao = this.scanner.nextInt();
        
        switch (opcao) {
            case 1:
                this.Listar();
                break;
            case 2:
                this.Localizar();
                break;
            case 3:
                this.Adicionar();
                break;
            case 4:
                this.Atualizar();
                break;
            case 5:
                this.Remover();
                break;
            case 9:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

       }
    }

    @Override
    public void Listar() {
            Util.ClearConsole();
            System.out.println("Listando...");
    
            ArrayList<Curso> lista = this.srv.LerTodos();
            for (Curso cp : lista) {
                this.ImprimirEmLinha(cp);
            }
    
            System.out.println("Clique <ENTER> para continuar...");
            this.scanner.nextLine();
            this.scanner.nextLine();
    }

    @Override
    public void Localizar() {
        Util.ClearConsole();
        System.out.println("Localizando...");

        System.out.print("Informe o código do Curso: ");
        int codigo = this.scanner.nextInt();

        Curso cp = this.srv.Ler(codigo);
        if (cp != null){
            this.ImprimirEmLinha(cp);
        }
        else{
            System.out.println("Problema - Curso não foi encontrada");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Adicionar() {
        Util.ClearConsole();
        System.out.println("Adicionando...");

        System.out.print("Informe o Nome do Curso: ");
        String nome = this.scanner.next();
        System.out.print("Informe a Descrição do Curso: ");
        String descricao = this.scanner.next();
        System.out.print("Informe a Carga Horária do Curso: ");
        int cargahoraria = this.scanner.nextInt();

        Curso cp = new Curso();
        cp.setCodigo(0);
        cp.setNome(nome);
        cp.setDescricao(descricao);
        cp.setCargahoraria(cargahoraria);
        
        Curso cpnovo = this.srv.Criar(cp);
        if (cpnovo != null){
            System.out.println("Curso adicionada com sucesso");
        }
        else{
            System.out.println("Problema - Curso não foi adicionado");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Atualizar() {
        Util.ClearConsole();
        System.out.println("Atualizando...");

        System.out.print("Informe o código do Curso: ");
        int codigo = this.scanner.nextInt();

        Curso cp = this.srv.Ler(codigo);
        if (cp != null){
            System.out.print("Informe a nova Descrição para este Curso: ");
            String descricao = this.scanner.next();
            cp.setDescricao(descricao);
            if (this.srv.Atualizar(cp) != null){
                System.out.println("Curso atualizado com sucesso");
            }
            else{
                System.out.println("Problema - Curso não foi atualizado");
            }
        }
        else{
            System.out.println("Problema - Curso não foi encontrado");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }

    @Override
    public void Remover() {
        Util.ClearConsole();
        System.out.println("Removendo...");

        System.out.print("Informe o código do Curso: ");
        int codigo = this.scanner.nextInt();

        Curso cp = this.srv.Ler(codigo);
        if (cp != null){
            if (this.srv.Deletar(codigo) != null){
                System.out.println("Curso removido com sucesso");
            }
            else{
                System.out.println("Problema - Curso não foi removido");
            }
        }
        else{
            System.out.println("Problema - Curso não foi encontrado");
        }

        System.out.println("Clique <ENTER> para continuar...");
        this.scanner.nextLine();
        this.scanner.nextLine();
    }
    
    private void ImprimirEmLinha(Curso cp){
        String msg = "Classe do Curso - ";
        msg += "Código: " + cp.getCodigo() + " | ";
        msg += "Nome: " + cp.getNome() + " | ";
        msg += "Descrição: " + cp.getDescricao() + " | ";
        msg += "Carga Horária do Curso: " + cp.getCargahoraria();
        System.out.println(msg);
    }    
    
}
