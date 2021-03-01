import java.awt.BorderLayout; 
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame
{
  public JTabbedPaneFrame()
  {
    super("JTabbedPane Demo");

    JTabbedPane tabPane = new JTabbedPane();

    JLabel label1 = new JLabel ("This is called panel 1", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Tab One", null, panel1, "FirstPanel");

    JLabel label2 = new JLabel ("This is called Panel Two", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    tabPane.addTab("Tab Two", null, panel2, "SecondPanel");

    JLabel label3 = new JLabel ("These are Fabulous Buttons", SwingConstants.CENTER);
    JPanel panel3 = new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.add(label3);
    panel3.add(new JButton("North"), BorderLayout.NORTH);
    panel3.add(new JButton("East"), BorderLayout.EAST); 
    panel3.add(new JButton("West"), BorderLayout.WEST);       
    panel3.add(new JButton("South"), BorderLayout.SOUTH);
    tabPane.addTab("Tab Three", null, panel3, "ThirdPanel");
    add(tabPane);
    

  }
}