package orm.testes;

import orm.modelo.Aluno;
import orm.modelo.AlunoDAO;

import java.util.List;

public class TesteListagemAlunos {

    public static void main(String[] args) {
        // Listando os alunos do banco de dados
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunos = alunoDAO.listarAlunos();

        if (alunos == null) {
            System.out.println("Erro ao listar alunos.");
            return;
        }

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getId());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("CPF: " + aluno.getCpf());
                System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
                System.out.println("Naturalidade: " + aluno.getNaturalidade());
                System.out.println("Endereço: " + aluno.getEndereco());
                System.out.println("-------------------------");
            }
        }
    }
}
