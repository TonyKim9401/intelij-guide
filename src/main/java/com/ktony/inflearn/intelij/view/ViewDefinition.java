package src.main.java.com.ktony.inflearn.intelij.view;

public class ViewDefinition {

    public void viewDefinition(){
        /*
        * ctrl + shift + [I]
        * 메소드의 구현부 미리보기
        * */
        EmailSender emailSender = new EmailSender(1L, "tony" ,"tony@gmail.com");
        emailSender.send("test@gmail.com");
    }
}
