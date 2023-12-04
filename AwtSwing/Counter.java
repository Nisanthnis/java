import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Counter {
    TextField display;
    Button Increment,decrement,reset;
   
    Counter(){

         Frame frame=new Frame();
         
         display=new TextField("0");
         display.setBounds(40,100,200,60);


//--------------------------------------------------------------------------

         Increment=new Button("Increment");
         Increment.setBounds(40,170,100,40);
         
         ActionListener incAction =new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num=Integer.parseInt(display.getText());
                display.setText(Integer.toString(++num));
            }
         };

         Increment.addActionListener(incAction);

         
//--------------------------------------------------------------------

         decrement=new Button("Decrement");
         decrement.setBounds(150,170,100,40);

         ActionListener decAction =new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int num=Integer.parseInt(display.getText());
                if(num>0){
                    display.setText(Integer.toString(--num));
            
                }
            }
         };

         decrement.addActionListener(decAction);

//-------------------------------------------------------------------------
        
         reset=new Button("Reset");
         reset.setBounds(260,170,100,40);

         ActionListener resAction =new ActionListener() {
            public void actionPerformed(ActionEvent e){
                display.setText("0");
            }
         };
         reset.addActionListener(resAction); 

//---------------------------------------------------------------

        WindowAdapter wapt=new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        frame.addWindowListener(wapt);
        
 //-----------------------------------------------------------------       
        
        frame.add(display);
        frame.add(Increment);
        frame.add(decrement);
        frame.add(reset);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setTitle("Counter game");
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Counter();
    }
}
