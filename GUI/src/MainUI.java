import javax.swing.*;

/**
 * Created by ismael on 2/14/16.
 */
public class MainUI extends JFrame{
    private JPanel rightPane;
    private JPanel mainPane;

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
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox1;
    private JPanel pageTablePane;
    private JPanel leftPane;
    private JPanel currentTimePane;
    private JTable pageTable;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JSpinner spinner1;
    private JButton button4;


    public MainUI(){
    }
}
