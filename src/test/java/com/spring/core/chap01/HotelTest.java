package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

public class HotelTest {

    // 테스트 영역에서는 @Test가 붙은 메서드를 하나하나 실행하거나
    // 클래스명 왼쪽읜 버튼을 이용해 한 번씩 전체적으로 실행할 수 있음
    @Test
    public void hotelTest(){
        Hotel hotel = new Hotel();
        hotel.inform();
    }
}
