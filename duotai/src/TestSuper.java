/**
 *    Java在实例化一个对象的时候，如果没有显式使用super()，
 * 则会先调用父类的无参构造函数(不是和自己构造函数参数数量对应的那个)，然 后调用子类的构造函数.
 * 如果父类不是Object类，则一直向上追溯到Object类为止，super()只能在构造函数的第一行使用，在别的地方使用均 为非法，
 * @author WangRongtao
 *
 */
public class TestSuper {
    public static void main(String[] args) {
        new Son("baidu");
        new Son();
    }
}

class Farther{
    public Farther(){
        System.out.println("I am father");
    }

    public Farther(String name){
        System.out.println("I am father:"+name);
    }
}

class Son extends Farther{
    public Son(){
        System.out.println("I am son");
    }
    public Son(String name){
        //super("google");
        System.out.println("I am son:"+name);
    }
}