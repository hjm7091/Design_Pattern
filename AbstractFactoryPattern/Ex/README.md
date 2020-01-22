#### 간단한 내비게이션 예제 

![ex](https://user-images.githubusercontent.com/28583661/72865566-acc19300-3d1b-11ea-95ea-5f74ba057ebe.PNG)

#### 추상 팩토리 구성 요소

 AbstractFactory : NaviFactory

AbstractProduct : GPS, Screen, Map, PathFinder

ConcreteFactory : BasicNaviFactory, PremiumNaviFactory

ConcreteProduct : CheapGPS, SmallMap, SDScreen, SlowPathFinder, ExpensiveGPS, LargeMap, HDScreen, FastPathFinder

Stub : TestGPS, TestScreen, TestMap, TestPathFinder, TestNaviFactory
