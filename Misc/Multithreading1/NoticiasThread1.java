package multiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NoticiasThread1 extends Thread { // essa classe herda as propriedades da Thread class

	@Override //sobrescreve o método run() da Thread class
	public void run() {
		List<String> fatosMetal = new ArrayList<>(); //instanciamento da lista
		fatosMetal.add("O álbum Obscura do Gorguts redefiniu completamente o death metal técnico");
        fatosMetal.add("Mastodon tem um álbum chamado Crack the Skye em homenagem à irmã de seu baterista");
        fatosMetal.add("Chuck Schuldiner é considerado o pai do death metal");
        fatosMetal.add("O termo ''Djent'' foi inventado graças ao Meshuggah com seus riffs sincopados");
        fatosMetal.add("Opeth já tocou prog death e depois virou praticamente prog rock");
        fatosMetal.add("Tool demorou 13 anos para lançar o álbum Fear Inoculum");
        fatosMetal.add("Death foi praticamente o berço do death metal técnico e progressivo");
        fatosMetal.add("Gojira é famoso por ativismo ambiental e músicas pesadíssimas");
        fatosMetal.add("A banda Atheist mistura jazz com death metal desde os anos 90");
        fatosMetal.add("Carcass começou como grindcore e virou melodeath com o tempo");
        Collections.shuffle(fatosMetal); //randomiza a ordem da lista
        
        for (String fatoLegal : fatosMetal) {
        	System.out.println("fato legal sobre metal: " +fatoLegal);
        	try { 
				Thread.sleep(8000); //espera 8 segundos (8.000ms) pra cada print
			} catch (InterruptedException e) {
				e.printStackTrace();
				/*resumo chulo do porquê o try/catch é obrigatório:
      		    o sleep() PODE lançar uma exception que o 
      		    compilador TE OBRIGA a tratar com o try/catch
      		    senão NÃO compila*/
			}
        }

	}
}
