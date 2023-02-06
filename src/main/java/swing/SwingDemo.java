

package swingPrg;


import javax.swing.*;
public class SwingDemo
{
  public static final int EN = 300;
  public static final int YUKSEKLIK = 200;

  public static void main(String[] args)
  {
    JFrame pencerem = new JFrame();
    pencerem.setSize(EN, YUKSEKLIK);
    JLabel etiket = new JLabel("Tıklama...");
    pencerem.getContentPane().add(etiket);

    WindowDestroyer dinleyici = new WindowDestroyer();
    pencerem.addWindowListener(dinleyici);

    pencerem.setVisible(true);
  }
}
