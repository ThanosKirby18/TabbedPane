import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JTabbedPaneFrame tpf = new JTabbedPaneFrame();
    tpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tpf.setSize(450, 400);
    tpf.setVisible(true);
  }
}