/**
 * 通过API文档查询Math类的方法，打印近似园，大小随半径发生改变
 */
import java.util.*;
import java.lang.Math;
public class test3
{
    public static void main(String[] args)
    {
        //输入圆的半径
        Scanner in=new Scanner(System.in);
        System.out.println("输入圆的半径:");
        int r=in.nextInt();
        for(int i=0;i<+2*r;i+=2)
        {
            //len1表示第一个*左边的空白距离
            int len1=(int)Math.round(r-Math.sqrt(2*r*i-i*i));
            //len2表示*之间的空白距离
            int len2=2*(r-len1);
            //输出第一个*左边的空格
            for(int j=1;j<len1;j++)
            {
                System.out.print(" ");
            }
            //输出*
            System.out.print("*");
            //输出*之间的空格
            for (int j=1;j<len2;j++)
            {
                System.out.print(" ");
            }
            //输出*
            System.out.print("*");
            //换行
            System.out.print("\n");
        }
    }
}