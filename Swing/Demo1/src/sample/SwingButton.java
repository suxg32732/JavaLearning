package sample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import main.*;
public class SwingButton extends JFrame {
  private JButton b1 = new JButton("B1");
  private JButton b2 = new JButton("B2");
  private JTextField field = new JTextField(10);

  public SwingButton() {
    setLayout( new FlowLayout());
    add(b1);
    add(b2);
    add(field);
    b1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
//        String name = ((JButton) e.getSource()).getText();
        String name = e.getActionCommand();
        field.setText(name);

      }
    });
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        field.setText("233");
      }
    });
  }

  public static void main(String[] args) {
    SwingConsole.run(new SwingButton(), 300,300);
  }


}
