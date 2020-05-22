import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class ScrollBar {

	private JFrame frmEjemploUsoScrollbar;
	private JTextField txtIntroduceAlgo;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrollBar window = new ScrollBar();
					window.frmEjemploUsoScrollbar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScrollBar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploUsoScrollbar = new JFrame();
		frmEjemploUsoScrollbar.setTitle("Ejemplo uso scrollbar");
		frmEjemploUsoScrollbar.setBounds(100, 100, 450, 300);
		frmEjemploUsoScrollbar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollBar scroll = new JScrollBar();
		
		scroll.setOrientation(JScrollBar.HORIZONTAL);
		frmEjemploUsoScrollbar.getContentPane().add(scroll, BorderLayout.SOUTH);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Consolas", Font.BOLD, 18));
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		frmEjemploUsoScrollbar.getContentPane().add(lblMensaje, BorderLayout.CENTER);
		
		txtIntroduceAlgo = new JTextField();
		txtIntroduceAlgo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText(txtIntroduceAlgo.getText());
			}
		});
		
		txtIntroduceAlgo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.isActionKey()) 
					lblMensaje.setText(txtIntroduceAlgo.getText());
			}
		});
		
		txtIntroduceAlgo.setHorizontalAlignment(SwingConstants.CENTER);
		txtIntroduceAlgo.setText("Introduce algo...");
		frmEjemploUsoScrollbar.getContentPane().add(txtIntroduceAlgo, BorderLayout.NORTH);
		txtIntroduceAlgo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		frmEjemploUsoScrollbar.getContentPane().add(scrollPane, BorderLayout.WEST);
		
		scroll.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lblMensaje.setText(scroll.getValue()+"");
			}
		});	
	}

}
