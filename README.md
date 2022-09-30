# samp-jpa
## 엔티티(Entity)  Board.java 클래스

### Getter
getter 메서드를 생성해주는 롬복 기능

### NoArgsConstuctor(acces = AccessLevel.PROTECTED)
기본 생성자를 생성해 주는 어노테이션

access 속성을 이용해서 동일한 패키지 내의 클래스에서만 객체를 생성할 수 있도록 제어한다.

### @Entity
해당 클래스가 테이블과 매핑되는 JPA의 엔티티(Entity) 클래스임을 의미한다. 기본적으로 클래스명(Camel Case)를 테이블명(Snake Case)으로 매핑한다. 예를 들어 user_role이라는 테이블은 UserRole이라는 이름의 클래스로 네이밍 하면 되고, 혹시라도 클래스명과 테이블명이 다를 수밖에 없는 상황에서는 클래스 레벨에 @Table을 선언하고, @Table(name = "user_role")과 같이 name 속성을 이용해서 처리해 주시면 됩니다.

### @Id
해당 멤버가 엔티티(Entity)의 PK 임을 의미한다. 보통 MySQL DB PK를 bigint 타입으로, 엔티티(Entity)에서는 Long 타입으로 선언한다. 데이터의 양이 그리 많지 않은 경우에는 Integger로 사용해도 된다.

### @GeneratedValue(strategy = GenerationType.IDENTITY)
PK 생성 전략을 설정하는 어노테이션, MySQL은 자동 증가(AUTO_INCREMENT)를 지원하는 DB이며, PK 자동 증가를 지원하는 DB는 해당 어노테이션을 선언해야 한다.

오라클과 같이 시퀀스(Sequence)를 이용하는 DB는 GenerationType.SEQUENCE를 이용해야 하며, GenerationType.AUTO로 설정하게 되면 DB에서 제공하는 PK 생성 전략을 가져가게 된다.

### JPA 레파지토리(Repository) BoardRepository.java 인터페이스 생성
인터페이스 생성이 완료되면 다음과 같이 JpaRepository<T, D> 인터페이스를 상속받아 주면 된다. 
