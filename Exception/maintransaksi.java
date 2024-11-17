import java.util.InputMismatchException;
import java.util.Scanner;

public class maintransaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input untuk No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
            if (noFaktur.isEmpty()) {
                throw new NullPointerException("No Faktur tidak boleh kosong.");
            }

            // Input untuk Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();
            if (kodeBarang.isEmpty()) {
                throw new NullPointerException("Kode Barang tidak boleh kosong.");
            }

            // Input untuk Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
            if (namaBarang.isEmpty()) {
                throw new NullPointerException("Nama Barang tidak boleh kosong.");
            }

            // Input untuk Harga Barang
            System.out.print("Masukkan Harga Barang: ");
            int hargaBarang = scanner.nextInt();
            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang harus lebih dari 0.");
            }

            // Input untuk Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");
            }

            // Membuat objek faktur (menggunakan inheritance)
            faktur faktur = new faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Memanggil dan menampilkan detail transaksi pada Class faktur
            faktur.tampilkanDetail();

        } catch (InputMismatchException e) {
            // Menangani kesalahan input pada integer jika yang dimasukkan bukan angka
            System.out.println("Kesalahan input: Harap masukkan angka yang valid.");
        } catch (IllegalArgumentException e) {
            // Menangani kesalahan input pada integer dengan nilai yang tidak valid seperti harga atau jumlah beli <= 0
            System.out.println("Kesalahan input: " + e.getMessage());
        } catch (NullPointerException e) {
            // Menangani input yang kosong pada string No Faktur, Kode Barang, atau Nama Barang
            System.out.println("Kesalahan input: " + e.getMessage());
        } catch (Exception e) {
            // Menangani pengecualian lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Apapun yang terjadi program akan menutup scanner
            scanner.close();
        }
    }
}
