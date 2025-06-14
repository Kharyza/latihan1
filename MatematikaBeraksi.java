package latihan1;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika
        Matematika azmi = new Matematika(2, 3);

        // Menampilkan hasil operasi
        System.out.println("Hasil penjumlahan: " + azmi.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + azmi.setPengurangan());
        System.out.println("Hasil perkalian: " + azmi.setPerkalian());
        System.out.println("Hasil pembagian: " + azmi.setPembagian());
    }
}
