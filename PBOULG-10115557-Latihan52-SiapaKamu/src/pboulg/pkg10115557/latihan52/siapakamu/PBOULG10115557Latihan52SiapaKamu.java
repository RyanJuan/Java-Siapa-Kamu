/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan52.siapakamu;

/**
 *
 * @author RyanJuan
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program untuk menampilkan data kelinci
 */
public class PBOULG10115557Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Dosen dosen = new Dosen();
       
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        System.out.println("NIP Dosen : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        mhs.setNama("Nindi");
        mhs.setKelas("PBO2");
        mhs.setUmur(17);
        System.out.println("NIM MAHASISWA : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
