// EWalletPayment.java - Implementasi pembayaran e-wallet
// Menerapkan SRP - Hanya bertanggung jawab untuk pembayaran dengan e-wallet
// Menerapkan LSP - Dapat menggantikan Payment tanpa mengubah perilaku
package model;

public class EWalletPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan E-Wallet.");
    }
}
