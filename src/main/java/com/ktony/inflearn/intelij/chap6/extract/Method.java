package src.main.java.com.ktony.inflearn.intelij.chap6.extract;

import java.util.List;

public class Method {

    /*
    * 리팩토링의 이유
    * => 하나의 메소드가 하나의 기능만 수행 할 수 있도록
    *    구조를 만들기 위해!
    * */
    public void extractMethod(List<Book> books){
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        for(String s : book.getAuthors()){
            /*
            * ctrl + alt + [M] 해당 범위를 메소드로 리팩토링
            * + ctrl + alt + [M] 생성할 메소드의 상세 옵션 설정
            * */
            print(s);
        }
    }

    private void print(String s) {
        if("tony".equals(s)){
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book{
        private String title;
        private long price;
        private List<String> authors;
        
        public String getTitle(){
            return title;
        }
        public long getPrice(){
            return price;
        }
        public List<String> getAuthors(){
            return authors;
        }
    }
}
