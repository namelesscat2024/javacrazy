public class InstanceofMatch
{
    public static void main(String[] args)
    {
        Object obj = "疯狂";
        if (obj instanceof String)
        {
            String s = (String) obj;  // ①
            System.out.println(s.toUpperCase());
        }
        if (obj instanceof String s)
        {
            System.out.println(s.toUpperCase());
        }
    }
}
