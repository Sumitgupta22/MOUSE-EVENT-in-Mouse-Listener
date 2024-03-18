// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.awt.*;
import java.awt.event.*;
class A extends Frame implements MouseListener{
  int x,y;
 Label l;
 static Color c;
  String massage;
  public A(String title){
    super(title);
    l=new Label("Perfoming Mouse Events");
   l.setBounds(20,20,40,50);
   add(l);
    c = new Color(100,100,100);
    massage= "Mouse Operation ";
    addMouseListener(this);
  }
  public void mouseClicked(MouseEvent e){
    x=e.getX();
    y=e.getY();
    massage="Mouse Clicked on "+x+" "+y;
    System.out.println(massage);
    this.setBackground(c);
   l.setBackground(Color.red);
    
  }
  public void mouseEntered(MouseEvent e){
    massage="Mouse is Entered";
    System.out.println(massage);
    setBackground(Color.green);
  }
  public void mouseExited(MouseEvent e){
    massage="Mouse is Exited";
    System.out.println(massage);
    setBackground(Color.pink);
    
  }
  public void mousePressed(MouseEvent e){
    massage="Mouse is Pressed";
    System.out.println(massage);
    setBackground(Color.blue);
  }
  public void mouseReleased(MouseEvent e){
    massage="Mouse is Released";
    System.out.println(massage);
    setBackground(Color.yellow);
  }
}
public class Main {
  public static void main(String[] args) {
    A obj = new A("Mouse Event");
    obj.setSize(300,300);
    obj.setVisible(true);
    
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}