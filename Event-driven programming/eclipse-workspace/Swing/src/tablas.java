import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tablas {

	private JFrame frmMatrices;
	private JTable tableM1;
	private JTable tableM2;
	private JTable table_MSuma;
	private JTable tableMProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		};
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablas window = new tablas();
					window.frmMatrices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tablas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMatrices = new JFrame();
		frmMatrices.setTitle("Matrices");
		frmMatrices.setBounds(100, 100, 378, 225);
		frmMatrices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMatrices.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 360, 120);
		frmMatrices.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Matriz 1", null, layeredPane, null);
		layeredPane.setLayout(new BorderLayout(0, 0));
		
		tableM1 = new JTable();
		tableM1.setRowHeight(30);
		tableM1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"", "", ""
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableM1.getColumnModel().getColumn(0).setPreferredWidth(76);
		layeredPane.add(tableM1, BorderLayout.CENTER);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Matriz 2", null, layeredPane_1, null);
		layeredPane_1.setLayout(new BorderLayout(0, 0));
		
		tableM2 = new JTable();
		tableM2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"", "", ""
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableM2.setRowHeight(30);
		layeredPane_1.add(tableM2, BorderLayout.CENTER);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane.addTab("Suma", null, layeredPane_2, null);
		layeredPane_2.setLayout(new BorderLayout(0, 0));
		
		table_MSuma = new JTable();
		table_MSuma.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"", "", ""
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_MSuma.setRowHeight(30);
		layeredPane_2.add(table_MSuma, BorderLayout.CENTER);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("Producto", null, layeredPane_3, null);
		layeredPane_3.setLayout(new BorderLayout(0, 0));
		
		tableMProd = new JTable();
		tableMProd.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"", "", ""
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableMProd.setRowHeight(30);
		layeredPane_3.add(tableMProd, BorderLayout.CENTER);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// suma de matrices
				int suma = 0;
				for (int i = 0; i < tableM1.getRowCount(); i++) {
					for (int j = 0; j < tableM2.getColumnCount(); j++) {
						suma = (int)tableM1.getValueAt(i, j) + (int)tableM2.getValueAt(i, j);
						table_MSuma.setValueAt(new Integer(suma), i, j);
					}
				}
				
				// producto de matrices
				int prod, n, m;
				for (int i = 0; i < tableM1.getRowCount(); i++) {
					for (int j = 0; j < tableM1.getRowCount(); j++) {
						prod = 0;
						for (int k = 0; k < tableM2.getRowCount(); k++) {
							n = (int)tableM1.getValueAt(i, k);
							m = (int)tableM2.getValueAt(k, j);
							prod += n*m;
						}
						tableMProd.setValueAt(prod, i, j);
					}
				}
			}        
		});
		btnCalcular.setBounds(133, 133, 97, 25);
		frmMatrices.getContentPane().add(btnCalcular);
	}
}
