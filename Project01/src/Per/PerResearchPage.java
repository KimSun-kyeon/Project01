package Per;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import RE.DAO_PerMember;
import RE.DAO_Show;
import RE.DAO_Store;
import RE.Main01;
import RE.PMVO;
import RE.StoreVO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Group.GroupStoreEnroll02;
import RE.Main01;
import oracle.net.aso.e;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class PerResearchPage { // 축제 정보 나오는 화면 (포스터, 일정, 라인업, 주막리스트, 택시풀)

	public JFrame frame;
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
	private JScrollPane scrollPane_board;
	private JTable table;
	private JTextField txt_uni;
	private JLabel lbl_line;
	private ArrayList<String> list;
	private JComboBox comboBox;
	private PerAfterLogin pal;
<<<<<<< HEAD
=======
	private DAO_Store daostore = new DAO_Store();
	private GroupStoreEnroll02 enroll;
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git
	private JLabel lbl_image;

	public void setPMVO(PMVO vo) {
		this.vo = PerLogin02.vo;
		lbl_info.setText(vo.getPER_NAME() + "님 환영합니다.");
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
		String[] value = new String[list.size()];
		for (int i = 0; i < value.length; i++) {
			value[i] = list.get(i);
		}

		comboBox.setModel(new DefaultComboBoxModel(value));
//      comboBox.setModel(new DefaultComboBoxModel(new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));
	}

	public PerResearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	      // 이미지입력
	      URL url = this.getClass().getResource("../image/PerResearchPage.png");
	      String path = url.getPath();
	      Image image = new ImageIcon(path).getImage();

		// 이미지입력
		URL url = this.getClass().getResource("../image/PerResearchPage.png");
		String path = url.getPath();
		Image image = new ImageIcon(path).getImage();

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 668);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

<<<<<<< HEAD
		panel_1 = new JPanel();
		panel_1.setBounds(60, 86, 636, 487);
		panel.add(panel_1);
		panel_1.setLayout(null);
=======
	      panel_1 = new JPanel();
	      panel_1.setBounds(60, 86, 636, 487);
	      panel.add(panel_1);
	      panel_1.setLayout(null);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 24, 636, 469);
		panel_1.add(tabbedPane);
=======
	      tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	      tabbedPane.setBounds(0, 24, 636, 469);
	      panel_1.add(tabbedPane);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		panel_3 = new JPanel();
		tabbedPane.addTab("\uCD95\uC81C\uC815\uBCF4", null, panel_3, null);
		panel_3.setLayout(null);

		panel_5 = new JPanel();
		tabbedPane.addTab("주막리스트", null, panel_5, null);

<<<<<<< HEAD
		JButton btn_reserve = new JButton("\uC8FC\uB9C9\uC608\uC57D");
		btn_reserve.setBounds(521, 10, 97, 23);
		btn_reserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
=======
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

	      JButton btn_reserve = new JButton("\uC8FC\uB9C9\uC608\uC57D");
	      btn_reserve.setBounds(521, 10, 97, 23);
	      btn_reserve.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {

	            PerBookStore.main(null);
	         }
	      });
		panel_5.setLayout(null);
		panel_5.add(btn_reserve);

<<<<<<< HEAD
		JLabel lbl_post = new JLabel();
		lbl_post.setBounds(23, 55, 287, 329);
		panel_3.add(lbl_post);
=======
	      JLabel lbl_post = new JLabel();
	      lbl_post.setBounds(23, 55, 287, 329);
	      panel_3.add(lbl_post);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
		lbl_line = new JLabel();
		lbl_line.setBounds(324, 55, 287, 329);
		panel_3.add(lbl_line);
=======
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

	      lbl_line = new JLabel();
	      lbl_line.setBounds(324, 55, 287, 329);
	      panel_3.add(lbl_line);

<<<<<<< HEAD
		JScrollPane scrollPane_list = new JScrollPane(table_list); // ScrollPane에 table 삽입 잊지말기!
		scrollPane_list.setBounds(12, 42, 606, 380);
=======
		ArrayList<StoreVO> list2 = daostore.getinfo();

