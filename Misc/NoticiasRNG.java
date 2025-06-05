/*exemplo basico da Random() class
(entretanto os numeros podem se repetir)*/

package multiThreading;

import java.util.Random; //classe que gera numeros aleatorios

public class NoticiasMain {

	public static void main(String[] args) {
		
		Random r = new Random(); //instanciamento da classe Random()

		for (int i = 0; i < 9; i++) {
			
			int rn1 = r.nextInt(9); //gera um numero aleatorio entre 0 e 9 (10 possibilidades)
			
			switch(rn1) { //escreve fatos aleatorios sobre metal
			case 0:
				System.out.println("A Finlândia tem o maior número de bandas de heavy metal per capita");
				break;
			case 1:
				System.out.println("O diretor de vários clipes da Lady Gaga era já foi membro do Bathory");
				break;
			case 2:
				System.out.println("Chuck Schuldiner do Death gostava muito de gatos");
				break;
			case 3:
				System.out.println("O primeiro vocal gutural gravado da história é de 1966, em “21st Century Schizoid Man” do King Crimson");
				break;
			case 4:
				System.out.println("O nome “Black Sabbath” veio de um filme de terror italiano de 1963");
				break;
			case 5: 
				System.out.println("O Iron Maiden tem um Boeing 747 próprio, pilotado pelo vocalista Bruce Dickinson");
				break;
			case 6:
				System.out.println("Slayer é uma das únicas bandas com logo banido em escolas nos EUA por “satanismo”");
				break;
			case 7:
				System.out.println("Chuck Schuldiner do Death é considerado “o pai do death metal”");
				break;
			case 8:
				System.out.println("A música Master of Puppets contém partes medidas em tempos de 21/32 sem motivo aparente");
				break;
			case 9:
				System.out.println("A música Dance of Eternity do Dream Theater contém 106 mudanças de tempo em 6 minutos");
			}
		}
	}

}
