package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

// 임베디드 타입은 자바 기본 생성자를 public 또는 protected로 설정해야 함
// public 보다는 protected 가 더 안전함!!
// JPA가 객체를 생성할 때 리플렉션 같은 기술을 사용할 수 있도록 지원하기 위함
@Embeddable // 내장 타입
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }


    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
