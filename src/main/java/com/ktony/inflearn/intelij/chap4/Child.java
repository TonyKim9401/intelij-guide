package com.ktony.inflearn.intelij.chap4;

public class Child implements Parent{
    /*
    *  ctrl + [I]
    *  인터페이스의 구현 할 수 있는 메소드들을 표시해줌
    * */

    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        return false;
    }
}
