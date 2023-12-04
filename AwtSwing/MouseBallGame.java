import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseBallGame extends Frame implements MouseMotionListener {
    
    int RectangeX=250,RectangleY=250,RectangleRadius=15;

    MouseBallGame(){

       addMouseMotionListener(this);
       
       setSize(2200,2200);
       setTitle("BallGame");
       setLayout(null);
       setVisible(true);

  //-------WindowListner-----------------        
    WindowAdapter wapt=new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    };

    addWindowListener(wapt);
//----------------------------------------
    }
   
    public void paint(Graphics g){
        super.paint(g);
         g.setColor(Color.RED);
        g.fill3DRect(RectangeX, RectangleY, 2*RectangleRadius, 2*RectangleRadius, true);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
          int x=e.getX();
        int y=e.getY();
        
        if(x<RectangeX+RectangleRadius ){
            RectangeX++;
        }

        if(x>RectangeX+RectangleRadius ) {
            RectangeX--;
        }
        
         if(y<RectangleY+RectangleRadius){
           
            RectangleY++;   
            
        }

        if(y>RectangleY+RectangleRadius ) {
           
                 RectangleY--;
            
           
        }
        repaint();  
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      
    }
    
    public static void main(String[] args) {
        new MouseBallGame();
    }
    


}
