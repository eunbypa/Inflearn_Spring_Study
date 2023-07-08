package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Tip1 : 외래키가 있는 곳을 연관관계의 주인으로 정해라!!
// Tip2 : 엔티티 클래스에서 Getter는 지향하고 Setter는 지양하자(꼭 필요한 경우만 사용)
// 이유 : Setter가 열려 있으면 변경 포인트가 너무 많아서 유지보수가 어려움
// Setter 대신 데이터 변경 지점을 명확하게 알 수 있도록 비즈니스 메서드를 별도 사용하는게 좋다!
// Tip3 : 모든 연관관계는 지연로딩으로 설정!!!
// 즉시로딩(EAGER)은 JPQL 실행 시 N+1 문제가 자주 발생함
// ex) JPQL select o from order o; -> SQL select * from order
// order 내 100개의 데이터가 존재 시 100(데이터 개수) + 1번 member를 가져오는 쿼리가 같이 실행되는 문제 발생
// Tip4 : @xxToOne -> 기본 fetch 전략이 즉시로딩(EAGER)이므로 지연로딩(LAZY)로 변경해야 함
// Tip5 : 컬렉션은 필드에서 초기화 하는 것이 안전함, Hibernate가 영속성 컨텍스트로 잘 관리할 수 있도록 컬렉션은 별도로 변경하지 말아야 함
@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
//        Hello hello = new Hello();
//        hello.setData("hello");
//        String data = hello.getData();

        SpringApplication.run(JpashopApplication.class, args);
    }

}