//		daostore.getStore(store_num, store_name, uni_name, major_name);

		Object[][] data = new Object[list2.size()][4];
		for (int i = 0; i < list2.size(); i++) {
			data[i][0] = list2.get(i).getStore_num();
			data[i][1] = list2.get(i).getStore_name();
			data[i][2] = list2.get(i).getUni_name();
			data[i][3] = list2.get(i).getMajor_name();
		}

		String colName[] = { "번호", "주막이름", "대학이름", "학과이름" };
		DefaultTableModel model = new DefaultTableModel(data, colName);
		JTable table_list = new JTable(model);

	      JScrollPane scrollPane_list = new JScrollPane(table_list); // ScrollPane에 table 삽입 잊지말기!
	      scrollPane_list.setBounds(12, 42, 606, 380);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		JFrame frame = new JFrame("Table Test");
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setLocation(500, 400);

		panel_5.add(scrollPane_list);
		add(scrollPane_list);
//      JScrollPane scrollPane_1 = new JScrollPane();
//      scrollPane_1.setBounds(814, 42, -807, 380);
//      panel_5.add(scrollPane_1);

		panel_6 = new JPanel();
		tabbedPane.addTab("\uAC8C\uC2DC\uD310", null, panel_6, null);
		panel_6.setLayout(null);

		btn_Enroll = new JButton("\uAC8C\uC2DC\uAE00 \uB4F1\uB85D");
		btn_Enroll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
<<<<<<< HEAD
		btn_Enroll.setBounds(511, 25, 97, 23);
		panel_6.add(btn_Enroll);
=======
	      btn_Enroll.setBounds(511, 25, 97, 23);
	      panel_6.add(btn_Enroll);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		txt_SearchCarpool = new JTextField();
		txt_SearchCarpool.setBounds(33, 11, 270, 21);
		panel_6.add(txt_SearchCarpool);
		txt_SearchCarpool.setColumns(10);

		btn_SearchCarpool = new JButton("\uAC80\uC0C9");
		btn_SearchCarpool.setBounds(315, 10, 97, 23);
		panel_6.add(btn_SearchCarpool);

<<<<<<< HEAD
		panel_7 = new JPanel();
		panel_7.setBounds(12, 58, 607, 364);
		panel_6.add(panel_7);
		panel_7.setLayout(null);
=======
	      panel_7 = new JPanel();
	      panel_7.setBounds(12, 58, 607, 364);
	      panel_6.add(panel_7);
	      panel_7.setLayout(null);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		String colBoard[] = { "번호", "제목", "내용", "날짜", "아이디" };
		DefaultTableModel Board = new DefaultTableModel(colBoard, 0);
		JTable table_board = new JTable(new DefaultTableModel(
				new Object[][] { { "1", "\uD0DD\uC2DC", "\uC6B4\uC554\uB3D9", "20.06.24", "jhs" }, },
				new String[] { "\uBC88\uD638", "\uC81C\uBAA9", "\uB0B4\uC6A9", "\uB0A0\uC790", "\uC544\uC774\uB514" }));

//      JScrollPane scrollPane_board = new JScrollPane(table_board); // ScrollPane에 table 삽입 잊지말기!
//      scrollPane_list.setBounds(12, 42, 697, 380);

	      scrollPane_board = new JScrollPane(table_board);
	      scrollPane_board.setBounds(0, 3, 607, 363);
	      panel_7.add(scrollPane_board);
	      txt_uni = new JTextField();
//	      lbl_info = new JLabel("name\uB2D8 \uD658\uC601\uD569w JFrame("Table Test");
//	      frame_01.setPreferredSize(new Dimension(500, 400));
//	      frame_01.setLocation(500, 400);
		scrollPane_board = new JScrollPane(table_board);
		scrollPane_board.setBounds(0, 3, 607, 363);
		panel_7.add(scrollPane_board);
		txt_uni = new JTextField();
<<<<<<< HEAD
//		lbl_info = new JLabel("name\uB2D8 \uD658\uC601\uD569w JFrame("Table Test");
//		frame_01.setPreferredSize(new Dimension(500, 400));
//		frame_01.setLocation(500, 400);
=======
		lbl_info = new JLabel("");
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
		lbl_info.setBounds(510, 37, 183, 39);
		panel.add(lbl_info);
=======
//		JFrame frame_01 = new JFrame("Table Test");
//		frame_01.setPreferredSize(new Dimension(500, 400));
//		frame_01.setLocation(500, 400);

