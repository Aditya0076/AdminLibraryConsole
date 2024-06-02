package com.majujaya.AdminLibrary;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        String user = "";
        String pass = "";
        System.out.println("=".repeat(50));
        System.out.println("Login");
        System.out.println("=".repeat(50));
        System.out.print("Username : ");
        user = input.nextLine();
        System.out.print("Password : ");
        pass = input.nextLine();
        if (username.equals(user) && password.equals(pass)) {
            System.out.println("=".repeat(50));
            System.out.println("Login Berhasil");
            System.out.println("=".repeat(50));
            int menu = 0;
            do {
                mainMenu();
                System.out.print("Pilih Menu : ");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        bookMenu();
                        break;
                    case 2:
                        memberMenu();
                        break;
                    case 3:
                        loanMenu();
                        break;
                    case 4:
                        returnMenu();
                        break;
                    case 0:
                        System.out.println("Terima kasih");
                        break;
                    default:
                        System.out.println("Menu tidak tersedia");
                        break;
                }
            }while (menu != 0);
        }else {
            System.out.println("=".repeat(50));
            System.out.println("Login Gagal");
            System.out.println("=".repeat(50));
        }

    }

    static void mainMenu(){
        System.out.println("=".repeat(50));
        System.out.println("Selamat Datang di Perpustakaan Maju Jaya");
        System.out.println("=".repeat(50));
        System.out.println("1. Buku");
        System.out.println("2. Anggota");
        System.out.println("3. Peminjaman");
        System.out.println("4. Pengembalian");
        System.out.println("0. Keluar");
        System.out.println("=".repeat(50));
    }
    static String []book= new String[0];
    static void bookMenu(){
        int menu= 0;
        do {
            System.out.println("=".repeat(50));
            System.out.println("Menu Buku");
            System.out.println("=".repeat(50));
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Edit Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Kembali ke menu utama");
            System.out.println("=".repeat(50));
            System.out.print("Masukkan Menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    String[]book= addBook();
                    break;
                case 2:
                    getBook();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    book= deleteBook();
                    break;
                case 0:
                    input.nextLine();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }while (menu != 0);
    }


    static String[] addBook(){
        System.out.println("=".repeat(50));
        System.out.println("Menambahkan Buku");
        System.out.println("=".repeat(50));
        System.out.print("Masukkan jumlah buku: ");
        int sumBook = input.nextInt();
        input.nextLine();
        book = new String[sumBook];
        for (int i = 0; i < book.length; i++) {
            System.out.print("Judul Buku "+(i+1)+" : ");
            book[i] = input.nextLine();
            System.out.print("Pengarang "+(i+1)+" : ");
            book[i] = input.nextLine();
            System.out.print("Penerbit "+(i+1)+" : ");
            book[i] = input.nextLine();
        }
        System.out.println("=".repeat(50));
        return book;
    }


    static String getBook(){
        System.out.println("=".repeat(50));
        System.out.println("Tampilkan Buku");
        System.out.println("=".repeat(50));
        for (int i = 0; i < book.length; i++) {
            System.out.println("Buku ke-"+(i+1));
            System.out.println("Judul Buku : "+book[i]+", ");
            System.out.println("Pengarang  : "+book[i]+", ");
            System.out.println("Penerbit   : "+book[i]);
        }
        System.out.println("=".repeat(50));
        return "";
    }

    static void editBook(){
        System.out.println("=".repeat(50));
        System.out.println("Edit Buku");
        System.out.println("=".repeat(50));
        System.out.print("Masukkan indeks buku yang ingin di edit : ");
        int index = input.nextInt();
        input.nextLine();
        for(int i = 0; i < book.length; i++){
            if(i+1 == index){
                System.out.println("=".repeat(50));
                System.out.println("Buku ke-"+(i+1));
                System.out.println("Judul Buku : "+book[i]+", ");
                System.out.println("Pengarang  : "+book[i]+", ");
                System.out.println("Penerbit   : "+book[i]);
                System.out.println("=".repeat(50));
                System.out.print("Judul Buku "+(i+1)+" : ");
                book[i] = input.nextLine();
                System.out.print("Pengarang "+(i+1)+" : ");
                book[i] = input.nextLine();
                System.out.print("Penerbit "+(i+1)+" : ");
                book[i] = input.nextLine();
                System.out.println("=".repeat(50));
            }
        }
        System.out.println("=".repeat(50));
        System.out.println("Edit Buku Berhasil");
        System.out.println("=".repeat(50));
    }

    static String[] deleteBook(){
        System.out.println("=".repeat(50));
        System.out.println("Hapus Buku");
        System.out.println("=".repeat(50));
        System.out.print("Masukkan indeks buku yang ingin di hapus : ");
        int index = input.nextInt();
        input.nextLine();
        String []newBook = new String[book.length-1];
        int j=0;
        for(int i = 0; i < book.length; i++){
            if(i+1 != index){
                newBook[j] = book[i];
                j++;
                System.out.println("=".repeat(50));
                System.out.println("Buku berhasil di hapus");
            }
        }
        book = newBook;

        return book;
    }

    static void memberMenu(){
        System.out.println("=".repeat(50));
        System.out.println("Menu Anggota");
        System.out.println("=".repeat(50));
        System.out.println("1. Tambah Anggota");
        System.out.println("2. Tampilkan Anggota");
        System.out.println("3. Edit Anggota");
        System.out.println("4. Hapus Anggota");
        System.out.println("=".repeat(50));
    }

    static void loanMenu(){
        System.out.println("=".repeat(50));
        System.out.println("Menu Peminjaman");
        System.out.println("=".repeat(50));
        System.out.println("1. Tambah Peminjaman");
        System.out.println("2. Tampilkan Peminjaman");
        System.out.println("3. Edit Peminjaman");
        System.out.println("4. Hapus Peminjaman");
        System.out.println("=".repeat(50));
    }

    static void returnMenu(){
        System.out.println("=".repeat(50));
        System.out.println("Menu Pengembalian");
        System.out.println("=".repeat(50));
        System.out.println("1. Tambah Pengembalian");
        System.out.println("2. Tampilkan Pengembalian");
        System.out.println("3. Edit Pengembalian");
        System.out.println("4. Hapus Pengembalian");
        System.out.println("=".repeat(50));
    }
}
