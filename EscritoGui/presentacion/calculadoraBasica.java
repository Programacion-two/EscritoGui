package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class calculadoraBasica extends JFrame {
  private JPanel contentPane;
  private JLabel lblNum1;
  private JLabel lblResultado;
  private JLabel lblNum2;
  private JButton btnSumar;
  private JButton btnRestar;
  private JButton btnMultiplicar;
  private JButton btnDividir;
  private JTextField txtNum1;
  private JTextField txtNum2;
  private JTextField txtResultado;

  public calculadoraBasica() {
    iniciarComponentes();
    iniciarManejadoresEventos();

  }

  public void iniciarComponentes() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 318, 298);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    lblNum2 = new JLabel("Num2:");
    lblNum2.setBounds(21, 74, 55, 16);
    contentPane.add(lblNum2);

    btnSumar = new JButton("+");
    btnSumar.setBounds(61, 128, 98, 26);
    contentPane.add(btnSumar);

    btnRestar = new JButton("-");
    btnRestar.setBounds(194, 128, 98, 26);
    contentPane.add(btnRestar);

    txtNum1 = new JTextField();
    txtNum1.setBounds(94, 25, 114, 20);
    contentPane.add(txtNum1);
    txtNum1.setColumns(10);

    txtNum2 = new JTextField();
    txtNum2.setBounds(94, 72, 114, 20);
    contentPane.add(txtNum2);
    txtNum2.setColumns(10);

    btnMultiplicar = new JButton("*");
    btnMultiplicar.setBounds(61, 165, 98, 26);
    contentPane.add(btnMultiplicar);

    btnDividir = new JButton("/");
    btnDividir.setBounds(194, 165, 98, 26);
    contentPane.add(btnDividir);

    lblResultado = new JLabel("RESULTADO");
    lblResultado.setBounds(20, 219, 84, 16);
    contentPane.add(lblResultado);
    txtResultado = new JTextField();
    txtResultado.setBounds(114, 217, 114, 20);
    contentPane.add(txtResultado);
    txtResultado.setColumns(10);

    lblNum1 = new JLabel("Num1:");
    lblNum1.setBounds(21, 27, 55, 16);
    contentPane.add(lblNum1);
  }

  public void iniciarManejadoresEventos() {
    btnSumar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        long num1 = Integer.valueOf(txtNum1.getText());
        long num2 = Integer.valueOf(txtNum1.getText());
        double sumar = num1 + num2;
        txtResultado.setText(String.valueOf(sumar));
  }
  });
    btnRestar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        long num1 = Integer.valueOf(txtNum1.getText());
        long num2 = Integer.valueOf(txtNum1.getText());
        double restar = num1 - num2;
        txtResultado.setText(String.valueOf(restar));
  }
  });
    btnMultiplicar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        long num1 = Integer.valueOf(txtNum1.getText());
          long num2 = Integer.valueOf(txtNum1.getText());
          double multiplicar = num1 * num2;
          txtResultado.setText(String.valueOf(multiplicar));
  }
  });
    btnDividir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          Integer.valueOf(txtNum1.getText());
          Integer.valueOf(txtNum1.getText());
          long num1 =txtNum1;
          long num2 txtNum2;
          double dividir = txtNum1 / txtNnum1;
          txtResultado.setText(String.valueOf(dividir));
          
          if(num1 == 0 || num2 == 0) {
            JOptionPane.showMessageDialog("No se puede dividir entre 0");
          }else {
            System.out.println("se pudo");
          }
          
        catch (Exception ex) {
          JOptionPane.showMesasangerDialog(null,e);
        }
      }
    });
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          calculadoraBasica frame = new calculadoraBasica();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
}