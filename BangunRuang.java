
package Pertemuan4PBO;

public class BangunRuang {

    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi; // Rumus volume kubus: sisi^3
    }

    
    public double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi; // Rumus volume balok: panjang * lebar * tinggi
    }

    
    public double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi); // Rumus luas permukaan kubus: 6 * sisi^2
    }

    
    public double hitungLuasPermukaan(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)); // Rumus luas permukaan balok
    }

    public static void main(String[] args) {
       
        BangunRuang bangun = new BangunRuang();
        
        
        double sisiKubus = 4; // Contoh nilai sisi kubus
        System.out.println("Volume Kubus: " + bangun.hitungVolume(sisiKubus));
        System.out.println("Luas Permukaan Kubus: " + bangun.hitungLuasPermukaan(sisiKubus));
        
        
        double panjangBalok = 6, lebarBalok = 4, tinggiBalok = 5; // Contoh nilai balok
        System.out.println("Volume Balok: " + bangun.hitungVolume(panjangBalok, lebarBalok, tinggiBalok));
        System.out.println("Luas Permukaan Balok: " + bangun.hitungLuasPermukaan(panjangBalok, lebarBalok, tinggiBalok));
    }
}

