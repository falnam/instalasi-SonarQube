// Package model - Berisi antarmuka dan implementasi untuk metode pembayaran
package model;

// Payment.java - Interface untuk abstraksi metode pembayaran
// Menerapkan ISP (Interface Segregation Principle) - Interface hanya memiliki metode yang benar-benar diperlukan
// Menerapkan OCP (Open-Closed Principle) - Terbuka untuk ekstensi (metode pembayaran baru) tanpa mengubah kode lama
public interface Payment {
    void pay(double amount);
}