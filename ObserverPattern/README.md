### 옵서버 패턴

* 옵서버 패턴은 데이터의 변경이 발생했을 경우 상대 클래스나 객체에 의존하지 않으면서 데이터 변경을 통보하고자 할 때 유용하다.
* 옵서버 패턴은 통보 대상 객체의 관리를 Subject 클래스와 Observer 인터페이스로 일반화한다. 그러면 데이터 변경을 통보하는 클래스
  (ConcreteSubject)는 통보 대상 클래스나 객체(ConcreteObserver)에 대한 의존성을 없앨 수 있다. 결과적으로 옵서버 패턴은 통보 대상
  클래스나 대상 객체의 변경에도 ConcreteSubject 클래스를 수정 없이 그대로 사용할 수 있도록 한다.
  
#### before (옵서버 패턴 적용 X)

![before](https://user-images.githubusercontent.com/28583661/72201986-c2be9080-349d-11ea-9986-8ef81051d0f3.PNG)

#### after (옵서버 패턴 적용 O)

![after](https://user-images.githubusercontent.com/28583661/72201987-c2be9080-349d-11ea-936f-b46df7960fab.PNG)