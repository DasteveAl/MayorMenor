import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MayorMenor extends JDialog {
    private JPanel Main;
    private JTextField txtNumA;
    private JTextField txtNumB;
    private JButton salirButton;
    private JButton borrarButton;
    private JButton resultadoButton;

    public MayorMenor(JFrame parent) {
        super(parent);
        setTitle("Mayor o Menor");
        setContentPane(Main);
        setMinimumSize(new Dimension(450,300));
        setModal(true);
        setLocationRelativeTo(parent);


        resultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Numeros miNumero = new Numeros();

                double numA = Double.parseDouble(txtNumA.getText());
                miNumero.setNumA(numA);
                double numB = Double.parseDouble(txtNumB.getText());
                miNumero.setNumB(numB);

                String msg = miNumero.getResult();

                JOptionPane.showMessageDialog(null,msg);
            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumA.setText("");
                txtNumB.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        MayorMenor form = new MayorMenor(null);
    }
}
