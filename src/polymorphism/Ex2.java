package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 동적 바인딩
		 * - 컴파일(번역) 시점에서 실행될 것으로 예상되는 코드와
		 *   실제 실행 시점에서 해당 객체의 타입 기준으로 메서드가 달라지는 것
		 * 
		 * */
		
		// 슈퍼클래스(Employee) 인스턴스 생성
		// => 파라미터 생성자 호출하여 "홍길동, 3000 전달
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("emp.getEmployee(): " + emp.getEmployee()); 
		System.out.println("-------------------------------");
		
		// 서브클래스(Manager) 인스턴스 생성
		// => 파라미터 생성자 호출하여 "이순신", 4000, "개발팀" 전달
		Manager man = new Manager("이순신", 4000, "개발팀");
		System.out.println("man.getEmployee(): " + man.getEmployee());
		
		System.out.println("===============================");
		
		// Manager -> Employee 업캐스팅
		emp = man; // 업캐스팅은 자동형변환 가능(묵시적 형변환) = 형변환 연산자 생략 가능
		// 업캐스팅 후에는 참조영역에 대한 축소가 발생함
		// 단, 현재 Manager 클래스에는 별도의 추가 메서드가 없으므로 기능 동일함
		System.out.println("emp.getEmployee(): " + emp.getEmployee());
		// => 코드상(컴파일시점)으로는 Employee 클래스의 getEmployee() 메서드가 호출될것으로 보이지만
		//    실제 emp 변수에 저장된 인스턴스(객체) Manager 클래스의 인스턴스 이므로
		//    실행 시점에는 Maneger 클래스에 오버라이딩 된 getEmployee() 메서드가 실행됨!
		
		System.out.println("---------------------------------");
		
		// 서브클래스(Engineer) 인스턴스 생성
		// => "강감찬", 2000, "자바개발" 로 초기화
		Engineer eng = new Engineer("강감찬", 2000, "자바개발");
		System.out.println("eng.getEmployee(): " + eng.getEmployee());
		
		// Engineer(eng) -> Employee(emp2) 업캐스팅
		Employee emp2 = eng;
		System.out.println("emp2.getEmployee(): " + emp2.getEmployee());
		
		// Manager 인스턴스 생성하여 Employee(emp2) 로 업캐스팅
		emp2 = new Manager("이순신", 4000, "개발팀2");
		
		// 출력문에서 실행되는 메서드는 문법적으로 차이가 없지만
		// 실제 참조하는 인스턴스가 달라지므로 결과값이 다르다!
		System.out.println("emp2.getEmployee(): " + emp2.getEmployee());
		
		
	}

}


/*
 * 사원 클래스 (Employee) 정의
 * 멤버변수 : 사원명(name, 문자열), 연봉(salary, 정수)
 * 생성자
 * 	- 기본생성자
 * 	- 파라미터 생성자: 사원명과 연봉을 전달받아 초기화
 * 메서드
 * 	- getEmployee() 메서드 : 파라미터 없음
 * 							리턴타입 - String(이름과 연봉을 문자열로 결합하여 리턴)
 * 							ex) "홍길동, 3000" 리턴
 * */
class Employee {
	String name;
	int salary;
	
	public Employee() {}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name + ", " + salary;
	}
}

/*
 * Manager 클래스 정의 - Employee 클래스 상속
 * 멤버변수 : 부서명(depart, 문자열)
 * 생성자 : 파라미터생성자 - 사원명, 연봉, 부서명을 전달받아 초기화
 * 메서드 : getEmployee() 메서드 오버라이딩
 * 			사원명, 연봉, 부서명을 문자열로 결합하여 리턴
 * */
class Manager extends Employee {
	String depart;

	// Alt + Shift + S -> C
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
//		return name + ", " + salary + ", " + depart;
		return super.getEmployee() + ", " + depart;
	}
}

/*
 * Engineer 클래스 정의 - Employee 클래스 상속
 * 멤버변수 : 기술명(skill, 문자열)
 * 생성자 : 파라미터 생성자 - 사원명, 연봉, 기술명을 전달받아 초기화
 * 메서드 : getEmployee() 메서드 오버라이딩
 * 		   사원명, 연봉, 기술명을 문자열로 결합하여 리턴
 * */
class Engineer extends Employee {
	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee() + ", " + skill;
	}
	
}



















