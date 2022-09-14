/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author MSI TRIDENT
 */
public class TestLatihan {

    public static void main(String args[]) {
        int tmp;
        boolean status;
        Nasabah nasabah = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();

        System.out.println("Saldo awal : " + tmp);
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");
        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

        Nasabah budi = new Nasabah("Budi", "Hartono");
        budi.setTabungan(new Tabungan(10000));
        System.out.println(budi.toString());
        System.out.println(nasabah.toString());

        budi.getTabungan().Transfer(nasabah.getTabungan(), 5000);
        System.out.println(budi.toString());
        System.out.println(nasabah.toString());

    }
}
