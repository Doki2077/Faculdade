import java.util.Scanner;



/* testando comentários em múltiplas linhas.
* eles são uma boa prática no mundo Java.
* não são obrigatórios mas são úteis
*
 */


/* Criando a classe
 */

 public class TiposPrimitivos {
     public static void main(String [] args){

  /* aqui utilizo e aprendo novas funçoes!!!
  * funçao new,Scanner e o System.in!!!!
  *
  * Também delcaro um obejeto,que no caso é um teclado.
  * pra poder dar interatividade com o usuário, coloquei uma caixa de entrada, para que ele digite.
  * O comando que deixa que ele interaja com o programa é o System.in pois ele funciona como entrada de dados.
  * o comando .nextFloat() me retorna um número. Que no caso desse programa, quem insere o número é o usuário,
  * por isso ENTRADA DE DADOS E System.in
  * !!
  * sempre lembrar que: "print serve para exibir uma mensagem,e println para não exibir mensagens na mesma linha de texto,
  * MESMO ANTES DE FICAR LOTADA" !!!!!!!!
  */
         Scanner teclado = new Scanner(System.in);
         System.out.print("Insira o nome do aluno: ");
         String nome = teclado.nextLine();
         System.out.print("Insira a nota do aluno:");
         float nota = teclado.nextFloat();
         System.out.format("A nota de %s é %1f \n", nome, nota);


  }

}