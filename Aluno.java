public class Aluno {
   String Nome;
   String Sobrenome;
   int Datadenascimento;
   String cpf;
   String Endereco;
   String Cidade;
   String Telefone;
   boolean ativo;

    void ativar(){
        if(ativo){
           return;
        }else{
           System.out.println("Usuário Ativo");
           ativo = true;
        }
     }

     void inativar(){
        if(!ativo){
           return;
        }else{
           System.out.println("Usuário Inativo");
           ativo = false;
        }
     }

     String DadosBasicos(){
      return "Nome: "+ Nome + "\n" + "Sobrenome: " + Sobrenome + "\n" + "CPF: " + cpf + "\n" + "status: " + ativo;
     }

     Cadastro aluno = new Cadastro();
}