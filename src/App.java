import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double arquivo;
    double velocidade;
    double tempo;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe o tabanho do arquivo");
    arquivo = teclado.nextDouble();
    System.out.println("Informe a velocidade de um link de internet");
    velocidade = teclado.nextDouble();
    // passo 3: calcular 
    tempo = (arquivo / (velocidade / 8)) / 60;
    // passo 4: exibir 
    System.out.println("O tempo aproximado de download do arquivo usando este link (em minutos) é : " + tempo);
  }
}