package pl.rachunek;

public class TestRachunekBankowy {

    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        System.out.println(saver1.getSaldo());
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        System.out.println(saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        System.out.println(saver1.getSaldo());
        saver2.obliczMiesieczneOdsetki();
        System.out.println(saver2.getSaldo());
    }
}
