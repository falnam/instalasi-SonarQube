// Package service - Berisi kelas-kelas untuk mengelola layanan pembayaran
package service;

import model.Payment;
import model.Transaction;

// PaymentProcessor.java - Mengelola proses pembayaran
// Menerapkan SRP - Hanya bertanggung jawab untuk memproses pembayaran
// Menerapkan DIP - Bergantung pada abstraksi Payment dan TransactionHistory, bukan implementasi konkret
public class PaymentProcessor {
    private TransactionHistory transactionHistory; // Dependency injection

    // Konstruktor dengan dependency injection, memungkinkan lebih fleksibel
    public PaymentProcessor(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    // Menggunakan abstraksi Payment, alih-alih implementasi konkret
    // Menerapkan OCP - Metode ini dapat menerima berbagai jenis Payment baru tanpa perubahan
    public void processTransaction(String id, double amount, Payment paymentMethod) {
        Transaction transaction = new Transaction(id, amount, paymentMethod);
        transaction.processPayment();
        transactionHistory.addTransaction(transaction);
    }
}