package multiThreading;

public class StringABCMain extends Thread{

	private String proxLetra = "A"; //variavel que define a letra a ser impressa (começa com a)

	public synchronized void imprimir(String letra) { //método *synchronized pra não executar mais de 1 thread ao mesmo tempo
		
		try {
			sleep(200); //delay de 0,2s pra cada rodada
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			while (!letra.equals(proxLetra)) { /*enquanto o retorno do método for 
			 								 	igual à letra que será impressa, ele espera pra próxima vez*/
				wait(); //método de esperar
			}

			System.out.print(letra); //imprime letra

			switch (letra) { /*condicional simples que atualiza
							 a proxima letra de forma ciclica*/
			case "A":		 
				proxLetra = "B";
				break;
			case "B":
				proxLetra = "C";
				break;
			case "C":
				proxLetra = "A";
				break;
			}

			notifyAll(); //"acorda" as threads pra verificar se tão na sua vez

		} catch (InterruptedException e) {     /*EXPLICAÇÃO CHULA PORQUE EU SOU BURRO DEMAIS PRA ENTENDER ISSO
		 									    */
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) { //definição do método principal 
		StringABCMain controle = new StringABCMain(); //instanciamento do objeto que vai puxa
		
		/*Runnable é uma interface funcional (lambda) que 
		 * faz uma tarefa executável por thread 
		 * INTRODUZIDO NO JAVA 8*/
		Runnable printA = () -> {
			while (true) {
				controle.imprimir("A");
			}
		};

		Runnable printB = () -> {
			while (true) {
				controle.imprimir("B");
			}
		};

		Runnable printC = () -> {
			while (true) {
				controle.imprimir("C");
			}
		};
		
		//inicia as threads paralelamente
		new Thread(printA).start(); 
		new Thread(printB).start();
		new Thread(printC).start();
	}
}