>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
		comboBox = new JComboBox();
		comboBox.setBounds(66, 37, 189, 39);
		panel.add(comboBox);
=======
	      lbl_info.setBounds(510, 37, 183, 39);
	      panel.add(lbl_info);
	      comboBox = new JComboBox();
	      comboBox.setBounds(66, 37, 189, 39);
	      panel.add(comboBox);
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

		String text = (String) comboBox.getSelectedItem();
		// 콤보박스 선택한 글자 가져오는 코드
		if (pal.uni_name.equals("k")) {

			text = (String) comboBox.getSelectedItem();
			txt_uni = new JTextField(text + "학교 축제 정보입니다.");
			txt_uni.setBounds(220, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			URL url_post = this.getClass().getResource("../univ_image/ko.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_post.setBounds(380, 50, 300, 400);
			URL url_line = this.getClass().getResource("../univ_image/ko_line.png");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_line.setBounds(50, 50, 300, 400);
		} else if (text.equals("한양대")) {

			text = (String) comboBox.getSelectedItem();
			txt_uni = new JTextField(text + "학교 축제 정보입니다.");
			txt_uni.setBounds(220, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			URL url_post = this.getClass().getResource("../univ_image/han.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_post.setBounds(380, 50, 300, 400);
			URL url_line = this.getClass().getResource("../univ_image/han_line.png");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_line.setBounds(50, 50, 300, 400);
		} else if (text.equals("서강대")) {

			text = (String) comboBox.getSelectedItem();
			txt_uni = new JTextField(text + "학교 축제 정보입니다.");
			txt_uni.setBounds(220, 10, 300, 30);
			panel_3.add(txt_uni);
			txt_uni.setColumns(10);

			URL url_post = this.getClass().getResource("../univ_image/seo.jpg");
			String path_post = url_post.getPath();
			Image image_post = new ImageIcon(path_post).getImage();
			lbl_post.setIcon(new ImageIcon(image_post.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_post.setBounds(380, 50, 300, 400);

			URL url_line = this.getClass().getResource("../univ_image/seo_line.png");
			String path_line = url_line.getPath();
			Image image_line = new ImageIcon(path_line).getImage();
			lbl_line.setIcon(new ImageIcon(image_line.getScaledInstance(300, 400, Image.SCALE_SMOOTH)));
			lbl_line.setBounds(50, 50, 300, 400);

		}

<<<<<<< HEAD
		lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
		lbl_image.setFont(new Font("굴림", Font.PLAIN, 16));
		lbl_image.setBounds(-2, -210, 760, 666);
		panel.add(lbl_image);
		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
=======
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
//      comboBox.setModel(new DefaultComboBoxModel(
//            new String[] { "\uACE0\uB824\uB300", "\uC11C\uAC15\uB300", "\uD55C\uC591\uB300" }));
		// JScrollPane scrollPane = new JScrollPane();
		// panel_7.add(scrollPane);

	      lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(750, 660, Image.SCALE_SMOOTH)));
//	      lbl_image.setFont(new Font("굴림", Font.PLAIN, 16));
	      lbl_image.setBounds(-2, -210, 760, 666);
	      panel.add(lbl_image);
	      JLabel lblHome = new JLabel("");
	      lblHome.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseClicked(MouseEvent arg0) {

	            frame.dispose();
	            Main01.main(null);
 
	         }
	      });
	      lblHome.setBounds(61, 578, 57, 54);
	      panel.add(lblHome);

	      comboBox.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent arg0) {
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
				frame.dispose();
				Main01.main(null);
=======
	            frame.dispose();
	            PerResearchPage PerResearchPage = new PerResearchPage();
	            PerResearchPage.setList(list);
	            PerResearchPage.frame.setVisible(true);
	         }
	      });
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git

<<<<<<< HEAD
			}
		});
		lblHome.setBounds(61, 578, 57, 54);
		panel.add(lblHome);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				frame.dispose();
				PerResearchPage PerResearchPage = new PerResearchPage();
				PerResearchPage.setList(list);
				PerResearchPage.frame.setVisible(true);
			}
		});
=======
	   }
>>>>>>> branch 'master' of https://github.com/2020-SMHRD-BIGDATA2/Project01.git


	private void add(JScrollPane scrollPane_1) {
		// TODO Auto-generated method stub

	}
}