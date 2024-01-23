/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author user
 */
public class NullPointerExceptionDemo {

    /**
     * @param args the command line arguments
     */
    
    static void foo(String x) {
        try {
            System.out.println("Huruf pertama dari kata yang anda masukkan :" + x.charAt(0));
        }catch(NullPointerException e) {
            System.out.println("NullPointerException throws");
            System.out.println("ERROR " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        
        foo(null);
        
    }
    
}
