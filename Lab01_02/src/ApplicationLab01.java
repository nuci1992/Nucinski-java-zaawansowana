package Lab01_02.src;

public class ApplicationLab01 {
    
    public static void main(String[] args) {
        
        KoktajlTruskawkowy k = new KoktajlTruskawkowy(10, RodzajeTruskawki.ANANASOWA);

        k.pij();
        System.out.println(k.smak());

    }
}