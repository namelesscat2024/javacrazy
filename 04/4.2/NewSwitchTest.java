public class NewSwitchTest
{
    public static void main(String[] args)
    {
        var score = 'C';
        switch (score)
        {
            case 'A','B' -> {
                System.out.println("成绩还不错，希望继续保持");
                System.out.println("后续给你颁发奖状");
            }
            case 'C','D','F' -> System.out.println("成绩不足，还需努力");
            default -> System.out.println("成绩输入错误");
        }
    }
}