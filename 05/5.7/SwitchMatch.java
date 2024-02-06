class Shape {}
class Triangle extends Shape
{
    double area;
    public Triangle(double area)
    {
        this.area = area;
    }
}
class Rectangle extends Shape {}
public class SwitchMatch
{
    public static void main(String[] args)
    {
        var switchMatch = new SwitchMatch();
        switchMatch.test(new Triangle(120.4));
        switchMatch.test(new Rectangle());
    }
    public void test(Shape s)
    {
        switch (s)
        {
            case Triangle t -> System.out.println(s + "是三角形");
            case Rectangle r -> System.out.println(r + "是矩形");
            default -> System.out.println("其他图形");
        }
    }
}