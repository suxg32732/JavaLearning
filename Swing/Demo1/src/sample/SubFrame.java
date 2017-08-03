package sample;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubFrame extends JFrame{
  JLabel label;

  public SubFrame() {
    super("Swing");
    label = new JLabel("Orig");
    add(label);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,200);
    setVisible(true);
  }

  static SubFrame subFrame;

  public static void main(String[] args) throws InterruptedException {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        subFrame = new SubFrame();
      }
    });
    TimeUnit.SECONDS.sleep(1);
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        subFrame.label.setText("New");
      }
    });
  }

}
