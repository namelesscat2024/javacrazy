class Parent
{
    public String tag="疯狂";
}
class Derived extends Parent
{
    private String tag="轻量";
}
public class HideTest
{
    public static void main(String[] args)
    {
        var d=new Derived();
        //System.out.println(d.tag);
        System.out.println(((Parent)d).tag);
    }
}