package orm.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "nome")
    private String nome;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "cpf")
    private String cpf;
	
	@Column(name = "dataNascimento")
    private String dataNascimento;
	
	@Column(name = "naturalidade")
    private String naturalidade;
    
    @Column(name = "endereco")
    private String endereco;
    
    // Construtor padrão necessário para o Hibernate
    public Aluno() {
    }
    
    // Construtor com parâmetros para inicializar os campos obrigatórios
    public Aluno(int id, String nome, String email, String cpf, String dataNascimento, String naturalidade, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.naturalidade = naturalidade;
        this.endereco = endereco;
    }

    // Métodos Getters e Setters (pode ser gerado automaticamente pela IDE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Outros métodos, se necessário
}

