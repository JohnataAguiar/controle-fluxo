import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        // Criando as váriaveis
        byte mediaNota, notaAluno1,notaAluno2,notaAluno3,notaAluno4,notaAluno5;
        int notaMedia, pontosAtribuir,pontosAluno, userInput;
        String nomeAluno;
        // 

        pontosAluno = 0;
        mediaNota = 6;
        
        Scanner scanner = new Scanner(System.in);

        // Recebendo a entrada das notas
        System.out.print("Nome do aluno --> ");
        nomeAluno = scanner.next();
        System.out.println("==============================");

        System.out.print("Nota 1 --> ");
        notaAluno1 = scanner.nextByte();

        System.out.print("Nota 2 --> ");
        notaAluno2 = scanner.nextByte();

        System.out.print("Nota 3 --> ");
        notaAluno3 = scanner.nextByte();

        System.out.print("Nota 4 --> ");
        notaAluno4 = scanner.nextByte();

        System.out.print("Nota 5 --> ");
        notaAluno5 = scanner.nextByte();
        System.out.println("==============================");

        scanner.close();
        // 

        // Calculando a média
        notaMedia = (notaAluno1+notaAluno2+notaAluno3+notaAluno4+ notaAluno5) / 5;
        // 

        // Condicionais
        if(notaMedia >= mediaNota){
            System.out.println("Aluno: " + nomeAluno + " -- > Aprovado");
            System.out.println("==============================");

        }else if (notaMedia == mediaNota) {
            System.out.println("Aluno: " + nomeAluno + "--> Na média, precisa estudar mais");
            System.out.println("==============================");
         
        // Se cair nessa condição o código continua
        }else{
            System.out.println("Aluno: " + nomeAluno + "--> Reprovado");
            System.out.println("A média foi --> " + notaMedia);
            System.out.println("==============================");
        }
        // 

        // Caso o aluno esteja reprovado
        System.out.println("==============================");
        System.out.println("Aluno possui pontos para destribuir ?");
        System.out.println("1 para sim e 2 para não");
        userInput = scanner.nextInt();
        System.out.println("==============================");
        // 
        
        // Se o aluno tiver pontos para atribuir
        if(userInput == 1){
            System.out.println("==============================");
            System.out.print("Pontos -->  ");
            pontosAtribuir = scanner.nextInt();
            pontosAluno = pontosAluno + pontosAtribuir;
            System.out.println("Aluno: " + nomeAluno + " " + "tem --> " + pontosAluno + " " + "Ponto para atribuir");
            System.out.println("==============================");
        }else{
            System.out.println("Sem pontos para atribuir");
        }
        // 

        // Mostrando resultado já com atribuição de pontos 
        System.out.println("==============================");
        System.out.println("A media do aluno: " + nomeAluno + " " + "foi --> " + notaMedia);
        System.out.println("E tem --> " + pontosAluno+ " " + "Pontos para atribuir");
        System.out.println("==============================");
        int mediaMpontos = pontosAluno + notaMedia;

        if(mediaMpontos >= mediaNota){
            System.out.println("Aluno aprovado!");
        }else{
            System.out.println("Média final com pontos = " +  mediaMpontos);
            System.out.println("Aluno reprovado!");
            System.out.println("Média insuficiente");
            System.out.println("==============================");
        }
        // 

    }   
}

