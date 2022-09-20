package com.ktony.inflearn.intelij.chap2.special;

import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {
    public void increaseFocus(){

        /*
        * 원하는 범위 까지만 편하게 선택해서 복사,복붙,자르기 등등 가능
        *
        * ctrl + [W] 포커스의 단어가 선택됨 (누를수록 범위 증가)
        * ctrl + shift + [W] 포커스의 단어 범위가 줄어듦
        *
        * ctrl + alt + 양 방향 화살표   직전 포커스로 커서 이동
        * */
        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2022,9,18));
    }
}
