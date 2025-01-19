import java.util.Scanner;

public class Siswa {
    //atribut private
    private String nama;
    private int usia;
    private double nilai;

    //konstruktor 
    public Siswa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nama: ");
        this.nama = scanner.nextLine();
        System.out.println("Masukan usia: ");
        this.usia = scanner.nextInt();
        System.out.println("Masukan nilai:  ");
        this.nilai = scanner.nextDouble();
    }

    //get dan set untuk nama
    public String getNama() {
        return nama;
    }
    public void setNama(String namaIsi) {
        this.nama=namaIsi;
    }

    //get set untuk usia
    public int getUsia() {
        return usia;
    }
    public void setUsia() {
        if (usia > 0) {
            usia=this.usia;
        }else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }
    //get dan set untuk nilai
    public double getNilai() {
        return nilai;
    }
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            nilai=this.nilai;
        }else {
            System.out.println("Nilai harus berada diantara 0 dan 100");
        }
    }
}   