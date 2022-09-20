package com.ktony.inflearn.intelij.chap1.lineedit;

public class LineMove {
    public void moveLineAndStatement(){
        /*
         * shift + alt + 위,아래 방향키 (컴파일 에러 무시하고 옮김)
         * shift + ctrl + 위,아래 방향키 (현재 속한 범위 내에서 옮김)
         * */
        System.out.println("라인 구문 단위로 이동시킵니다.");

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

    }
}
