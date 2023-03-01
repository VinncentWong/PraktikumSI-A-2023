package org.example.week1;

/*
Modul 1
 */

/*
Class = blueprint
 */
public class ResepRoti {

}

class Manusia{
    /*
    Properti

    Kalian membuat properti tepat di bawah class
     */
    String nama;
    int umur;

    /*
    Perilaku yang dilakukan sebuah objek itu dinamakan
    method

    method = fungsi yang kalian buat di bawah class
     */

    public void berjalan(){
        System.out.println(nama + " sedang berjalan ");
    }

    public void makan(){
        System.out.println(nama + " sedang makan");
    }

    public void buatNamaBaru(String namaBaru){
        nama = namaBaru;
    }

    public static void main(String[] args) {
        /*
        Di dalam method bukan properti tapi variabel
         */
        int umur = 10;
    }
}

class Main{
    /*
    main adalah method spesial yang digunakan
    buat jalanin program kita

    gaada main = program tidak akan berjalan
     */
    public static void main(String[] args) {
        // membuat objek roti aoka
        ResepRoti rotiAoka = new ResepRoti();

        // membuat objek roti blueberry
        ResepRoti rotiBlueberry = new ResepRoti();
    }
}
