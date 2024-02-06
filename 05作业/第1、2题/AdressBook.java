/*
题目：
     利用定义的Student类，定义一个Student[]数组保存多个Student对象作为通讯录数据。
     程序可通过name、email、address查询，如果找不到数据，则进行友好提示
 */
import java.util.*;
public class AdressBook
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //获取要创建的Student对象的数量
        System.out.println("输入学生的数量：");
        int l=in.nextInt();
        //创建Student[]数组保存Student对象
        Student[] Student;
        Student=new Student[l];
        for(int i=0,len= Student.length;i<len;i++)
        {
            System.out.println("第"+i+1+"位学生");
            System.out.println("输入姓名：");
            String name=in.nextLine();
            System.out.println("输入年龄：");
            int age=in.nextInt();
            System.out.println("输入性别：");
            String gender=in.nextLine();
            System.out.println("输入手机号：");
            long phone=in.nextLong();
            System.out.println("输入地址：");
            String address=in.nextLine();
            System.out.println("输入电子邮箱：");
            String email=in.nextLine();
            Student[i]=new Student(name,age,gender,phone,address,email);
        }
        //执行查找器
        System.out.println("选择下列数据中的一个来查询学生：1.姓名 2.电子邮箱 3.地址");
        int number=in.nextInt();
         switch (number)
         {
             case 1 ->
             {
                 System.out.println("输入查询学生的姓名：");
                 String na=in.nextLine();
                 for (int i=0,len= Student.length;i<len;i++)
                 {
                     String nam=Student[i].getName();
                     if (nam.equals(na))
                     {
                         Student[i].show();
                         break;
                     }
                     //else if (i=len) System.out.println("查询失败，没有对应的学生");
                 }
             }
             case 2 ->
             {
                 System.out.println("输入查询学生的电子邮箱：");
                 String em=in.nextLine();
                 for (int i=0,len= Student.length;i<len;i++)
                 {
                     String ema=Student[i].getEmail();
                     if (ema.equals(em))
                     {
                         Student[i].show();
                         break;
                     }
                    // else if (i=len) System.out.println("查询失败，没有对应的学生");
                 }
             }
             case 3 ->
             {
                 System.out.println("输入查询学生的地址：");
                 String ad=in.nextLine();
                 for (int i=0,len= Student.length;i<len;i++)
                 {
                     String add=Student[i].getAddress();
                     if (add.equals(ad))
                     {
                         Student[i].show();
                         break;
                     }
                    // else if (i=len) System.out.println("查询失败，没有对应的学生");
                 }
             }
         }
    }
}