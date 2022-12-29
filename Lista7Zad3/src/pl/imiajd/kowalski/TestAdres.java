package pl.imiajd.kowalski;

public class TestAdres {

    public static void main(String[] args)
    {
        Adres a1 = new Adres("Słoneczna",54,"Olsztyn","10-710");
        a1.pokaz();
        Adres a2 = new Adres("Słoneczna",54,10,"Olsztyn","10-510");
        a2.pokaz();
        System.out.println(a1.przed(a2));
        System.out.println(a2.przed(a1));
        System.out.println(a1.przed(a1));
    }
}



