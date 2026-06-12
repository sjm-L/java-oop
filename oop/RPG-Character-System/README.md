# RPG Character System

## 학습 목표
- Java 클래스와 객체 이해
- 상속 extends 이해
- super()로 부모 생성자 호출
- private 필드와 getter 이해
- attack() 메서드 오버라이드 연습

## 구현 내용
- Character 부모 클래스 생성
- Warrior, Mage 자식 클래스 생성
- 각 캐릭터마다 다른 attack() 동작 구현

## 실행 결과 예시
전사(체력100, 공격력20)가 검으로 공격합니다!
마법사(체력80, 공격력15)가 마법으로 공격합니다!

## 헷갈렸던 부분
- extends는 부모 클래스를 정하는 문법
- super()는 부모 생성자를 실행하는 문법
- private 필드는 직접 접근할 수 없어서 getter로 읽어야 함

```text
java-oop-practice
└─ oop
   └─ RPG-Character-System
      ├─ src
      │  ├─ Main.java
      │  └─ character
      │     ├─ Character.java
      │     ├─ Warrior.java
      │     └─ Mage.java
      └─ README.md
```
