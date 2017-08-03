package Layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.SwingConsole;

public class MyFlowLayout extends JFrame {
  public MyFlowLayout() {
    setLayout(new FlowLayout());
    for (int i = 0; i < 30; i++) {
      add(new JButton("Button" + i));
    }
  }

  public static void main(String[] args) {
    SwingConsole.run(new MyFlowLayout(), 300,300);
  }

}
