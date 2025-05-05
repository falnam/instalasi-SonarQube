// Package main - Berisi kelas utama yang menjalankan aplikasi
package main;

import model.*;
import service.PaymentProcessor;
import service.TransactionHistory;
import java.util.Scanner;

// Main.java - Program utama yang menjalankan sistem
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membuat objek-objek yang dibutuhkan
        TransactionHistory history = new TransactionHistory();
        
        // Menerapkan DIP - menggunakan dependency injection
        PaymentProcessor processor = new PaymentProcessor(history);
        
        // Membuat berbagai metode pembayaran - menerapkan OCP dan LSP
        Payment creditCard = new CreditCardPayment();
        Payment eWallet = new EWalletPayment();
        Payment bankTransfer = new BankTransferPayment();
        
        // Simulasi transaksi - menunjukkan LSP di mana berbagai implementasi Payment
        // dapat digunakan tanpa perubahan perilaku pada PaymentProcessor
        processor.processTransaction("TXN001", 100.000, creditCard);
        processor.processTransaction("TXN002", 200.000, eWallet);
        processor.processTransaction("TXN003", 300.000, bankTransfer);
        
        // Menampilkan riwayat transaksi
        history.showTransactions();
        
        // Fitur interaktif untuk melihat riwayat transaksi
        System.out.println("\nIngin melihat riwayat transaksi lagi? (y/n)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            history.showTransactions();
        }
        
        System.out.println("Terima kasih telah menggunakan sistem pembayaran!");
        scanner.close();
    }
}