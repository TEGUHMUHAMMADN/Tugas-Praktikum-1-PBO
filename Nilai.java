/*
 *Nama:Teguh Muhammad Nurhakim
 *NPM:2310631170054
 *Kelas : 3F
 */

package latihan;

  


public class Nilai {

    String NPM;
    String Nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
     public void Nilai(String nim, String nama, double absen, double tugas, double uts, double uas) {
        this.NPM = nim;
        this.Nama = nama;
        this.nilaiAbsen = absen;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        
        this.nilaiAkhir = (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

     }
      public void CetakNilai() {
        System.out.println("NIM : " + NPM);
        System.out.println("Nama : " + Nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
      }

    
    
}
