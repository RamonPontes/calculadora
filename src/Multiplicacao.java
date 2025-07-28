
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info2
 */
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o numero 2: ");
        int n2 = scanner.nextInt();
        
        int result = n1 * n2;
        
        System.out.println("Resultado: " + result);
    }
}
