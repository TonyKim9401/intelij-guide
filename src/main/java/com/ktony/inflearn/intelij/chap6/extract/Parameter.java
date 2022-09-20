package com.ktony.inflearn.intelij.chap6.extract;

public class Parameter {

    /*
    * ctrl + alt + [P] 해당 값을 메소드의 파라미터로 뽑아내기
    * + alt + shift + [O] 오버로딩 메소드를 만들어 파라미터로 추출
    * */
    public void extractParameter() {
        extractParameter(10);
    }

    /*
    * ctrl + alt + [P] 해당 값을 메소드의 파라미터로 뽑아내기
    * + alt + shift + [O] 오버로딩 메소드를 만들어 파라미터로 추출
    * */
    public void extractParameter(int num){
        System.out.println(num);
        System.out.println(num);
    }
}
