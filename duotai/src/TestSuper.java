/**
 *    Java��ʵ����һ�������ʱ�����û����ʽʹ��super()��
 * ����ȵ��ø�����޲ι��캯��(���Ǻ��Լ����캯������������Ӧ���Ǹ�)��Ȼ ���������Ĺ��캯��.
 * ������಻��Object�࣬��һֱ����׷�ݵ�Object��Ϊֹ��super()ֻ���ڹ��캯���ĵ�һ��ʹ�ã��ڱ�ĵط�ʹ�þ� Ϊ�Ƿ���
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