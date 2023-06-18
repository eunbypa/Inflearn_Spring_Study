package hello.core.singleton;

// 싱글톤은 반드시 무상태로 설정!!
public class StatefulService {
//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; // 여기가 문제!
        return price;
    }

//    public int getPrice(){
//        return price;
//    }
}
