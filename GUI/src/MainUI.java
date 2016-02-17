import javax.swing.*;

/**
 * Created by ismael on 2/14/16.
 */
public class MainUI extends JFrame{
    private JPanel rightPane;
    private JPanel mainPane;
    private JPanel leftPane;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CutreOS");
        frame.setContentPane(new MainUI().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel memoryPane;
    private JPanel CPUPane;
    private JPanel newProcessPane;
    private JTextField CurrentTimeText;
    private JPanel mainWindow;
    private JPanel currentProcessPane;
    private JTextField textField1;


    public MainUI(){
    }
}
