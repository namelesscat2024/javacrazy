public class CaseBlockTest
{
    public static void main(String[] args)
    {
        // 声明变量 season
        var season ="秋天";
        //执行switch语句
        switch (season)
        {
            case "春天","夏天" -> {
                System.out.println("春夏不是读书天.");
                //定义count变量。该变量仅在case块中有效
                int count = 20;
                System.out.println(count);
            }
            case "秋天","冬天" -> {
                System.out.println("秋多蚊蝇冬日冷");
                //再次定义count变量,不会与前面的count变量冲突
                int count = 30;
                System.out.println(count);
            }
            default -> {
                System.out.println("读书只好等明年！");
                //System.out.println(count);
            }
        }
        //System.out.println(count);
    }
}