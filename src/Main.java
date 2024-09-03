import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        aluno aluno = new aluno();

        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        aluno.setNome(nome);

        System.out.print("1 Nota: ");
        int nota1 = leitor.nextInt();
        aluno.setNota1(nota1);

        System.out.print("2 Nota: ");
        int nota2 = leitor.nextInt();
        aluno.setNota2(nota2);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());

        double media = (aluno.getNota1() + aluno.getNota2()) / 2.0;
        System.out.println("Média: " + media);
    }
}
