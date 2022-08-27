package abstract_method;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		// 추상클래스인 Flyer 클래스는 인스턴스 생성 불가!
//		Flyer f = new Flyer(); // 오류 발생!
		
		Bird b = new Bird();
		b.fly();
		
		SuperMan s = new SuperMan();
		s.fly();
		
		Airplane a = new Airplane();
		a.fly();
		System.out.println("----------------------");
		
		Flyer f;
		f = new Bird();
		f.fly();
		
		f = new SuperMan();
		f.fly();
		
		f = new Airplane();
		f.fly();
		System.out.println("----------------------");
		
//		int[] arr = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
		
//		Flyer[] fArr = new Flyer[3];
//		fArr[0] = new SuperMan();
//		fArr[1] = new Airplane();
		
		int[] arr2 = {10, 20, 30};
		Flyer[] fArr = {new SuperMan(), new Bird(), new Airplane(), new Bird(), new Bird()};
		
		for(Flyer flyer : fArr) {
			flyer.fly();
		}
		
		System.out.println("------------------------------");
		
		ArrayList<Flyer> arrList = new ArrayList<Flyer>();
		arrList.add(new Bird());
		arrList.add(new SuperMan());
		arrList.add(new Airplane());
		
		for(Flyer flyer : arrList) {
			flyer.fly();
		}
		
		
		
	}

}

// 날아다니는 것 Flyer 클래스 정의
// fly() 추상메서드 정의
abstract class Flyer {
	public abstract void fly();
}

// Bird 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현 ("Bird 비행!" 출력)
class Bird extends Flyer {
	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
}

// SuperMan 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현 ("SuperMan 비행!" 출력)
class SuperMan extends Flyer {
	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}
}

// Airplane 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현 ("Airplane 비행!" 출력)
class Airplane extends Flyer {
	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
}







