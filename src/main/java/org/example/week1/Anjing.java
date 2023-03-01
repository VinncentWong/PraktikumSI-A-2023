package org.example.week1;

/*
Modul 4
 */

public class Anjing {

    /*
    kalian bisa akses namaHewan hanya DI DALAM KELAS Anjing
     */
    private String namaHewan;

    private String jenisHewan;

    private int umur;

    private String lokasiHewan;

    private String ciriKhas;

    public void bark(){
        System.out.println(namaHewan + " sedang menggonggong");
    }

    public void setNamaHewan(String namaHewan){
        this.namaHewan = namaHewan;
    }

    public String getNamaHewan(){
        return this.namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }
}

class Main4{
    public static void main(String[] args) {
        Anjing husky = new Anjing();
        /*
        Bukan best practice karena akses secara langsung
         */
//        System.out.println(husky.namaHewan);
//        husky.namaHewan = "husky";

        System.out.println(husky.getNamaHewan());
        husky.setNamaHewan("husky");
        System.out.println(husky);
    }
}
