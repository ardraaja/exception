
class transaksi {
    // class induk dari class faktur
    String noFaktur, kodeBarang, namaBarang;
    int hargaBarang, jumlahBeli;

    // Konstruktor untuk menginisialisasi data transaksi
    public transaksi(String noFaktur, String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli) {
        this.noFaktur = noFaktur;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    // Metode untuk menghitung total harga
    public int hitungTotal() {
        return hargaBarang * jumlahBeli;
    }
}