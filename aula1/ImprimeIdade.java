package aula1;

public class ImprimeIdade {
    public static void main(String[] args) {
        int idade = 33;
        String nome = "Ricardo Assis";
        double altura = 1.83;
        double peso = 142.58;

        double imc = (peso) / (altura * altura);

        System.out.println("OLá " + nome);
        if (idade >= 45) {
            if (imc < 22) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " risco de subnutrição");
            } else if (imc <= 30) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Isso aí garoto");
            } else if (imc <= 35) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Opa!!! pode estar pesado CUIDADO ");
            } else {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Procure um médico e um Nuticionista");
            }

        } else {
            if (imc <= 18) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Procure um médico para avaliação de  subnutrição");
            } else if (imc <= 26) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Seu indice está controladao e saudável Procure um nutricionista");
            } else if (imc <= 32) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Parabéns procure um médico para medição muscular e acompanhamento");
            } else if (imc <= 40) {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Pré Obesidade precisará de acompanhamento médico e nutricional ");
            } else {
                System.out.println(" IMC = " + imc + " sua idade e " +
                        idade + " Procure um médico endocrinologista com urgência");
            }
        }
    }
}