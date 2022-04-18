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
		
		aluno1.getDisciplinca().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplinca().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplinca().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplinca().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplinca().setDisciplina1(disciplina1);
		aluno1.getDisciplinca().setDisciplina1(disciplina2);
		aluno1.getDisciplinca().setDisciplina1(disciplina3);
		aluno1.getDisciplinca().setDisciplina1(disciplina4);
		
		
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = "+aluno1.getMediaNotas());
		System.out.println("Resultado = "+aluno1.getAlunoAprovado());
	
	}

}
