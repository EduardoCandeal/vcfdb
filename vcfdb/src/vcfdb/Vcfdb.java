/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vcfdb;
import java.util.Scanner;
import java.io.*;
import picard.PicardException;
import picard.vcf.*;
import picard.*;
/*
 *
 * @author ecandeal
 */
public class Vcfdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException, IOException {
        System.out.println("prueba2");
        File file = new File("/home/ecandeal/NetBeansProjects/vcfdb/test/test1.vcf");
        File file2 = new File("/home/ecandeal/NetBeansProjects/vcfdb/test/test2.vcf");
        FileReader fr2= new FileReader(file);
       FileInputStream fis = new FileInputStream(file);
       SortVcf are= new SortVcf();
       are.INPUT.add(file);
       are.INPUT.add(file2);
       are.getCommandLine();
       GenotypeConcordance asd= new GenotypeConcordance();
      
       
        System.out.println(are.getCommandLine());
     
        //System.out.println(fis.available());
        //System.out.println(fr2.read());
     
        
 
        
        //System.out.println(as.INPUT.length());
        
    } 
    
}
