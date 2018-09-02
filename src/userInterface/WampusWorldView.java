package userInterface;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;

public class WampusWorldView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WampusWorldView window = new WampusWorldView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WampusWorldView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setOpaque(true);
		//lblNewLabel.setBackground(Color.black);
		
		lblNewLabel.setBounds(10, 11, 50, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel();
		label.setBounds(70, 11, 50, 50);
		lblNewLabel.setOpaque(true);
		
		
		
		ImageIcon iconLogo = new ImageIcon("images/green_monster.png");
		// In init() method write this code
		Image img = iconLogo.getImage();
		Image newimg = img.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
		iconLogo = new ImageIcon(newimg);
		
		lblNewLabel.setIcon(iconLogo);
		
		
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(130, 11, 50, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(190, 11, 50, 50);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setBounds(250, 11, 50, 50);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(310, 11, 50, 50);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(370, 11, 50, 50);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(430, 11, 50, 50);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(490, 11, 50, 50);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(550, 11, 50, 50);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(550, 72, 50, 50);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(490, 72, 50, 50);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setBounds(430, 72, 50, 50);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(370, 72, 50, 50);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(310, 72, 50, 50);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setBounds(250, 72, 50, 50);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setBounds(190, 72, 50, 50);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setBounds(130, 72, 50, 50);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setBounds(70, 72, 50, 50);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setBounds(10, 72, 50, 50);
		frame.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setBounds(550, 133, 50, 50);
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setBounds(490, 133, 50, 50);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setBounds(430, 133, 50, 50);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setBounds(370, 133, 50, 50);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setBounds(310, 133, 50, 50);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setBounds(250, 133, 50, 50);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("New label");
		label_25.setBounds(190, 133, 50, 50);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("New label");
		label_26.setBounds(130, 133, 50, 50);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("New label");
		label_27.setBounds(70, 133, 50, 50);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("New label");
		label_28.setBounds(10, 133, 50, 50);
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("New label");
		label_29.setBounds(550, 194, 50, 50);
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setBounds(490, 194, 50, 50);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("New label");
		label_31.setBounds(430, 194, 50, 50);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("New label");
		label_32.setBounds(370, 194, 50, 50);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("New label");
		label_33.setBounds(310, 194, 50, 50);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("New label");
		label_34.setBounds(250, 194, 50, 50);
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("New label");
		label_35.setBounds(190, 194, 50, 50);
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("New label");
		label_36.setBounds(130, 194, 50, 50);
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("New label");
		label_37.setBounds(70, 194, 50, 50);
		frame.getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel("New label");
		label_38.setBounds(10, 194, 50, 50);
		frame.getContentPane().add(label_38);
		
		JLabel label_39 = new JLabel("New label");
		label_39.setBounds(550, 255, 50, 50);
		frame.getContentPane().add(label_39);
		
		JLabel label_40 = new JLabel("New label");
		label_40.setBounds(490, 255, 50, 50);
		frame.getContentPane().add(label_40);
		
		JLabel label_41 = new JLabel("New label");
		label_41.setBounds(430, 255, 50, 50);
		frame.getContentPane().add(label_41);
		
		JLabel label_42 = new JLabel("New label");
		label_42.setBounds(370, 255, 50, 50);
		frame.getContentPane().add(label_42);
		
		JLabel label_43 = new JLabel("New label");
		label_43.setBounds(310, 255, 50, 50);
		frame.getContentPane().add(label_43);
		
		JLabel label_44 = new JLabel("New label");
		label_44.setBounds(250, 255, 50, 50);
		frame.getContentPane().add(label_44);
		
		JLabel label_45 = new JLabel("New label");
		label_45.setBounds(190, 255, 50, 50);
		frame.getContentPane().add(label_45);
		
		JLabel label_46 = new JLabel("New label");
		label_46.setBounds(130, 255, 50, 50);
		frame.getContentPane().add(label_46);
		
		JLabel label_47 = new JLabel("New label");
		label_47.setBounds(70, 255, 50, 50);
		frame.getContentPane().add(label_47);
		
		JLabel label_48 = new JLabel("New label");
		label_48.setBounds(10, 255, 50, 50);
		frame.getContentPane().add(label_48);
		
		JLabel label_49 = new JLabel("New label");
		label_49.setBounds(550, 316, 50, 50);
		frame.getContentPane().add(label_49);
		
		JLabel label_50 = new JLabel("New label");
		label_50.setBounds(490, 316, 50, 50);
		frame.getContentPane().add(label_50);
		
		JLabel label_51 = new JLabel("New label");
		label_51.setBounds(430, 316, 50, 50);
		frame.getContentPane().add(label_51);
		
		JLabel label_52 = new JLabel("New label");
		label_52.setBounds(370, 316, 50, 50);
		frame.getContentPane().add(label_52);
		
		JLabel label_53 = new JLabel("New label");
		label_53.setBounds(310, 316, 50, 50);
		frame.getContentPane().add(label_53);
		
		JLabel label_54 = new JLabel("New label");
		label_54.setBounds(250, 316, 50, 50);
		frame.getContentPane().add(label_54);
		
		JLabel label_55 = new JLabel("New label");
		label_55.setBounds(190, 316, 50, 50);
		frame.getContentPane().add(label_55);
		
		JLabel label_56 = new JLabel("New label");
		label_56.setBounds(130, 316, 50, 50);
		frame.getContentPane().add(label_56);
		
		JLabel label_57 = new JLabel("New label");
		label_57.setBounds(70, 316, 50, 50);
		frame.getContentPane().add(label_57);
		
		JLabel label_58 = new JLabel("New label");
		label_58.setBounds(10, 316, 50, 50);
		frame.getContentPane().add(label_58);
		
		JLabel label_59 = new JLabel("New label");
		label_59.setBounds(10, 377, 50, 50);
		frame.getContentPane().add(label_59);
		
		JLabel label_60 = new JLabel("New label");
		label_60.setBounds(70, 377, 50, 50);
		frame.getContentPane().add(label_60);
		
		JLabel label_61 = new JLabel("New label");
		label_61.setBounds(130, 377, 50, 50);
		frame.getContentPane().add(label_61);
		
		JLabel label_62 = new JLabel("New label");
		label_62.setBounds(190, 377, 50, 50);
		frame.getContentPane().add(label_62);
		
		JLabel label_63 = new JLabel("New label");
		label_63.setBounds(250, 377, 50, 50);
		frame.getContentPane().add(label_63);
		
		JLabel label_64 = new JLabel("New label");
		label_64.setBounds(310, 377, 50, 50);
		frame.getContentPane().add(label_64);
		
		JLabel label_65 = new JLabel("New label");
		label_65.setBounds(370, 377, 50, 50);
		frame.getContentPane().add(label_65);
		
		JLabel label_66 = new JLabel("New label");
		label_66.setBounds(430, 377, 50, 50);
		frame.getContentPane().add(label_66);
		
		JLabel label_67 = new JLabel("New label");
		label_67.setBounds(490, 377, 50, 50);
		frame.getContentPane().add(label_67);
		
		JLabel label_68 = new JLabel("New label");
		label_68.setBounds(550, 377, 50, 50);
		frame.getContentPane().add(label_68);
		
		JLabel label_69 = new JLabel("New label");
		label_69.setBounds(10, 438, 50, 50);
		frame.getContentPane().add(label_69);
		
		JLabel label_70 = new JLabel("New label");
		label_70.setBounds(70, 438, 50, 50);
		frame.getContentPane().add(label_70);
		
		JLabel label_71 = new JLabel("New label");
		label_71.setBounds(130, 438, 50, 50);
		frame.getContentPane().add(label_71);
		
		JLabel label_72 = new JLabel("New label");
		label_72.setBounds(190, 438, 50, 50);
		frame.getContentPane().add(label_72);
		
		JLabel label_73 = new JLabel("New label");
		label_73.setBounds(250, 438, 50, 50);
		frame.getContentPane().add(label_73);
		
		JLabel label_74 = new JLabel("New label");
		label_74.setBounds(310, 438, 50, 50);
		frame.getContentPane().add(label_74);
		
		JLabel label_75 = new JLabel("New label");
		label_75.setBounds(370, 438, 50, 50);
		frame.getContentPane().add(label_75);
		
		JLabel label_76 = new JLabel("New label");
		label_76.setBounds(430, 438, 50, 50);
		frame.getContentPane().add(label_76);
		
		JLabel label_77 = new JLabel("New label");
		label_77.setBounds(490, 438, 50, 50);
		frame.getContentPane().add(label_77);
		
		JLabel label_78 = new JLabel("New label");
		label_78.setBounds(550, 438, 50, 50);
		frame.getContentPane().add(label_78);
		
		JLabel label_79 = new JLabel("New label");
		label_79.setBounds(10, 499, 50, 50);
		frame.getContentPane().add(label_79);
		
		JLabel label_80 = new JLabel("New label");
		label_80.setBounds(70, 499, 50, 50);
		frame.getContentPane().add(label_80);
		
		JLabel label_81 = new JLabel("New label");
		label_81.setBounds(130, 499, 50, 50);
		frame.getContentPane().add(label_81);
		
		JLabel label_82 = new JLabel("New label");
		label_82.setBounds(190, 499, 50, 50);
		frame.getContentPane().add(label_82);
		
		JLabel label_83 = new JLabel("New label");
		label_83.setBounds(250, 499, 50, 50);
		frame.getContentPane().add(label_83);
		
		JLabel label_84 = new JLabel("New label");
		label_84.setBounds(310, 499, 50, 50);
		frame.getContentPane().add(label_84);
		
		JLabel label_85 = new JLabel("New label");
		label_85.setBounds(370, 499, 50, 50);
		frame.getContentPane().add(label_85);
		
		JLabel label_86 = new JLabel("New label");
		label_86.setBounds(430, 499, 50, 50);
		frame.getContentPane().add(label_86);
		
		JLabel label_87 = new JLabel("New label");
		label_87.setBounds(490, 499, 50, 50);
		frame.getContentPane().add(label_87);
		
		JLabel label_88 = new JLabel("New label");
		label_88.setBounds(550, 499, 50, 50);
		frame.getContentPane().add(label_88);
		
		JLabel label_89 = new JLabel("New label");
		label_89.setBounds(10, 560, 50, 50);
		frame.getContentPane().add(label_89);
		
		JLabel label_90 = new JLabel("New label");
		label_90.setBounds(70, 560, 50, 50);
		frame.getContentPane().add(label_90);
		
		JLabel label_91 = new JLabel("New label");
		label_91.setBounds(130, 560, 50, 50);
		frame.getContentPane().add(label_91);
		
		JLabel label_92 = new JLabel("New label");
		label_92.setBounds(190, 560, 50, 50);
		frame.getContentPane().add(label_92);
		
		JLabel label_93 = new JLabel("New label");
		label_93.setBounds(250, 560, 50, 50);
		frame.getContentPane().add(label_93);
		
		JLabel label_94 = new JLabel("New label");
		label_94.setBounds(310, 560, 50, 50);
		frame.getContentPane().add(label_94);
		
		JLabel label_95 = new JLabel("New label");
		label_95.setBounds(370, 560, 50, 50);
		frame.getContentPane().add(label_95);
		
		JLabel label_96 = new JLabel("New label");
		label_96.setBounds(430, 560, 50, 50);
		frame.getContentPane().add(label_96);
		
		JLabel label_97 = new JLabel("New label");
		label_97.setBounds(490, 560, 50, 50);
		frame.getContentPane().add(label_97);
		
		JLabel label_98 = new JLabel("New label");
		label_98.setBounds(550, 560, 50, 50);
		frame.getContentPane().add(label_98);
	}

}
