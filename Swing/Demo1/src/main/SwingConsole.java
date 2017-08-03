package main;

import javax.swing.JFrame;

public class SwingConsole {
  public static void run(JFrame frame, int width, int high) {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(width, high);
  }
}
