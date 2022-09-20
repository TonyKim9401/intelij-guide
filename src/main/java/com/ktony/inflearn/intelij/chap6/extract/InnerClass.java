package com.ktony.inflearn.intelij.chap6.extract;

import com.ktony.inflearn.intelij.chap6.code.Team;

public class InnerClass {

    /*
    * [F6] 을 이용해 내부 클래스 추출시
    * 같은 패키지 => 이상 없음
    * 다른 패키지 => 자동 import 까지 수행
    * */
    public void moveInnerClass(){
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

}
