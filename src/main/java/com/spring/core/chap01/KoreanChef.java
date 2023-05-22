package com.spring.core.chap01;

public class KoreanChef implements Chef{

    @Override
    public void cook(){
        // sout 자동
        System.out.printf("한식 마스터 김한식 입니다.");
    }
}
