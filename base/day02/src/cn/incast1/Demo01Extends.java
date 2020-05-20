package cn.incast1;
/*定义父类的格式（一个普通的类定义）
* public class 父类名称{
* }
* 定义子类：
* public class 子类名称 extends 父类名称{
* }
* */
public class Demo01Extends {
    public static void main(String[] args) {
        teacher tea =new teacher();
        tea.method();
        //
        Assistant assistant=new Assistant();
        assistant.method();

    }
}
