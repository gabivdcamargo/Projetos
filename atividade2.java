package primeiro_projeto;
import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		//Variáveis
		double horatrab,valorhora, salbruto,sallíquido,inss ;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Informe quantas horas você trabalhou: ");
		horatrab = ler.nextDouble ();
		
		System.out.println ("Informe quanto vale cada hora de trabalho: ");
		valorhora = ler.nextDouble();

		//Processamento
		salbruto = horatrab*valorhora;
				inss = salbruto*0.12;
		sallíquido = salbruto-inss;
		//Saída
		System.out.println("Indique o valor do salário líquido é: " +sallíquido+ "O valor do salário bruto é: " + salbruto").
        
	}

}
