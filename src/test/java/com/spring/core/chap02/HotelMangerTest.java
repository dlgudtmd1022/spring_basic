package com.spring.core.chap02;

import com.spring.core.chap02.config.HotelManger;
import org.junit.jupiter.api.Test;


public class HotelMangerTest {

    @Test
    public void diTest(){// 호텔 내미저 객체 생성
    HotelManger manager = new HotelManger();
    // 매니저 객체의  hotel()을 호출하면 내부적으로 Hotel을 조립해서 리턴
    Hotel hotel = manager.hotel();
    hotel.inform();
    }
}
