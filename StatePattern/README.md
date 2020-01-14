### 스테이트 패턴

* 스테이트 패턴은 어떤 행위를 수행할 때 상태에 행위를 수행하도록 위임한다.
* 스테이트 패턴에서는 시스템의 각 상태를 클래스로 분리해 표현하고, 각 클래스에서 수행하는 행위들을 메서드로 구현한다.
* 상태들을 외부로부터 캡슐화하기 위해 인터페이스를 만들어 시스템의 각 상태를 나타내는 클래스로 하여금 실체화하게 한다.
* 스트래티지 패턴과 유사함.
  * 차이점1 -> 스테이트 패턴에서는 행위가 자주 변경되지만 스트래티지 패턴에서는 행위가 한 번 고정되면 자주 변경되지 않는다.
  * 차이점2 -> 스테이트 패턴에서는 상태 변경을 State 요소를 구현한 클래스 자신이 수행하지만 스트래티지 패턴에서는 Client가 수행한다.
               즉, 스트래티지 패턴에서는 행위 시작과 변경이 Client 클래스에서 이루어지며 통제된다.

#### before (스테이트 패턴 적용 X)

![before](https://user-images.githubusercontent.com/28583661/71965335-ce624b00-3242-11ea-953a-de276850f934.PNG)

#### after (스테이트 패턴 적용 O)

![after](https://user-images.githubusercontent.com/28583661/71969299-ba6e1780-3249-11ea-93e1-1af7c6599562.PNG)

#### 스테이트 패턴 예제(벤딩 머신)

![vending](https://user-images.githubusercontent.com/28583661/71976976-0d9c9600-325b-11ea-8b2c-5d275646c538.PNG)

* VendingMachine : VendingMachine 클래스는 MoneyBox나 Drinking 클래스에 따라 상태가 달라지며, 상태에 따라 다른 일을 수행함.
* Drinking : 음료수에 대한 클래스. 음료수 가격과 재고 데이터를 가짐
* MoneyBox : VendingMachine 클래스가 가진 돈에 대한 클래스
* State : VendingMachine 클래스의 상태를 갖는 인터페이스
* NoMoneyState : 돈이 하나도 없는 상태
* NoEnoughMoneyState : 돈은 있으나 음료를 사기에는 부족한 상태
* EnoughMoneyState : 음료를 사기에 돈이 충분한 상태
* SoldOutState : 음료가 매진된 상태