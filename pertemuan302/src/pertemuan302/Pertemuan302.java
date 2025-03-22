package pertemuan302;

import java.util.Scanner;

/**
 *
 * @author Edy
 * tgl 22 Maret 2025
 */
public class Pertemuan302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nilai dinyatakan lulus apabila 75 keatas
        int nilai = 0;
        String nama, nim;
        String ket = "";
        
        Scanner dtIN = new Scanner(System.in);
        
        System.out.print("Input Nama Mahasiswa : ");
        nama = dtIN.nextLine();
        
        System.out.print("Input Nim Mahasiswa : ");
        nim = dtIN.nextLine();
        
        System.out.print("Input Nilai Mahasiswa : ");
        nilai = Integer.parseInt(dtIN.nextLine());

        if(nilai>=75){
            ket = "Lulus";
        }else{
            ket = "Tidak Lulus";
        }
        
        System.out.printf("Nilai mahasiswa dengan nama %s(%s) adalah %d dinyatakan %s", nama,nim,nilai,ket);
    }
    
}
