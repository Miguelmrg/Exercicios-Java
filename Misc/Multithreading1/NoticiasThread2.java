package multiThreading;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NoticiasThread2 extends Thread{
	
	@Override
	public void run() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss"); //formata o horario pra hora/minuto/segundo
		
		for (int i = 0; i < 20; i++) {
			LocalTime horaSp = LocalTime.now(ZoneId.of("America/Sao_Paulo")); //atribuição do horario oficial de são paulo
			System.out.println("horário: " +horaSp.format(format));
			
			try {
				Thread.sleep(8005); /*espera 8,005 segundos pra cada print 
				                     (0,005 a mais que o Thread 1 para garantir
				                     que vem depois)*/
			} catch (InterruptedException e) {
				e.printStackTrace();
				//explicação do try/catch em NoticiasThread1.java
			}
		}
	}

}
