/*题目：
      编写一个学生类Student，提供name,age,gender,phone,address,email成员变量，且为每一个成员变量提供setter,getter方法。
      为学生类提供默认的构造器和带所有成员变量的构造器：为学生类提供方法，用于描绘吃喝玩睡等行为。
 */
class Student
{
    //定义成员变量
    private String name;
    private int age;
    private String gender;
    private long phone;
    private String address;
    private String email;
    //定义方法
    //setter 
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setPhone(long phone)
    {
        this.phone=phone;
    }
    public void setAddress(String address)
    {
        this.address=address; 
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    //getter
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getGender()
    {
        return this.gender;
    }
    public long getPhone()
    {
        return this.phone;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getEmail()
    {
        return this.email;
    }
    //show方法展示对象数据
    public void show()
    {
        System.out.println("姓名："+this.name+" 年龄："+this.age+" 性别："+this.gender+" 手机号："+this.phone+" 地址："+this.address+" 邮箱："+this.email);
    }
    //定义构造器
    //默认构造器
    public Student(){};
    //带所有成员的构造器
    public Student(String name,int age,String gender,long phone,String address,String email)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phone=phone;
        this.address=address;
        this.email=email;
    }
    //定义类方法
    //吃
    public static void eat()
    {
        System.out.println("正在吃");
    }
    //喝
    public static void drink()
    {
        System.out.println("正在喝");
    }
    //玩
    public static void play()
    {
        System.out.println("正在玩");
    }
    //睡
    public static void sleep()
    {
        System.out.println("正在睡");
    }
}