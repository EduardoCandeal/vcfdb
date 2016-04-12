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
import picard.sam.*;
import htsjdk.samtools.*;
import htsjdk.tribble.index.Block;
import htsjdk.tribble.index.Index;
import htsjdk.tribble.util.LittleEndianOutputStream;
import htsjdk.variant.vcf.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import picard.cmdline.Option;

/*
 *
 * @author ecandeal
 */
public class Vcfdb extends SortVcf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("prueba2");
      
        File file = new File("/Users/Edu/NetBeansProjects/vcfdb/test/test1.vcf");
        File file2 = new File("/Users/Edu/NetBeansProjects/vcfdb/test/test2.vcf");
        String[] paths;
        paths=file.list();
        System.out.println(paths);
       SortVcf ad= new SortVcf();
       
       List<File> list = new ArrayList<>();
       list.add(0, file);
       list.add(1, file2);
    
        ad.INPUT.addAll(list);
        boolean add;
        add = ad.INPUT.add(file);
       
       ad.INPUT.add(1, file2);
       //ad.OUTPUT.getParentFile();
      
        File archivo = new File("/Users/Edu/NetBeansProjects/vcfdb/test/sort.vcf");
        BufferedWriter bw;
        //bw = new BufferedWriter(new FileWriter(archivo));
      //VCFFileReader ares = new VCFFileReader( file);

      
      
       //String hola=are.OUTPUT.getAbsolutePath();
      
    
     
        //System.out.println(are.getCommandLine());
    
  
        //System.out.println(fr2.read());
     
        
        //System.out.println(as.INPUT.length());
        
    } 
    
}
