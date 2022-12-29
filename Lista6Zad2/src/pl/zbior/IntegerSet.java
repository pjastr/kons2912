package pl.zbior;

public class IntegerSet {

    public IntegerSet()
    {
        this.set = new boolean[101];
        for(boolean elem: set) {
            elem=false;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder temp = new StringBuilder();
        for(int i=1;i<=100;i++)
        {
            if (this.set[i])
            {
                temp.append(i);
                temp.append(" ");
            }
        }
        temp.append(".");
        return temp.toString();
    }

    public static IntegerSet union(IntegerSet s1, IntegerSet s2)
    {
        IntegerSet temp = new IntegerSet();
        for(int i=1;i<=100;i++)
        {
            temp.set[i] =  s1.set[i] || s2.set[i];
        }
        return temp;
    }

    public static IntegerSet intersection(IntegerSet s1, IntegerSet s2)
    {
        IntegerSet temp = new IntegerSet();
        for(int i=1;i<=100;i++)
        {
            temp.set[i] =  s1.set[i] && s2.set[i];
        }
        return temp;
    }

    public void insertElement(int elem)
    {
        this.set[elem] = true;
    }

    public void deleteElement(int elem)
    {
        this.set[elem] = false;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        for(int i=1;i<=100;i++)
        {
            if (this.set[i] != ((IntegerSet) otherObject).set[i])
                return false;
        }
        return true;
    }

    private boolean[] set;
}
