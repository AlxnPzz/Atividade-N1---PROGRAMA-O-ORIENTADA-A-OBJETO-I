import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsultaAluno {
    public static void main(String[] args){

        List<Aluno> alunos = new ArrayList<>();

        Aluno Alexandre = new Aluno();
        Alexandre.Nome = "Alexandre";
        Alexandre.Sobrenome = "Piazza de Lima Fagundes";
        Alexandre.Datadenascimento = 2004;
        Alexandre.cpf = "061.577.352-44";
        Alexandre.Endereco = "Rua das Petunias, 525, Jardim Paraiso";
        Alexandre.Cidade = "Sinop";
        Alexandre.Telefone = "(66) 9 8135-7184";
        Alexandre.ativo = Alexandre.ativo;
        alunos.add(Alexandre);
        
        Aluno Joao = new Aluno();
        Joao.Nome = "Joao";
        Joao.Sobrenome = "Silva";
        Joao.Datadenascimento = 2000;
        Joao.cpf = "123.456.789-00";
        Joao.Endereco = "Rua das Flores, 123, Centro";
        Joao.Cidade = "Sinop";
        Joao.Telefone = "(66) 9 1234-5678";
        Joao.ativo = true;
        alunos.add(Joao);

        Aluno Maria = new Aluno();
        Maria.Nome = "Maria";
        Maria.Sobrenome = "Alencar";
        Maria.Datadenascimento = 2001;
        Maria.cpf = "123.456.789-00";
        Maria.Endereco = "Rua das Ipomeias, 543, Jardim Botanico";
        Maria.Cidade = "Sinop";
        Maria.Telefone = "(66) 9 2574-5678";
        Maria.ativo = true;
        alunos.add(Maria);

        var scanner = new Scanner(System.in);
        System.out.print("Qual aluno deseja buscar? Digite o nome: ");
        String nomeBuscado = scanner.nextLine();

        Aluno alunoBuscado = buscarAlunoPorNome(nomeBuscado, alunos);
        if (alunoBuscado != null) {
            System.out.println("O aluno buscado é:");
            System.out.println(alunoBuscado.DadosBasicos());
        } else {
            System.out.println("Não foi encontrado nenhum aluno com o nome " + nomeBuscado);
        }
    }

    public static Aluno buscarAlunoPorNome(String nome, List<Aluno> listaAlunos){
        for (Aluno aluno : listaAlunos) {
            if (aluno.Nome.equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
}
