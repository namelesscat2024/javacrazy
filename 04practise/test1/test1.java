/**
 * 使用循环输出九九乘法表
 */
public class test1 {
    public static void main(String[] args)
    {
        //外内循环嵌套，实现乘法表输出
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+",");
            }
            //换行
            System.out.println("\n");
        }
    }
}