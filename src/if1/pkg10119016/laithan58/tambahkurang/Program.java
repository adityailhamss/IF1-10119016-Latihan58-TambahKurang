package if1.pkg10119016.laithan58.tambahkurang;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * hasil pertambahan & pengurangan bilangan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JumlahBilangan penjumlahan;
        SelisihBilangan pengurangan;
        
        penjumlahan = new JumlahBilangan();
        penjumlahan.tampilHasilJumlah();
        
        pengurangan = new SelisihBilangan();
        pengurangan.tampilSelisih();
    }
    
}