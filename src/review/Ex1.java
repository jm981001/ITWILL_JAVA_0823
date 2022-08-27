package review;


class Person {
	
	// 1. 멤버변수 (속성, 필드) => has-a
	String name;
	int age;
	
	// 2. 생성자 (생성자 오버로딩: 식별이 가능하면 된다!)
	public Person() {
//		this. // 멤버변수, 멤버메서드에 접근!!
		this("홍길동", 20); // 다른생성자 호출 this()
		System.out.println("생성자 호출됨!"); // 단, 첫줄에 와야함!!!
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {}
	public Person(String name, int age) {}
	public Person(int age, String name) {}
	
	
	// 3. 메서드
	// [접근제한자] 리턴타입 메서드명(매개변수, ...) { 구현! }
	void method() {}
	
	// 메서드 오버로딩 (식별이 가능하면 된다!)
	// => 리턴 타입 상관없음
	void method(String s) {}
	void method(int i) {}
	int method(String s, int i) { return 0; }
	void method(int i, String s) {}
	void method(String s1, String s2) {}
//	void method(String s2, String s1) {} // 안됨!
	
	// 접근제한자 넓 --> 좁
	// public > protected > default > private
}


public class Ex1 {

	// static
	// => 메모리에 로딩되는 시점이 더 빠르다!!!
	// => 인스턴스(객체)마다 존재하는 변수가 아닌 클래스에 속해있는 멤버 
	//    (=> 클래스변수 => 인스턴스 마다 공유)
	int a = 10;
	String nName = "차동원";
	static int b = 20;
	static String sName = "우영우";
	
	public void normalMethod() {
		System.out.println(a);		// O
		System.out.println(nName);  // O
		System.out.println(b);		// O
		System.out.println(sName);	// O		
	}
	
	
	public static void main(String[] args) {
//		System.out.println(a);		// X
//		System.out.println(nName);  // X
//		System.out.println(b);		// O
//		System.out.println(sName);	// O
		
		new CC().method();
	}
}

// 상속
class P {
	String house = "이층집";
	public void run() {
		System.out.println("느리게 뜀");
	}
}

class C extends P {
	String car = "자동차";
	@Override
	public void run() {
		System.out.println("좀 빨리 뜀");
	}
}

class S extends C {
	String computer = "컴퓨터";
	// Alt + Shift + S -> V
	
	// 어노테이션: 컴파일러 주석
	@Override
	public void run() {
		System.out.println("개빠름");
	}
	
//	@Override 어노테이션 안됨!
	public void method() {
		
	}
}


class AA {
	String name = "AA";
}
class BB extends AA {
	String name = "BB";
}
class CC extends BB {
//	String name = "CC";
	public void method() {
//		String name = "로컬";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}




















