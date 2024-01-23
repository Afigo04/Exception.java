/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exception;

/**
 *
 * @author user
 */
public class IndexOutOfBoundsExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number[] = {0,1,2,3,4,5,6};
        
        try{
            int x = number[3];
            System.out.println(x);
        }catch(IndexOutOfBoundsException e) {
            System.out.println("ERROR : Index yang anda berikan melewati batas");
        }
    }
    
}
