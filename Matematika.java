package latihan1;

public class Matematika {
    // Deklarasi atribut
    private double bil1;
    private double bil2;

    // Konstruktor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method penjumlahan
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Method pengurangan
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method perkalian
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method pembagian
    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}
