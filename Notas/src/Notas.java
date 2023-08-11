import java.util.Scanner;

public class Notas {
    public static void main(String[] args) throws Exception {

      double nota1, nota2, nota3, nota4, media;
      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor digite sua nota do primeiro bimestre: ");
      nota1 = sc.nextDouble();
      System.out.println("Por favor digite sua nota do segundo bimestre: ");
      nota2 = sc.nextDouble();
      System.out.println("Por favor digite sua nota do terceiro bimestre: ");
      nota3 = sc.nextDouble();
      System.out.println("Por favor digite sua nota do quarto bimestre: ");
      nota4 = sc.nextDouble();

      media = (nota1 + nota2 + nota3 + nota4) / 4;

      System.out.println("Sua nota é: " + media);

      if(media >= 7){
        System.out.println("Parabéns você passou de ano");

      }else if(media < 7 && media >5){
        System.out.println("Você está de recuperação!");
      }
      else{
        System.out.println("Você reprovou de ano!");
      }


    }
}
