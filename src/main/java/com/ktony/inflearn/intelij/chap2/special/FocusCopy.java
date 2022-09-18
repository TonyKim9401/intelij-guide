package src.main.java.com.ktony.inflearn.intelij.chap2.special;

import java.util.ArrayList;
import java.util.List;

public class FocusCopy {

    public void copyFocus(){
        List<String> members = new ArrayList<>();

        /*
        * ctrl + ctrl + 방향키 위,아래 멀티 커서
        * */
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
    }
}
