public class faktur extends transaksi {
    // Konstruktor faktur memanggil konstruktor kelasnya yaitu transaksi
    public faktur(String noFaktur, String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli) {
        super(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);  // Memanggil konstruktor Transaksi
    }

    // Metode untuk menampilkan detail transaksi
    public void tampilkanDetail() {
        System.out.println("\n=== DETAIL TRANSAKSI BARANG ===");
        System.out.println("No Faktur   : " + noFaktur);
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total  : " + hitungTotal());
    }
}
