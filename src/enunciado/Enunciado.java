/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enunciado;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Enunciado {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Mono butler=new Mono();
       String Data=scanner.nextLine();
    if(!Data.contains("/")){
        System.err.println("Valores Invalidos");
        return;
    }
    String name=Data.split("/")[0];
    String Code=Data.split("/")[1];
       butler.DescifrarDatos(Code.trim(),name);    
    }
    
}
