public class PatternVarFlow
{
    public static void main(String[] args)
    {
        Object obj = "疯狂";
        if (obj instanceof String s && s.length() > 5)
        {
            System.out.println(s.toUpperCase());
        }
        //if (obj instanceof String s || s.length() > 5)
        //{
        //    System.out.println(s.toUpperCase());
        //}
    }
}
