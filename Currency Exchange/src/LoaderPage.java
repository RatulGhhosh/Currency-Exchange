import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LoaderPage extends JFrame {

    Border border = BorderFactory.createLineBorder(Color.black);

    String[] currency = {"INR", "USD", "AED"};
    JComboBox comboBox1, comboBox2;
    JTextField inputAmt, outputAmt;
    JButton ExchangeButton;

    LoaderPage() {
        super("Currency Exchange");

        JLabel jlabel1 = new JLabel("Select Currency : ");
        jlabel1.setBounds(160, 80, 350, 140);
        jlabel1.setFont(new Font("Kohinoor Bangla", Font.BOLD, 22));
        add(jlabel1);

        comboBox1 = new JComboBox(currency);
        comboBox1.setBounds(175, 170, 150, 40);
        comboBox1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 16));
        add(comboBox1);

        JLabel AmtLabel1 = new JLabel("Amount : ");
        AmtLabel1.setBounds(110, 200, 350, 140);
        AmtLabel1.setFont(new Font("Kohinoor Bangla", Font.BOLD, 18));
        add(AmtLabel1);

        inputAmt = new JTextField();
        inputAmt.setBorder(border);
        inputAmt.setBounds(200, 255, 150, 30);
        inputAmt.setFont(new Font("Kohinoor Bangla", Font.BOLD, 18));
        add(inputAmt);

        ExchangeButton = new JButton("Exchange");
        ExchangeButton.addActionListener(e -> exchage());
        ExchangeButton.setBounds(200, 324, 100, 40);
        ExchangeButton.setOpaque(true);
        ExchangeButton.setForeground(new Color(0,0,0));
        ExchangeButton.setBackground(new Color(255, 51, 0));
        ExchangeButton.setFont(new Font("Kohinoor Bangla", Font.BOLD, 16));
        add(ExchangeButton);


        JLabel jlabel2 = new JLabel("Select Currency : ");
        jlabel2.setBounds(160, 350, 350, 140);
        jlabel2.setFont(new Font("Kohinoor Bangla", Font.BOLD, 22));
        add(jlabel2);

        comboBox2 = new JComboBox(currency);
        comboBox2.setSelectedIndex(1);
        comboBox2.setBounds(175, 440, 150, 40);
        comboBox2.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 16));
        add(comboBox2);

        JLabel AmtLabel2 = new JLabel("Amount : ");
        AmtLabel2.setBounds(110, 470, 350, 140);
        AmtLabel2.setFont(new Font("Kohinoor Bangla", Font.BOLD, 18));
        add(AmtLabel2);

        outputAmt = new JTextField();
        outputAmt.setBorder(border);
        outputAmt.setEditable(false);
        outputAmt.setBounds(200, 524, 150, 30);
        outputAmt.setFont(new Font("Kohinoor Bangla", Font.BOLD, 18));
        add(outputAmt);


        setSize(500, 740);
        setLocationRelativeTo(null);
        contanpant().setBackground(123,234,32);
        setLayout(null);
        setVisible(true);
    }

    private void exchage() {
        try {
            if (comboBox1.getSelectedIndex() == 0 && comboBox2.getSelectedIndex() == 1) {

            } else if (comboBox1.getSelectedIndex()==0 && comboBox2.getSelectedIndex() == 2) {

            }else if (comboBox1.getSelectedIndex()==1 && comboBox2.getSelectedIndex() == 0) {

            } else if (comboBox1.getSelectedIndex()==1 && comboBox2.getSelectedIndex() == 2) {

            }else if (comboBox1.getSelectedIndex()==2 && comboBox2.getSelectedIndex() == 0) {

            } else if (comboBox1.getSelectedIndex()==2 && comboBox2.getSelectedIndex()==1) {

            }else {
                JOptionPane.showMessageDialog(null, "Please select different currency");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new LoaderPage();
    }
}
