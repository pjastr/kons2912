import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
        BetterRectangle br = new BetterRectangle(1,1,20,15);
        System.out.println(br);
        System.out.println(br.getPerimeter());
        System.out.println(br.getArea());
    }
}

class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        // zadanie 6
        //this.setLocation(x,y);
        //this.setSize(width,height);
        // zadanie 7
        super(x,y,width,height);
    }

    public double getPerimeter()
    {
        return 2*this.width +2*this.height;
    }

    public double getArea()
    {
        return this.width*this.height;
    }
}
