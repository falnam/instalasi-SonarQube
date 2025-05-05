// Transaction.java - Model untuk menyimpan informasi transaksi
// Menerapkan SRP - Hanya bertanggung jawab untuk menyimpan dan memproses satu transaksi
// Menerapkan DIP (Dependency Inversion Principle) - Bergantung pada abstraksi Payment, bukan implementasi konkret
package model;

public class Transaction {
    private String id;
    private double amount;
    private Payment paymentMethod; // Bergantung pada abstraksi Payment, bukan implementasi konkret

    public Transaction(String id, double amount, Payment paymentMethod) {
        this.id = id;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        paymentMethod.pay(amount); // Menggunakan abstraksi untuk proses pembayaran
        System.out.println("Transaksi " + id + " berhasil.");
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Jumlah: " + amount + ", Metode: " + 
               paymentMethod.getClass().getSimpleName();
    }
}