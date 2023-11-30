package orm.testes;

import orm.modelo.Aluno;
import orm.modelo.AlunoDAO;

import java.util.Scanner;

public class TesteInsercaoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserção de Aluno - Informe os dados:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Naturalidade: ");
        String naturalidade = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        // Criando objeto Aluno com os dados fornecidos pelo usuário
        Aluno novoAluno = new Aluno(0, nome, email, cpf, dataNascimento, naturalidade, endereco);

        // Inserindo o aluno no banco de dados usando o AlunoDAO
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.inserirAluno(novoAluno);

        System.out.println("Aluno inserido com sucesso!");

        // Fechando o scanner
        scanner.close();
    }
}

