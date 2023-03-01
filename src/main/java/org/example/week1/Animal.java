package org.example.week1;

/*
Modul 2
 */
public class Animal {

    String namaHewan; // kucingA

    String jenisHewan;

    /*
    constructor

    Kegunaan constructor itu biar
    TEPAT KETIKA MEMBUAT OBJEK, KALIAN BISA
    MENGISI NILAI PROPERTI OBJEK TERSEBUT
     */

    /*
    No Arg constructor
     */

    /*
    Overloading constructor/method

    Intinya kalian bisa punya
    1 atau lebih constructor atau method
    TETAPI
    JUMLAH DAN TIPE DATA PARAMETER HARUS BERBEDA
     */
    Animal(){

    }

    Animal(String nama){ // nama = "kucingA"
        namaHewan = nama;
    }
  // akan error karean sudah ada parameter String
//    Animal(String jenis){
//        jenisHewan = jenis;
//    }

    public void makan(){
        System.out.println("hewan sedang makan");
    }
}

class Main2{
    public static void main(String[] args) {
        Animal kucing = new Animal();

        /*
        kalian bisa akses properti kucing dengan cara
        pakai dot(.)
         */

        /*
        akses nama hewan
         */
        System.out.println("nama hewan adalah " + kucing.namaHewan);

        /*
        akses perilaku hewan
         */
        kucing.makan();

        Animal kucing2 = new Animal("kucing A");
        System.out.println("nama hewan adalah " + kucing2.namaHewan);
    }
}
