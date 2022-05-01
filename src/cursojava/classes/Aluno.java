package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Esta classe representa o nosso objeto do mundo real3

public class Aluno {
	// Atributos do aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() {

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

//	MÉTODOS SETTER E GETTERS do Objeto
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getMediaNotas() {
	double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
			
		} return somaNotas / disciplinas.size();
	}

	public String getAlunoAprovado() {
		double media = this.getMediaNotas();
		if (media >=50) {
			if (media >=70) {
				return "Aluno aprovado";
			}else {
				return "Aluno em recuperação";
			}
		} else {
			return "Aluno reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

}