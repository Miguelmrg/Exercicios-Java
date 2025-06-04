/*programa que calcula fatorial utilizando recursos de POO*/

package miscPackage;

public class FatorialPOO {

	private int numero;

	public FatorialPOO(int numero) {
		this.numero = numero;
	}

	public long calcular() {
		return calcularFatorialIterativo(numero);
	}

	private long calcularFatorialIterativo(int n) {
		long resultado = 1;
		for (int i = 2; i <= n; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		FatorialPOO f = new FatorialPOO(5);
		System.out.println("Fatorial de " + f.getNumero() + " é: " + f.calcular());
	}
}
