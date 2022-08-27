package abstract_method;

public class Ex2 {

	public static void main(String[] args) {
		Hero h = new Hero();
		다른직업 h2 = new 다른직업();
		h.무기 = new 제네시스투핸드소드(1000);
		h.attack();
		
		h.무기 = new 영웅의글라디우스(1000000);
		h.attack();
//		h2.무기 = new 제네시스투핸드소드(1000000);	// 두손검이라 장착 불가!
		h2.무기 = new 바이킹소드(1000);
		h2.attack();
	}

}


class Hero {
	Hero무기 무기; 
	public void attack() {
		무기.attack();
	}
}

class 다른직업 {
	한손검 무기;
	public void attack() {
		무기.attack();
	}
}

abstract class Hero무기 {
	int demage;
	public abstract void attack();
}
abstract class 한손검 extends Hero무기 {}
abstract class 두손검 extends Hero무기 {}

class 바이킹소드 extends 한손검 {
	public 바이킹소드(int demage) {
		this.demage = demage;
	}
	@Override
	public void attack() {
		System.out.println("바이킹소드: " + demage + "로 공격!");
	}
}
class 영웅의글라디우스 extends 한손검 {
	public 영웅의글라디우스(int demage) {
		this.demage = demage;
	}
	@Override
	public void attack() {
		System.out.println("영웅의글라디우스: " + demage + "로 공격!");
	}
}

class 해방된카이세리움 extends 두손검 {
	public 해방된카이세리움(int demage) {
		this.demage = demage;
	}
	@Override
	public void attack() {
		System.out.println("해방된카이세리움: " + demage + "로 공격!");
	}
	
}
class 제네시스투핸드소드 extends 두손검 {
	public 제네시스투핸드소드(int demage) {
		this.demage = demage;
	}
	@Override
	public void attack() {
		System.out.println("제네시스투핸드소드: " + demage + "로 공격!");
	}
}
 

















