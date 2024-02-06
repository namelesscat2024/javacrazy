/**
 * 使用循环输出九九乘法表
 */
public class test1 {
    public static void main(String[] args)
    {
        //外内循环嵌套，实现乘法表输出
        //外循环控制行数
        for(int i=1;i<=9;i++)
        {
            //内循环输出每一行的各个式字
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+",");
            }
            //换行
            System.out.println("\n");
        }
    }
}