package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class FormularioPersona extends JDialog {
  private JPanel pnlSuperior, pnlInferior;
  private JButton btnAceptar, btnLimpiar;
  private JLabel lblNewLabel;
  private JLabel lblNombre;
  private JComboBox cmbCiudad;
  private ButtonGroup grupo;
  private JLabel lblCiudad;
  private JTextField txtNombre;
  private JRadioButton rdbtnMasculino;
  private JRadioButton rdbtnFemenino;

  public FormularioPersona() {
    iniciarComponentes();
    iniciarManejadoresEventos();
  }

  private void iniciarComponentes() {
    setTitle("Formulario Personas");
    /* tamaï¿½o de la ventana, no es necesario */
    setLocationRelativeTo(null);
    setResizable(true);
    pnlSuperior = new JPanel();
    pnlSuperior.setBounds(0, 0, 434, 1);

    pnlSuperior.setLayout(null);
    lblNewLabel = new JLabel("Ingreso de datos");
    lblNewLabel.setBounds(10, 10, 202, 20);
    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD |
        Font.ITALIC, 16));
    pnlSuperior.add(lblNewLabel);

    btnLimpiar = new JButton();
    btnLimpiar.setText("Limpiar");
    btnAceptar = new JButton();
    btnAceptar.setText("Aceptar");

    pnlInferior = new JPanel();
    pnlInferior.setBounds(0, 229, 434, 33);
    pnlInferior.add(btnLimpiar);
    getContentPane().setLayout(null);
    getContentPane().add(pnlSuperior);
    getContentPane().add(pnlInferior);
    pnlInferior.add(btnAceptar);

    txtNombre = new JTextField();
    txtNombre.setBounds(170, 56, 149, 20);
    getContentPane().add(txtNombre);
    txtNombre.setColumns(10);

    cmbCiudad = new JComboBox();
    cmbCiudad.setToolTipText("");
    cmbCiudad.setBounds(170, 87, 149, 22);
    getContentPane().add(cmbCiudad);

    lblCiudad = new JLabel("Ciudad:");
    lblCiudad.setBounds(61, 87, 46, 14);
    getContentPane().add(lblCiudad);

    lblNombre = new JLabel("Nombre:");
    lblNombre.setBounds(61, 56, 46, 14);
    getContentPane().add(lblNombre);

    rdbtnMasculino = new JRadioButton("Masculino");
    rdbtnMasculino.setBounds(160, 138, 109, 23);
    getContentPane().add(rdbtnMasculino);

    rdbtnFemenino = new JRadioButton("Femenino");
    rdbtnFemenino.setBounds(49, 138, 109, 23);
    getContentPane().add(rdbtnFemenino);

    JPanel panel = new JPanel();
    panel.setBorder(new TitledBorder(null, "Sexo",
        TitledBorder.LEADING,
        TitledBorder.TOP, null, null));
    panel.setBounds(29, 120, 212, 52);
    getContentPane().add(panel);

    JPanel pnlSexo = new JPanel();
    pnlSexo.setBorder(BorderFactory.createTitledBorder("Sexo"));
    pnlSexo.setLayout(new FlowLayout(FlowLayout.CENTER));
    grupo = new ButtonGroup();
    rdbtnMasculino = new JRadioButton("Masculino", false);
    grupo.add(rdbtnMasculino);
    rdbtnFemenino = new JRadioButton("Femenino", false);
    grupo.add(rdbtnFemenino);
    pnlSexo.add(rdbtnFemenino);
    pnlSexo.add(rdbtnMasculino);
  }

  public void iniciarManejadoresEventos() {
    btnLimpiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        txtNombre.setText(null);
      }
    });

    btnAceptar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showInputDialog(txtNombre.getText());
        JOptionPane.showInputDialog(((Object) cmbCiudad));
      }
    });
  }

  public static void main(String[] args) {
    FormularioPersona vent = new FormularioPersona();
    vent.setVisible(true);
    vent.pack();
  }
}