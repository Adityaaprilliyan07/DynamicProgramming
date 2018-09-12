/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungfibonacci;

/**
 *
 * @author Asus
 */
public class HitungFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        System.out.println("\nHitung Fibonancci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args ){
        String identitas = "Aditya Aprilliyan Putra / XR5 / 02";
        tampilJudul(identitas);
    }
    
}
