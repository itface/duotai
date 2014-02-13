/**
 * 当超类对象引用变量引用子类对象时，被引用对象的类型而不是引用变量的类型决定了调用谁的成员方法，但是这个被调用的方法必须是在超类中定义过的，也就是说被子类覆盖的方法。 
 * 高到低依次为：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
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
	         *  a2是一个引用变量，类型为A，则this为a2，b是B的一个实例.
	         *于是它到类A里面找show(B obj)方法，没有找到，于是到A的super(超类)找.
	         *而A没有超类,因此转到第三优先级this.show((super)O)，this仍然是a2，这里O为B，(super)O即(super)B即A.
	         *因此它到类A里面找show(A obj)的方法，类A有这个方法.
	         *但是由于a2引用的是类B的一个对象，B覆盖了A的show(A obj)方法，因此最终锁定到类B的show(A obj)，输出为"B and A” 
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