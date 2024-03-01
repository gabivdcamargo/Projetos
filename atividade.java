package primeiro_projeto;
import java.util.Scanner;
public class atividade {

	public static void main(String[] args) {
		//Variáveis
		String nome,idade;
		//Instaciar classe Scanner;
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Informe o nome: ");
		nome = ler.next();
		
		System.out.println ("Informe a idade: ");
		idade = ler.next();
		
		//Processamento
		System.out.println ("seu nome e idade é: " + nome + idade);
		
	}


}
