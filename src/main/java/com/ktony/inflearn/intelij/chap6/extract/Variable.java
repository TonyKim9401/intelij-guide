package com.ktony.inflearn.intelij.chap6.extract;

public class Variable {

    public void extractVariable(){
        /*
        * ctrl + alt + [V]   => 선택한 범위의 코드 변수로 뽑아내기
        * */
        String message = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(message);
        System.out.println(message);
    }

}
