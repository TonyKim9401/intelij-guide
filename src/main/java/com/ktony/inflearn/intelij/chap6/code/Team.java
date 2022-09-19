package src.main.java.com.ktony.inflearn.intelij.chap6.code;

/*
 * [F6] 내부 클래스를 외부 클래스로 뽑아냄
 * */
public class Team {
    private String name;
    private String code;

    public Team(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
