package Func_Interfaces;

public class Func_Interface_1_Class implements Func_Interface_1
{
    @Override
    public void Func(int x, int y) {
        System.out.println("x  : "+x);
        System.out.println("y : "+y);
    }
    public static void main(String[] args)
    {

        //lambda
        System.out.println("Lambda :");
        Func_Interface_1 ab = (b,c)-> System.out.println(b+"  "+c);
        ab.Func(5,10);
        ab.defFunc();


        System.out.println();
        System.out.println();

        //implementation using override function
        System.out.println("Implementation");
        Func_Interface_1_Class ob = new Func_Interface_1_Class();
        ob.Func(15,20);
        ob.defFunc();

        //static function to be called directly using parent Class name
        Func_Interface_1.statFunc();

    }
}