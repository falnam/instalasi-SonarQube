// BankTransferPayment.java - Implementasi pembayaran transfer bank
// Menerapkan SRP - Hanya bertanggung jawab untuk pembayaran dengan transfer bank
// Menerapkan LSP - Dapat menggantikan Payment tanpa mengubah perilaku
package model;

public class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan Transfer Bank.");
    }
}