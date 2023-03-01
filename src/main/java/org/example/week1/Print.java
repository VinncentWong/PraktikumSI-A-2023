package org.example.week1;

/*
Modul 3
 */
public class Print {

    int jumlahPrint;

    Print(){}

    Print(int jumlahPrint){
        this.jumlahPrint = jumlahPrint;
        this.print(this.jumlahPrint);
    }

    /*
    Method ini buat print String
     */
    public void print(String kalimat){
        System.out.println("menerima kalimat " + kalimat);
    }

    public void print(int angka){
        System.out.println("menerima angka " + angka);
    }

    public void print(boolean bool){
        System.out.println("menerima boolean " + bool);
    }

    public void print(int[] arrays){
        for(int num: arrays){
            System.out.println("menerima array dengan angka " + num);
        }
    }
}

class Main3{
    public static void main(String[] args) {
        Print print = new Print();
        print.print(1);
        print.print("kalimat");
    }
}
