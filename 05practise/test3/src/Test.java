import person.*;
import teacher.*;
import headteacher.*;
import student.*;
import school.*;
/**
 * 题目：
 *    定义普通人、老师、班主任、学生、学校这些类，提供适当的成员变量、方法，用于描述其内部数据和行为特征，并提供主类使之运行。
 *    要求有良好的封装性，将不同的类放在不同的包下，增加文档注释，生成API文档
 */
public class Test
{
    public static void main(String[] args)
    {
        /**
         * 简单测试成员变量及方法
         */
        var p=new person.Person();
        p.eat();
        var t=new teacher.Teacher();
        t.teach();
        var h=new headteacher.HeadTeacher();
        h.meeting();
        var st=new student.Student();
        st.study();
        var sc=new school.School();
        sc.activity();
    }
}