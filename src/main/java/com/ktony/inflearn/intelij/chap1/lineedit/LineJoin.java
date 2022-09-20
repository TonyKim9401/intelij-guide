package com.ktony.inflearn.intelij.chap1.lineedit;

public class LineJoin {
    /*
    * ctrl + shift + [J] 라인 합치기
    * */
    public String joinString(){
        String profile = "안녕하세요." +
                "InteliJ 강의에 오신것을" +
                "환영합니다.";
        return profile;
    }
    public String createQuery(){
        String query = "SELECT * " +
                "FROM member " +
                "WHERE member.name = 'tony'";
        return query;
    }

}
