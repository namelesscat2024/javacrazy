public class Dog
{
    public void jump()
    {
        System.out.println("正在执行jump方法");
    }
    public void run()
    {
        this.jump();
        System.out.println("正在执行run方法");
    }
}