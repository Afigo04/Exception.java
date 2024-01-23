/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author user
 */
public class AritmetchicExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public int divide(int a, int b) {
        int result = a / b;
        return result;
    }
    public static void main(String[] args) {
        AritmetchicExceptionDemo demo = new AritmetchicExceptionDemo();
        try {
            demo.divide(100, 5);
            System.out.println("Pembagian berhasil");
        }catch(Exception e) {
            System.out.println("Pembagian gagal");
        }
    }
    
}
