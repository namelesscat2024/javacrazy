public class PersonTest
{
    public static void main(String[] age)
    {
        var p=new Person();
        //p.age=1000;
        p.setAge(1000);
        System.out.println("未能设置age成员变量时："+p.getAge());
        p.setAge(30);
        System.out.println("成功设置age成员变量后："+p.getAge());
        p.setName("李刚");
        System.out.println("成功设置name成员变量后："+p.getName());
    }
}