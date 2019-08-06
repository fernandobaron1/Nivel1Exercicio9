
package nivel1exercicio9;

import java.util.Scanner;


public class Nivel1Exercicio9 {

    
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe Número de Horas Trabalhadas:");
        double horasTrabalhadas = leia.nextDouble();
        
        System.out.println ("Informe o valor de cada hora:");
        double valorHora = leia.nextDouble();
        
        double salarioTotal = (valorHora * horasTrabalhadas);
        System.out.println (salarioTotal);
        
        double resultado = (((horasTrabalhadas - 160)* valorHora) * 50/100);
        
        double resultadoTotal = (resultado + salarioTotal);
        
         if (horasTrabalhadas > 160) {
    System.out.println (resultadoTotal); 
    } else {
            System.out.println ("");                
    }

    }
    
}
