public class DoWhileTest
{
    public static void main (String[] args)
    {
        var count = 1;
        do {
            System.out.println(count);
            count++;
        } while (count<10);
        System.out.println("循环结束");
    }
}