import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro parâmetro: ");		
		int parametroUm  = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {  contar(parametroUm, parametroDois);
			
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser menor que o primeiro");
			
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser menor que o primeiro");
		} 
			
		int contagem = parametroDois - parametroUm;	
		for(int i = 0; i <= contagem; i++) {
				System.out.println("Imprimindo numero" + i);
		}
		
			}
		
		
		
			
		
	}


