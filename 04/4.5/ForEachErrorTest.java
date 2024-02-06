public class ForEachErrorTest
{
    public static void main(String[] args)
    {
        String[] books={"轻量","疯狂","讲义"};
        for (var book : books)
        {
            book="前端";
        }
        System.out.println(books[0]);
    }
}