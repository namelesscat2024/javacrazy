class BaseClass
{
    public int a=5;
}
public class SubClass extends BaseClass
{
    public int a=7;
    public void accessOwner()
    {
        System.out.println(a);
    }
    public void accessBase()
    {
        System.out.println(super.a);
    }
    public static void main(String[] args)
    {
        var sc=new SubClass();
        sc.accessOwner();
        sc.accessBase();
    }
}