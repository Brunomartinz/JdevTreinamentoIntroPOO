package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno ?");
		String disciplina1 = JOptionPane.showInputDialog("Informe o nome da disciplina 1: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String disciplina2 = JOptionPane.showInputDialog("Informe o nome da disciplina 2: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String disciplina3 = JOptionPane.showInputDialog("Informe o nome da disciplina 3: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String disciplina4 = JOptionPane.showInputDialog("Informe o nome da disciplina : ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
	
		Aluno aluno1 = new Aluno();
		
		aluno1.setDisciplina1(disciplina1);
		aluno1.setDisciplina2(disciplina2);
		aluno1.setDisciplina3(disciplina3);
		aluno1.setDisciplina4(disciplina4);
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota3));
		aluno1.setNota4(Integer.valueOf(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = "+aluno1.getMediaNotas());
		System.out.println("Resultado = "+aluno1.getAlunoAprovado());
	
	}

}
