/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Joshu
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double sum;
        double sub;
        double prod;
        double div;
        
        
        num1 = 36;
        num2 = 12;
        
        
        sum = num1 + num2;
        prod = num1 * num2;
        div = num1 / num2;
        sub = num1 - num2;
         
        
        
        System.out.println("Addition: "+ num1 + " + " + num2 +  " = " + sum);
        
        System.out.println("Subtraction: "+ num1 + " - " + num2 +  " = " + sub);
        
        System.out.println("Multiplication :"+ num1 + " * " + num2 +  " = " + prod);
          
        System.out.println("Division: "+ num1 + " / " + num2 +  " = " + div);
        // TODO code application logic here
    }
    
}
