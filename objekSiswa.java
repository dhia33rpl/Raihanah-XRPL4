public class objekSiswa{
    public static void main (String[] args){
        Siswa a = new Siswa(); //instansiasi
        System.out.println("Nama Siswanya adalah "  + a.getNama());
        a.setNama("Nama");
        System.out.println("Nilainya adalah "  + a.getNilai());
        System.out.println("Usianya adalah "  + a.getUsia());
        a.setUsia();
    }
}