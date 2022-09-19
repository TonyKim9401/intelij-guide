package src.main.java.com.ktony.inflearn.intelij.chap6.code;

public class Rename {
    /*
    * shift + [F6] 같은 이름을 가진 전체 변수를 한번에 변경 가능
    * */
    public void rename(){
        String name = "a";

        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }

        System.out.println("변수값: " + name);

    }
}
