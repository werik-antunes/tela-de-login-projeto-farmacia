package login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPerfil extends JFrame implements ActionListener {

	JLabel lblUsuario, lblSenha, lblMensagem;

	JTextField txtUsuario;

	JPasswordField txtSenha;

	JButton btnEntrar, btnSair;

	public LoginPerfil() {

		super("Tela de LoginPerfil");

		this.setSize(400, 300);

		this.setLayout(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblUsuario = new JLabel("Usuário:");

		lblUsuario.setBounds(50, 50, 100, 25);

		txtUsuario = new JTextField();

		txtUsuario.setBounds(110, 50, 200, 25);

		lblSenha = new JLabel("Senha:");

		lblSenha.setBounds(50, 80, 100, 25);

		txtSenha = new JPasswordField();

		txtSenha.setBounds(110, 80, 200, 25);

		btnEntrar = new JButton("Entrar");

		btnEntrar.setBounds(50, 120, 100, 25);

		btnEntrar.addActionListener(this);

		btnSair = new JButton("Sair");

		btnSair.setBounds(200, 120, 100, 25);

		btnSair.addActionListener(this);

		lblMensagem = new JLabel("");

		lblMensagem.setBounds(50, 160, 200, 25);

		this.add(lblUsuario);

		this.add(txtUsuario);

		this.add(lblSenha);

		this.add(txtSenha);

		this.add(btnEntrar);

		this.add(btnSair);

		this.add(lblMensagem);	
	}

	public void verificaLoginPerfil() {

		String usuario = txtUsuario.getText();

		String senha = new String(txtSenha.getPassword());

		if (usuario.equals("admin") && senha.equals("123")) {

			lblMensagem.setText("Seja bem-vindo, administrador!");

			lblMensagem.setForeground(Color.blue);
		}

		else if (usuario.equals("user") && senha.equals("123")) {

			lblMensagem.setText("Seja bem-vindo!");

			lblMensagem.setForeground(Color.blue);
		}

		else {

			lblMensagem.setText("Usuário ou senha incorretos!");

			lblMensagem.setForeground(Color.red);
		}
	}

	@Override

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnEntrar) {

			verificaLoginPerfil();
		}

		else if (e.getSource() == btnSair) {

			System.exit(0);
		}
	}

	public static void main(String[] args) {

		JFrame janela = new LoginPerfil();

		janela.setVisible(true);

	}
}
