package orm.testes;

import orm.modelo.Aluno;
import orm.modelo.AlunoDAO;

import java.util.List;
import java.util.Scanner;

public class TesteListagemPorLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a letra inicial do nome para filtrar: ");
        String letra = scanner.nextLine();

        // Listando os alunos filtrados por letra
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunosFiltrados = alunoDAO.listarAlunosPorLetra(letra);

        if (alunosFiltrados == null) {
            System.out.println("Erro ao listar alunos.");
            return;
        }

        if (alunosFiltrados.isEmpty()) {
            System.out.println("Nenhum aluno encontrado com a letra " + letra);
        } else {
            System.out.println("Lista de Alunos com a letra " + letra + ":");
            for (Aluno aluno : alunosFiltrados) {
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

        // Fechando o scanner
        scanner.close();
    }
}

