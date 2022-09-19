package src.main.java.com.ktony.inflearn.intelij.chap6.code;

public class ReturnType {
    /*
    * ctrl + shift + [F6]
    * 변수 타입 변경하기
    * */
    public void print(){
        String num = calculate();
        System.out.println(num);
    }

    public String calculate(){
        return "1";
    }

}
