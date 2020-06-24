package Per;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.DAO_PerMember;
import RE.Main01;
import RE.PMVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class PerResearchPage { // 축제 정보 나오는 화면 (포스터, 일정, 라인업, 주막리스트, 택시풀)


	public JFrame frame;
	private JTextField txt_Search;
	private JPanel panel_1;
	private JTabbedPane tabbedPane;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton btn_Enroll;
	private JTextField txt_SearchCarpool;
	private JButton btn_SearchCarpool;
	private JPanel panel_7;
	private PMVO vo;
	private JLabel lbl_info;
	
	public void setPMVO(PMVO vo) {
		this.vo = vo;
		lbl_info.setText(vo.getPER_NAME()+"님 환영합니다.");
	}

	public PerResearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 897, 657);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 857, 598);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txt_Search = new JTextField();
		txt_Search.setBounds(12, 10, 200, 40);
		txt_Search.setText("\uAC80\uC0C9\uD560 \uB300\uD559\uC744 \uC785\uB825\uD558\uC138\uC694...");
		txt_Search.setColumns(10);
		panel.add(txt_Search);
		
		JButton btn_Search = new JButton("\uAC80\uC0C9");
		btn_Search.setBounds(222, 10, 69, 40);
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn_Search);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 127, 833, 461);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 833, 461);
		panel_1.add(tabbedPane);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("\uCD95\uC81C\uC815\uBCF4", null, panel_3, null);
		panel_3.setLayout(null);
		
		panel_5 = new JPanel();
		tabbedPane.addTab("주막리스트", null, panel_5, null);
		
		JButton btn_reserve = new JButton("\uC8FC\uB9C9\uC608\uC57D");
		btn_reserve.setBounds(719, 10, 97, 23);
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PerBookStore.main(null);
			}
		});
		panel_5.setLayout(null);
		panel_5.add(btn_reserve);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(814, 42, -807, 380);
		panel_5.add(scrollPane_1);
		
		panel_6 = new JPanel();
		tabbedPane.addTab("\uAC8C\uC2DC\uD310", null, panel_6, null);
		panel_6.setLayout(null);
		
		btn_Enroll = new JButton("\uAC8C\uC2DC\uAE00 \uB4F1\uB85D");
		btn_Enroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btn_Enroll.setBounds(700, 21, 97, 23);
		panel_6.add(btn_Enroll);
		
		txt_SearchCarpool = new JTextField();
		txt_SearchCarpool.setBounds(33, 11, 270, 21);
		panel_6.add(txt_SearchCarpool);
		txt_SearchCarpool.setColumns(10);
		
		btn_SearchCarpool = new JButton("\uAC80\uC0C9");
		btn_SearchCarpool.setBounds(315, 10, 97, 23);
		panel_6.add(btn_SearchCarpool);
		
		panel_7 = new JPanel();
		panel_7.setBounds(33, 58, 764, 364);
		panel_6.add(panel_7);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_7.add(scrollPane);
		
		JLabel lbl_delete = new JLabel("\uD68C\uC6D0\uD0C8\uD1F4");
		lbl_delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				frame.dispose();
				PerDelAccount05.main(null);
				
			}
		});
		lbl_delete.setBounds(788, 10, 57, 15);
		panel.add(lbl_delete);
		
		JLabel lbl_logout = new JLabel("\uB85C\uADF8\uC544\uC6C3");
		lbl_logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				Main01.main(null);
			}
		});
		lbl_logout.setBounds(715, 10, 57, 15);
		panel.add(lbl_logout);
		
		lbl_info = new JLabel("name\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4.");
		
		DAO_PerMember daopm = new DAO_PerMember();
		
//		PMVO pmvo = new PMVO();
		
//		lbl_info.setText(daopm.login(id, pw).ge+"환영합니다");
		lbl_info.setBounds(580, 10, 123, 15);
		panel.add(lbl_info);
	}
}
