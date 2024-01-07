package aula1;

public class AvaliaAluno {
    public static void main(String[] args) {
        String aluno = "Ricardo Assis";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.1;
        double media = 0;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        if(skl == true){media = (nota1*fator1) + (nota2*fator2) + (nota3*fator2);
            System.out.println("Aluno = " +aluno);
            System.out.println("Média = "+media);
            if(media>=7) {
                System.out.println("Aluno com estagio aprovado" );   
            }else{
                System.out.println("Aluno com estagio reprovado" );   
            }
        }else{
            media = (nota1*fator2) + (nota2*fator2) + (nota3*fator1);
            System.out.println("Aluno = " +aluno);
            System.out.println("Média = "+media);
            if(media>=7) {
                System.out.println("Aluno sem estagio aprovado ");   
            }else{
                System.out.println("Aluno sem estágio reprovado ");
            }
        }
    }
}
