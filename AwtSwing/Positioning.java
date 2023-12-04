import java.awt.*;

public class Positioning {
    Positioning(){
        Frame frame=new Frame();

        Button btn=new Button("Click here");
        btn.setBounds(100,200,100,20);
        Label label=new Label("sign up");
        TextField txt=new TextField("Enter your name");
        TextArea ta=new TextArea("Enter your description ");
        Checkbox cb=new Checkbox("male");
        Choice ch=new Choice();
        ch.add("India");
        ch.add("usa");
        ch.add("Russia");


        frame.add(btn);
        frame.add(label);
        frame.add(txt);
        frame.add(ta);
        frame.add(cb);
        frame.add(ch);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setTitle("What's App");
    }
    
    
    
    public static void main(String[] args) {
        new Positioning();
    }
}
