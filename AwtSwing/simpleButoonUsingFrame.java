import java.awt.*;
public class simpleButoonUsingFrame extends Frame{
    simpleButoonUsingFrame(){
        Button btn=new Button("sign up");
        add(btn);
        setVisible(true);
       
        setSize(100,100);
    }
    public static void main(String[] args) {
       new simpleButoonUsingFrame();
    }
}