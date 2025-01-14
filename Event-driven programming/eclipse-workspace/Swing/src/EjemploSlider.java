import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class EjemploSlider {

	private JFrame frmEjmploUsoSlider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploSlider window = new EjemploSlider();
					window.frmEjmploUsoSlider.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EjemploSlider() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjmploUsoSlider = new JFrame();
		frmEjmploUsoSlider.setTitle("Ejemplo uso slider");
		frmEjmploUsoSlider.setBounds(100, 100, 643, 413);
		frmEjmploUsoSlider.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjmploUsoSlider.getContentPane().setLayout(null);
		
		JLabel lblPrueba = new JLabel("Ejemplo");
		lblPrueba.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrueba.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrueba.setBounds(137, 154, 357, 123);
		frmEjmploUsoSlider.getContentPane().add(lblPrueba);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tama\u00F1o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(133, 64, 480, 77);
		frmEjmploUsoSlider.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(6, 18, 468, 52);
		panel.add(slider);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(32, 64, 91, 66);
		frmEjmploUsoSlider.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(6, 18, 65, 22);
		panel_1.add(spinner);
		spinner.setModel(new SpinnerListModel(new String[] {"Plain", "Italic", "Bold", "P+B", "I+B"}));
		
		
		slider.setMinimum(8);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(72);
		slider.setValue(12);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(8);
		slider.setPaintTicks(true);
		
		ChangeListener c = new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Font f = null;
				switch (spinner.getValue().toString()) {
					case "Plain":
						f = new Font("Tahoma", Font.PLAIN , slider.getValue());
						break;
					case "Bold":
						f = new Font("Tahoma", Font.BOLD , slider.getValue());
						break;
					case "Italic":
						f = new Font("Tahoma", Font.ITALIC , slider.getValue());
						break;
					case "P+B":
						f = new Font("Tahoma", Font.PLAIN+Font.BOLD , slider.getValue());
						break;
					case "I+B":
						f = new Font("Tahoma", Font.ITALIC+Font.BOLD , slider.getValue());
						break;					
				};
				lblPrueba.setFont(f);
			}
		};
		
		slider.addChangeListener(c);
		spinner.addChangeListener(c);
		
	}
}
