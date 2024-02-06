/**
 * 使用循环输出等腰三角形
 */
import java.util.*;
public class test2 {
    public static void main(String[] args)
    {
        //输入行数
        Scanner in=new Scanner(System.in);
        System.out.println("输入三角形的高:");
        int h=in.nextInt();
        //外循环控制行数
        for(int i=1;i<+h;i++)
        {
            //输出每一行的空白部分
            for(int j=1;j<h-i;j++)
            {
                System.out.print(" ");
            }
            //输出每一行的*部分
            for(int j=1;j<2*i;j++)
            {
                System.out.print("*");
            }
            //换行
            System.out.print("\n");
        }
    }
}