public class PatternVarScope
{
    public static void main(String[] args)
    {
        Object obj = "疯狂";
        if (obj instanceof PatternVarScope ps)
        {
            System.out.println(ps);
            System.out.println(ps);
        }
        if (obj instanceof String ps)
        {
            System.out.println(ps.toUpperCase());
        }
    }
}
