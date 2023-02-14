package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class JanelaCadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroPessoa frame = new JanelaCadastroPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnnew = new JButton("New salve");
		btnnew.setBounds(157, 10, 89, 23);
		contentPane.add(btnnew);
		
		textField = new JTextField();
		textField.setBounds(57, 159, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(273, 159, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblnome = new JLabel("New label");
		lblnome.setBounds(291, 110, 46, 14);
		contentPane.add(lblnome);
		
		JLabel lblcpf = new JLabel("New label");
		lblcpf.setBounds(77, 109, 46, 17);
		contentPane.add(lblcpf);
	}
}
	JButton btnSalve = new JButton("New salve");
	btnSalve.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String nome = txtNome.gettext();
			String cpf = txtCpf.gettext();
		}
	)}
	}
	}

	if( nome.isEmpty()) {
		JOptionPane.showMessageDialog(null, "nenhum");
	}
	
	if( cpf.isEmpty()) {
		JOptionPane.showMessageDialog(null, "nenhum");
	}
	}
	
	
	
	
	
	
	FuncionarioDAO bancodado = FuncionarioDAO.get
	
	
	
	


