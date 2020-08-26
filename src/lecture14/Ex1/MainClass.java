package lecture14.Ex1;

/*1. 추상 클래스의 이해(abstruct -interface)
추상적으로 정의할 테니, 사용자가 꼭 재정의 하라고 해놓는것
체인점 예제와 같이
가맹 회사에서 지점에 메뉴가격 등을 재정의해서 해라라고 강제적으로 하는 것
추상적으로 실체가 없는 메서드 



2. 추상 클래스가 필요한 이유
//강제 성을 느낄 때 사용
 * 
 *  객체지향 언어를 하다 보면 추상화 또는 추상개념 등의 ‘추상’이라는 말을 많이 접하게 될 것 입니다.
프로그래밍에서 ‘추상＇이라는 것은 일반생활에서의 ‘추상’과 동일 합니다.
어떤 행위(메소드)를 추상적으로 정의만 해놓고, 실제로 필요한 곳에서 필요에 따라서 재정의 하는 방식 입니다.
여러분들이 상속을 사용하다가, 자식클래스들에서 강제로 무엇인가 꼭 재정의 해서 사용해야 될 경우가 발생되면, 추상 개념을 먼저 생각 하시기 바랍니다.

 추상 개념은 객체지향 언어에서는 아주 중요한 의미가 있습니다. 그리고 추상적으로 프로그래밍을 한다는 것은 결코 쉬운 일은 아닐 것 입니다.
하지만, 예제를 많이 접해보고, 추후에 알아볼 패턴에 대해서 공부를 하고 나면, 추상적으로 프로그래밍 한다는 것이 얼마나 중요한 건지 쉽게 아실 수 있을 것 입니다.  


3. 추상 클래스의 문법
추상 클래스에서는 정의만 하고 구현하지 않음


4. 추상 클래스 상속과 일반적인 상속의 차이
차이는 있지만, 어느 쪽이 더 좋다는 정답은 없음
현장에 있는 개발자들도 항상 고민하는 부분 중 하나가 추상 클래스로 할 것인지 일반 클래스로 할 것인지 고민을 하게 됩니다.
결론부터 말씀 드리면, 정답은 없습니다. 그리고 처음부터 100% 확정하지도 않습니다.
초기 설계 단계에서 어느 정도 추상과 일반 클래스를 분리 하기는 하지만, 프로젝트 개발 도중 언제든지 변경하기도 합니다.(리펙토링)

눈치채신 분도 있을 거 같은데요, 부모 클래스의 메소드를 자식 클래스에서 변경할 일이 없다면, 일반 클래스를 이용한 상속이 좋습니다.
하지만, 이전 예제처럼 자식클래스에서 꼭 재정의 해야 하는 부분이 있다면, 추상클래스를 이용하여 강제로 재정의 하게 해야 됩니다.

추후에 패턴을 살펴 볼 때 일반클래스와 추상클래스를 이용한 상속의 차이를 확실하게 느끼실 수 있습니다.



*/
public class MainClass {
public static void main(String[] args) {
	ChildClass cc = new ChildClass();
	cc.method1();
	cc.method2();
}
}