package Layout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import main.SwingConsole;

public class MyGridLayout extends JFrame {
  public MyGridLayout() {
    setLayout(new GridLayout(7,3));
    for (int i  = 0; i < 20; i++)
      add(new JButton("Button" + i));
  }

  public static void main(String[] args) {
    SwingConsole.run(new MyGridLayout(),300,300);
  }
}
