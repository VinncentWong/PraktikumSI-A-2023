package org.example.week1;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Komputer {

    private String jenisKomputer;

    private BigDecimal hargaKomputer;

    private Date tanggalBeli;
}

class Main5{
    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.setJenisKomputer("HP");
        komputer.setTanggalBeli(new Date());
        komputer.setHargaKomputer(BigDecimal.valueOf(2000000000));
        System.out.println(komputer);
    }
}
