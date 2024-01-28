public class SwitchExprTest
{
    public static void main (String[] args)
    {
        var score = 'B';
        var judge = switch (score)
        {
            case 'A','B' -> "成绩还不错，希望继续保持";
            case 'C','D','F' -> "成绩不足，还需努力";
            default -> "成绩输入错误";
        };
        System.out.println(judge);
    }
}