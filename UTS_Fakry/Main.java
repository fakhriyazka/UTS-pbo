// Interface untuk binatang
interface Binatang {
    void suara();
    void gerak();
}

// Abstract class sebagai template untuk fitur-fitur umum binatang
abstract class Hewan implements Binatang {
    abstract void tidur();
}

// Class Singa yang merupakan turunan dari Hewan
class Singa extends Hewan {
    @Override
    public void suara() {
        System.out.println("Singa mengeluarkan suara: Roar!");
    }

    @Override
    public void gerak() {
        System.out.println("Singa berjalan menggunakan keempat kakinya.");
    }

    @Override
    void tidur() {
        System.out.println("Singa tidur dengan tidur yang dalam.");
    }
}

// Class Kuda yang merupakan turunan dari Hewan
class Kuda extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kuda mengeluarkan suara: Neigh!");
    }

    @Override
    public void gerak() {
        System.out.println("Kuda berlari dengan cepat.");
    }

    @Override
    void tidur() {
        System.out.println("Kuda tidur berdiri atau berbaring.");
    }
}

// Class Ikan yang merupakan turunan dari Hewan
class Ikan extends Hewan {
    @Override
    public void suara() {
        System.out.println("Ikan tidak mengeluarkan suara.");
    }

    @Override
    public void gerak() {
        System.out.println("Ikan bergerak dengan cara berenang menggunakan siripnya.");
    }

    @Override
    void tidur() {
        System.out.println("Ikan tidur sambil berenang atau beristirahat di dasar air.");
    }
}

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Singa simba = new Singa();
        Kuda spirit = new Kuda();
        Ikan nemo = new Ikan();

        System.out.println("Singa:");
        simba.suara();
        simba.gerak();
        simba.tidur();

        System.out.println("\nKuda:");
        spirit.suara();
        spirit.gerak();
        spirit.tidur();

        System.out.println("\nIkan:");
        nemo.suara();
        nemo.gerak();
        nemo.tidur();
    }
}
