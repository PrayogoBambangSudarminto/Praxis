package polimorfisme;

public class main {
    public static void main(String[] args) {

        BangunDatar bangunDatar = new BangunDatar();
        persegi persegi = new persegi(4);
        segitiga segitiga = new segitiga(6, 3);
        linkaran lingkaran = new linkaran(50);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
}
