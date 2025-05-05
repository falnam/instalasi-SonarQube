// TransactionHistory.java - Mengelola riwayat transaksi
// Menerapkan SRP - Hanya bertanggung jawab untuk menyimpan dan menampilkan riwayat transaksi
package service;

import model.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void showTransactions() {
        System.out.println("\n=== Riwayat Transaksi ===");
        if (transactions.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}