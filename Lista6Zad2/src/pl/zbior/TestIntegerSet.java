package pl.zbior;

public class TestIntegerSet {

    public static void main(String[] args)
    {
        IntegerSet i1 = new IntegerSet();
        System.out.println(i1);
        i1.insertElement(14);
        i1.insertElement(26);
        i1.insertElement(7);
        System.out.println(i1);
        IntegerSet i2 = new IntegerSet();
        i2.insertElement(11);
        i2.insertElement(22);
        i2.insertElement(7);
        i2.insertElement(99);
        System.out.println(i2);
        IntegerSet suma = IntegerSet.union(i1,i2);
        System.out.println(suma);
        IntegerSet wspolne = IntegerSet.intersection(i1,i2);
        System.out.println(wspolne);
        i2.deleteElement(11);
        System.out.println(i2);
        IntegerSet i3 = new IntegerSet();
        i3.insertElement(99);
        i3.insertElement(7);
        i3.insertElement(22);
        System.out.println(i2.equals(i3));
    }
}
