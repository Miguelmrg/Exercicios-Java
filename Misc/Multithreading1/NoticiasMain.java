package multiThreading;

public class NoticiasMain {

	public static void main(String[] args) {

		NoticiasThread1 mostradorFatos = new NoticiasThread1();
		NoticiasThread2 mostradorHora = new NoticiasThread2();
		//instanciamento de objetos das classes 
		
		mostradorFatos.start();
		mostradorHora.start();
		
		
	}

}
