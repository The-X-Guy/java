import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MouseTracking {

	private JFrame frmMTrack;
	private final ButtonGroup buttonGroupSexo = new ButtonGroup();
	private final ButtonGroup buttonGroupNacionalidad = new ButtonGroup();
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseTracking window = new MouseTracking();
					window.frmMTrack.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MouseTracking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frmMTrack = new JFrame();
		frmMTrack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMTrack.setBounds(100, 100, 526, 432);
		
		frmMTrack.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e){
				Point posicion = frmMTrack.getMousePosition();
				String x = String.valueOf((int)posicion.getX());
				String y = String.valueOf((int)posicion.getY());
				frmMTrack.setTitle("Ratón (" + x + ", " + y + ")");
		}
		});
		
		JLabel lblAficiones = new JLabel("Aficiones:");
		lblAficiones.setBounds(160, 33, 248, 25);
		
		JCheckBox chckbxDeportes = new JCheckBox("Deportes");
		chckbxDeportes.setBounds(39, 57, 113, 25);
		
		JCheckBox chckbxOtros = new JCheckBox("Otros");
		chckbxOtros.setBounds(39, 81, 113, 25);
		
		JCheckBox chckbxCine = new JCheckBox("Cine");
		chckbxCine.setBounds(39, 33, 113, 25);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(39, 135, 139, 80);
		frmMTrack.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setBounds(6, 18, 127, 25);
		panel_1.add(rdbtnHombre);
		buttonGroupSexo.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(6, 48, 127, 25);
		panel_1.add(rdbtnMujer);
		buttonGroupSexo.add(rdbtnMujer);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nacionalidad", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(190, 135, 139, 80);
		frmMTrack.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnEspanola = new JRadioButton("Espa\u00F1ola");
		rdbtnEspanola.setSelected(true);
		rdbtnEspanola.setBounds(6, 18, 127, 25);
		panel.add(rdbtnEspanola);
		buttonGroupNacionalidad.add(rdbtnEspanola);
		
		JRadioButton rdbtnExtranjera = new JRadioButton("Extranjera");
		rdbtnExtranjera.setBounds(6, 48, 127, 25);
		panel.add(rdbtnExtranjera);
		buttonGroupNacionalidad.add(rdbtnExtranjera);
		
		JLabel lblDatos = new JLabel("Datos:");
		lblDatos.setBounds(39, 236, 336, 25);
		frmMTrack.getContentPane().add(lblDatos);
		
		JToggleButton tglbtnEstCivil = new JToggleButton("Soltero");
		tglbtnEstCivil.setBounds(341, 143, 137, 25);
		
		JComboBox comboBoxComunidades = new JComboBox();
		comboBoxComunidades.setModel(new DefaultComboBoxModel(new String[] {"Andaluc\u00EDa", "Arag\u00F3n", "Catalu\u00F1a", "Castilla La Mancha", "Castilla y Le\u00F3n", "Comunidad de Madrid", "Comunidad Valenciana", "Extremadura", "Otros"}));
		comboBoxComunidades.setBounds(190, 307, 137, 22);
		frmMTrack.getContentPane().add(comboBoxComunidades);
		
		JLabel lblComunidadAutnoma = new JLabel("Comunidad aut\u00F3noma:");
		lblComunidadAutnoma.setDisplayedMnemonic('N');
		lblComunidadAutnoma.setBounds(39, 310, 139, 16);
		frmMTrack.getContentPane().add(lblComunidadAutnoma);
		
		ChangeListener c = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String cad = "Aficiones: ";
				if (chckbxCine.isSelected()) cad += " cine";
				if (chckbxDeportes.isSelected()) cad += " deportes";
				if (chckbxOtros.isSelected()) cad += " otros";
				lblAficiones.setText(cad);
			}
		};
		
		ActionListener combo = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad = "Datos: ";
				if (rdbtnHombre.isSelected()) cad += "hombre,";
				else cad += "mujer,";
				if (rdbtnEspanola.isSelected()) cad += " española, ";
				else cad += " extranjera.";
				if (tglbtnEstCivil.isSelected()) {
					tglbtnEstCivil.setText("Casado");
					cad += "casado. ";
				} else {
					cad += "soltero. ";
					tglbtnEstCivil.setText("Soltero");
				}
				if (comboBoxComunidades.getSelectedIndex()==-1)
					cad += ", ninguna comunidad";
				else
					cad += ".";
				cad += comboBoxComunidades.getSelectedItem();
				lblDatos.setText(cad);
			}
		};
		
		ChangeListener datos = new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String cad = "Datos: ";
				if (rdbtnHombre.isSelected()) cad += "hombre,";
				else cad += "mujer,";
				if (rdbtnEspanola.isSelected()) cad += " española, ";
				else cad += " extranjera.";
				if (tglbtnEstCivil.isSelected()) {
					tglbtnEstCivil.setText("Casado");
					cad += "casado. ";
				} else {
					cad += "soltero. ";
					tglbtnEstCivil.setText("Soltero");
				}
				cad += comboBoxComunidades.getSelectedItem();
				lblDatos.setText(cad);
			}
		};

		
		chckbxCine.addChangeListener(c);
		chckbxDeportes.addChangeListener(c);
		chckbxOtros.addChangeListener(c);
		rdbtnHombre.addChangeListener(datos);
		rdbtnEspanola.addChangeListener(datos);
		tglbtnEstCivil.addChangeListener(datos);
		comboBoxComunidades.addActionListener(combo);
		
		frmMTrack.getContentPane().setLayout(null);
		frmMTrack.getContentPane().add(chckbxDeportes);
		frmMTrack.getContentPane().add(chckbxCine);
		frmMTrack.getContentPane().add(chckbxOtros);
		frmMTrack.getContentPane().add(lblAficiones);
		frmMTrack.getContentPane().add(tglbtnEstCivil);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setDisplayedMnemonic('N');
		lblNombre.setBounds(39, 273, 56, 16);
		frmMTrack.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		lblNombre.setLabelFor(textNombre);
		textNombre.setBounds(107, 270, 156, 22);
		frmMTrack.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		
	}
}
