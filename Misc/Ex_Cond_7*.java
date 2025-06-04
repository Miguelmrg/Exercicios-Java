/*Faça um programa que pede o dia e mês de aniversário e diz quantos dias faltam para o aniversário, 
quantos dias se passaram do aniversário ou se hoje é o aniversário do usuário. 
- Não utilizar bibliotecas -
*/

package	defaultPackage;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("digite o dia de hoje: ");
        int diaHoje = sc.nextInt();
        System.out.println("digite o mes de hoje: ");
        int mesHoje = sc.nextInt();

        System.out.print("digite o dia do seu aniversário: ");
        int diaAniv = sc.nextInt();
        System.out.print("digite o mês do seu aniversário: ");
        int mesAniv = sc.nextInt();

        int hoje = diaDoAno(diaHoje, mesHoje, diasMes);
        int aniversario = diaDoAno(diaAniv, mesAniv, diasMes);

        if (hoje == aniversario) {
            System.out.println("hoje é seu aniversário");
        } else if (hoje < aniversario) {
            int diasFaltando = aniversario - hoje;
            System.out.println("faltam " + diasFaltando + " dias para o seu aniversário");
        } else {
            int diasPassados = hoje - aniversario;
            System.out.println("já se passaram " + diasPassados + " dias do o seu aniversário");
        }

        sc.close();
    }

    public static int diaDoAno(int dia, int mes, int[] diasMes) {
        int total = 0;
        for (int i = 0; i < mes - 1; i++) {
            total += diasMes[i];
        }
        total += dia;
        return total;
    }
}
