package src.main.java.com.ktony.inflearn.intelij.chap6.code;

public class ReIndent {
    /*
     * ctrl + shift + [J] 라인 합치기의 반대
     * ctrl + alt + [L] 라인 나누기
     * */
    public void rename() {
        String legacy = "a";
        for (int i = 0; i < 10; i++) {
            System.out.println(legacy);
        }
        System.out.println("한번더: " + legacy);
    }
}
