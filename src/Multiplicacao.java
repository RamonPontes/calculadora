
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
        Entradas.getInput();
        
        int result = Entradas.getN1() * Entradas.getN2();
        
        System.out.println("Resultado: " + result);
    }
}
