import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    int numero;
    int soma = 1;
    System.out.println("Digite um número:");
    Scanner n = new Scanner(System.in);
    numero = n.nextInt();
    if(numero != 0){
      int resultado = numero - soma++;
      System.out.println(resultado);
    }

  }
}









/*Crie um algoritmo recursivo que, a partir de um nú-
mero n, calcule a soma dos elementos do conjunto
formado pelos números de zero até n.*/
