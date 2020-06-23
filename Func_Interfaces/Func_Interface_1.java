package Func_Interfaces;

@FunctionalInterface
public interface Func_Interface_1
{
    public abstract void Func(int x, int y);

    //to be the constant throughout all subclasses
    default void  defFunc()
    {
        System.out.println("Default function of main interface");
    }
    public static  void statFunc()
    {
        System.out.println("Static function of the main interface");
    }

}
