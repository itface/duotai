/**
 * ������������ñ��������������ʱ�������ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������������������õķ����������ڳ����ж�����ģ�Ҳ����˵�����า�ǵķ����� 
 * �ߵ�������Ϊ��this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)
 * @author WangRongtao
 *
 */
public class TestExtend {

	public static void main(String[] args){
		    A a1 = new A();
	        A a2 = new B();
	        B b = new B();
	        C c = new C(); 
	        D d = new D(); 
	        System.out.println(a1.show(b));//this.show((super)O)
	        System.out.println(a1.show(c));//this.show((super)O)
	        System.out.println(a1.show(d));//this.show(O)
	        /*
	         *  a2��һ�����ñ���������ΪA����thisΪa2��b��B��һ��ʵ��.
	         *����������A������show(B obj)������û���ҵ������ǵ�A��super(����)��.
	         *��Aû�г���,���ת���������ȼ�this.show((super)O)��this��Ȼ��a2������OΪB��(super)O��(super)B��A.
	         *���������A������show(A obj)�ķ�������A���������.
	         *��������a2���õ�����B��һ������B������A��show(A obj)���������������������B��show(A obj)�����Ϊ"B and A�� 
	         */
	        System.out.println(a2.show(b)); 
	        System.out.println(a2.show(c));
	        
	        System.out.println(a2.show(d)); 
	        System.out.println(b.show(b)); 
	        System.out.println(b.show(c)); 
	        System.out.println(b.show(d));   
	}
}

class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}
class C extends B{
	
}
class D extends B{
	
}