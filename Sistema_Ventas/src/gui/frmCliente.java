package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class frmCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombres;
	private JLabel lblApellidos;
	private JLabel lblDireccion;
	private JLabel lblTelefono;
	private JLabel lblDni;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnModificacion;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JScrollPane scrollPane;
	private JTable table;
	private String[][] datos = {{/*"hola","que tal","todo bien","espero", "que si", "eu"},
	{"hola","que tal","todo bien","espero", "que si", "eu"*/}};
	private String [] cabezera = {"CODIGO","NOMBRES","APELLIDOS","DIRECCION","TELEFONO", "DNI"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCliente frame = new frmCliente();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmCliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 774);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("CODIGO:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 96, 24);
		contentPane.add(lblNewLabel);
		
		lblNombres = new JLabel("NOMBRES:");
		lblNombres.setFont(new Font("Arial", Font.BOLD, 16));
		lblNombres.setBounds(10, 46, 96, 24);
		contentPane.add(lblNombres);
		
		lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setFont(new Font("Arial", Font.BOLD, 16));
		lblApellidos.setBounds(10, 81, 108, 24);
		contentPane.add(lblApellidos);
		
		lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setFont(new Font("Arial", Font.BOLD, 16));
		lblDireccion.setBounds(10, 116, 108, 24);
		contentPane.add(lblDireccion);
		
		lblTelefono = new JLabel("TELEFONO:");
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelefono.setBounds(10, 151, 96, 24);
		contentPane.add(lblTelefono);
		
		lblDni = new JLabel("D.N.I:");
		lblDni.setFont(new Font("Arial", Font.BOLD, 16));
		lblDni.setBounds(10, 186, 96, 24);
		contentPane.add(lblDni);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(116, 11, 181, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 48, 181, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 81, 181, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 116, 181, 24);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 151, 181, 24);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(116, 186, 181, 24);
		contentPane.add(textField_5);
		
		btnNewButton = new JButton("INGRESO");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(728, 10, 174, 27);
		contentPane.add(btnNewButton);
		
		btnModificacion = new JButton("MODIFICACION");
		btnModificacion.setFont(new Font("Arial", Font.BOLD, 16));
		btnModificacion.setBounds(728, 45, 174, 27);
		contentPane.add(btnModificacion);
		
		btnNewButton_2 = new JButton("CONSULTA");
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_2.setBounds(728, 80, 174, 27);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("ELIMINACION");
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(728, 115, 174, 27);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("LISTADO");
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_4.setBounds(728, 150, 174, 27);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("ACEPTAR");
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_5.setBounds(728, 185, 174, 27);
		contentPane.add(btnNewButton_5);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 221, 892, 290);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		set_table();
	}
	
	public void set_table() {
		
		    DefaultTableModel model = new DefaultTableModel( datos,cabezera); // Crea el modelo de la tabla con los datos y la cabecera
		    table.setModel(model); // Establece el modelo en la tabla
		}

	}

