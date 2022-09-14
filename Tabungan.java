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
public class Tabungan {

    private String idTabungan;
    private String password;
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(String idT, String pass, int saldo) {
        this.idTabungan = idT;
        this.password = pass;
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public boolean Transfer(Tabungan t, int jumlah) {
        if (this.saldo > jumlah) {
            t.saldo += jumlah;
            this.saldo -= jumlah;
            System.out.println("Transaksi Sukses");

        } else {
            System.err.println("Transaksi Gagal");

        }
        return false;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Tabungan{" + "idTabungan=" + idTabungan + ", password=" + password + ", saldo=" + saldo + '}';
    }

}
