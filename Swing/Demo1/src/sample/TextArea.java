package sample;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import main.*;
public class TextArea extends JFrame {
  private JTextArea area = new JTextArea(20,40);

  public TextArea()  {
    add(new JScrollPane(area));
  }

  public static void main(String[] args) {
    SwingConsole.run(new TextArea(), 300,300);
  }
}
