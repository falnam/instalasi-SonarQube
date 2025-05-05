// CreditCardPayment.java - Implementasi pembayaran kartu kredit
// Menerapkan SRP (Single Responsibility Principle) - Hanya bertanggung jawab untuk pembayaran dengan kartu kredit
// Menerapkan LSP (Liskov Substitution Principle) - Dapat menggantikan Payment tanpa mengubah perilaku
package model;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar " + amount + " menggunakan Kartu Kredit.");
    }
}