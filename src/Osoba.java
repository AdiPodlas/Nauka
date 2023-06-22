public class Osoba {
    private String imie;
    private String nazwisko;
    private Integer rocznik;
    private String adres;

    public Osoba(String imie, String nazwisko, Integer rocznik, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rocznik = rocznik;
        this.adres = adres;
    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRocznik() {
        return rocznik;
    }

    public String getAdres() {
        return adres;
    }

    public int getAge() {
        int obecnyRok = 2023;
        return obecnyRok - rocznik;
    }

    public boolean isSameAge(Osoba innaOsoba) {
        return this.getAge() == innaOsoba.getAge();
    }

    @Override
    public String toString() {
        return "" + imie + nazwisko + rocznik + adres;

    }
}


