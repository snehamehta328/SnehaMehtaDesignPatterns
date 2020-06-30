package sneha;

import java.util.ArrayList;
import java.util.List;

class ab
{
    int no;
    ab(int n)
    {
        no=n;
    }
    protected void print()
    {
        System.out.println("HI"+no);
    }
}
class bd extends ab
{
    bd(int n)
    {
        super(n);
    }
}

interface ComputerAbstractFactory
{
    Computer createComputer();
}
class PcFactory implements ComputerAbstractFactory
{
    String ram;
    PcFactory(String r)
    {
        ram=r;
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram);
    }
}
abstract class Computer
{
    public abstract String getRam();
}
class Pc extends Computer
{
    String ram;
    Pc(String r)
    {
        ram=r;
    }
    public String getRam()
    {
        return ram;
    }
}

interface Shape
{
    void draw(String color);
}
class Triangle implements Shape
{
    @Override
    public void draw(String color) {
        System.out.println("Color in Triangle:-"+color);
    }
}
class Circle implements Shape
{
    @Override
    public void draw(String color) {
        System.out.println("Color in Circle:-"+color);
    }
}
class Drawing implements Shape
{
    List<Shape> shapeList=new ArrayList<Shape>();

    @Override
    public void draw(String color) {
        for (Shape sh: shapeList)
        {
            sh.draw("Red");
        }
    }
}
class Color
{
    String co()
    {
        return "red";
    }
}

public class designPattern {
    public static final designPattern design = new designPattern();

    private designPattern() {
    }

    public static designPattern DesignInstance() {
        return design;
    }

    public static void main(String args[]) {
        Drawing d1 = new Drawing();
        Color col = new Color();
        d1.draw(col.co());//BRIDGE METHOD
        bd abc = new bd(5);
        abc.print();
    }
}
