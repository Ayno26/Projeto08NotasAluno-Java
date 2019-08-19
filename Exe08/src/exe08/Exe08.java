/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe08;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exe08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Solicite ao usuario que informe o Nome de um aluno e suas tres 
        Notas (de 0 a 10), e calcule a média e teste as condições: */
        /*
        1) Se a média for menor ou igual a 5.0 (Reprovado)
        2) Se a média for menor ou igual a 7.0 (Aprovado)
        3) Se a média for menor ou igual a 9.0 (Muito Bom)
        4) Se a média for maior ou igual a 9.0 (Excelente)
        */
        
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3;
        float media;
        
        System.out.println("Digite a primeira nota: ");
        num1 = entrada.nextFloat ();
        System.out.println("Digite a segunda nota: ");
        num2 = entrada.nextFloat ();
        System.out.println("Digite a terceira nota: ");
        num3 = entrada.nextFloat ();
        
        media = (num1 + num2 + num3) / 3;
        
        if (media <= 5){
            System.out.println("Reprovado (média: " + media + ")");
        }
        else{
            System.out.println("Aprovado (média: " + media + ")");
            if (media <= 9){
                System.out.println("Muito Bom!");
            }
            else{
                System.out.println("Excelente!");
            }
        }
    }
    
}
