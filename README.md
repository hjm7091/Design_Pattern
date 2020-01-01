### 1. 객체지향 모델링

![chapter1](https://user-images.githubusercontent.com/28583661/71540639-79941a00-2990-11ea-8212-47702dd3a46c.PNG)

    1) 클래스는 변화의 기본 단위, 공통의 속성과 책임을 갖는 객체들의 집합, 실제 객체를 생성하는 설계도
    2) 양방향 연관 관계는 서로의 존재를 안다는 의미, 반면에 단방향 연관 관계는 한 쪽은 알지만 다른 쪽은 모름
    3) 집약관계->전체 객체와 부분 객체의 생명 주기가 다름  
       합성관계->전체 객체가 없어지면 부분 객체도 없어짐
    4) 일반화 관계(상속)는 'is a kind of 관계'지만 실체화 관계(인터페이스)는 'can do this 관계'이다.
    
* * *

### 2. 객체지향 원리

    1) 추상화는 사물들의 공통된 특징, 즉 추상적 특징을 파악해 인식의 대상으로 삼는 행위
       구체적인 개념보다는 추상적 개념에 의존해야 설계를 유연하게 변경 가능
    2) 응집도 : 클래스나 모듈 안의 요소들이 얼마나 밀접하게 관련되어 있는지를 나타냄(높아야 좋음)
       결합도 : 어떤 기능을 실행하는 데 다른 클래스나 모듈들에 얼마나 의존적인지를 나타냄(낮아야 좋음)
    3) 어떤 클래스의 일부 기능만 재사용하고 싶으면 위임(delegation)을 사용하자
    4) 다형성 : 서로 다른 클래스의 객체가 같은 메시지를 받았을 때 각자의 방식으로 동작하는 능력
    
피터 코드의 상속 규칙

* 자식 클래스와 부모 클래스 사이는 '역할 수행' 관계가 아니어야 한다.
* 한 클래스의 인스턴스는 다른 서브 클래스의 객체로 변환할 필요가 절대 없어야 한다.
* 자식 클래스가 부모 클래스의 책임을 무시하거나 재정의하지 않고 확장만 수행해야 한다.
* 자식 클래스가 단지 일부 기능을 재사용할 목적으로 유틸리티 역할을 수행하는 클래스를 상속하지 않아야 한다.
* 자식 클래스가 '역할', '트랜잭션', '디바이스' 등을 특수화해야 한다.

* * *

### 3. SOLID 원칙

단일 책임 원칙(SRP)
* 객체는 단 하나의 책임만을 가져야함
* 책임 -> 해야 하는 것, 할 수 있는 것, 해야하는 것을 잘 할 수 있는 것, 변경 이유
* 시스템에 변경이 발생할 때 기존의 기능에 영향을 주는지를 평가하는 테스트를 회귀 테스트라함 
* SRP에 따른 설계를 하면 응집도는 높아지고 더불어 결합도는 낮아짐

개방-폐쇄 원칙(OCP)
* 기존의 코드를 변경하지 않으면서 기능을 추가할 수 있도록 설계가 되어야함
* 클래스를 변경하지 않고도 대상 클래스의 환경을 변경할 수 있는 설계가 되어야함

리스코프 치환 원칙(LSP)
* 부모 클래스와 자식 클래스 사이의 행위가 일관성이 있어야 한다는 의미
* 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행할 수 있어야함
* LSP를 만족하는 간단한 방법은 재정의하지 않는 것이다. 이는 피터 코드의 상속 규칙에도 명시되어 있음

의존 역전 원칙(DIP)
* 의존 관계를 맺을 때 변화하기 쉬운 것 또는 자주 변화하는 것보다는 변화하기 어려운 것, 거의 변화가 없는 것에 의존하라는 원칙
* 인터페이스, 추상클래스 -> 변하지 않는 것, 구체 클래스 -> 변하기 쉬운 것
* DIP를 만족하려면 어떤 클래스가 도움을 받을 때 구체적인 클래스보다는 인터페이스나 추상 클래스와 의존 관계를 맺어야함

인터페이스 분리 원칙(Interface Segregation Principle, ISP)
* 인터페이스를 클라이언트에 특화되도록 분리시키라는 설계 원칙
* SRP를 만족하더라도 ISP를 반드시 만족한다고는 할 수 없다.
  
* * *

### 참고 문헌

    정인상, 채흥석 (2014). 자바 객체지향 디자인 패턴. 한빛미디어.

       

