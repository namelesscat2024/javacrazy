public class StaticAccessNonStatic
{
    public void info()
    {
        System.out.println("简单的info方法");
    }
    public static void main(String[] args)
    {
        //info();
        new StaticAccessNonStatic().info();
    }
}