/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outputfile;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author sande
 */
public class OutputFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 50");
        int a = scan.nextInt();
        while (a < 1 || a > 50){
            System.out.println("Please enter a number between 1 - 50");
            a = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Please enter the name of the output file");
        String userOutputFilename = scan.nextLine();
        PrintWriter pw = new PrintWriter(userOutputFilename);
            for (int i = a; i < 101; i += 1){
                pw.println(Math.pow(i, 2));
                System.out.println(Math.pow(i, 2));
            }
        pw.close();
    }
    
}
