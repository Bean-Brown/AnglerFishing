package fish;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FishGUI {

	private JFrame frame;
	private JTextField BluescalePike;
	private JTextField SpottedTrout;
	private JTextField Brightscale;
	private JTextField T3;
	private JTextField T5;
	private JTextField T7;
	private JTextField BluescaleCod;
	private JTextField SpottedWolf;
	private JTextField Strongfin;
	private JTextField tfChopFish;
	private JTextField tfSauce;
	private JTextField Seaweed;
	private int ChopFish;
	private double Basic;
	private double Fancy;
	private double Special;
	private JTextField tfFancy;
	private JTextField tfSpecial;
	private JTextField BscPro;
	private JTextField FncPro;
	private JTextField SpcPro;
	private JTextField BscPrc;
	private JTextField FncPrc;
	private JTextField SpcPrc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FishGUI window = new FishGUI();
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
	public FishGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 991, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel BSPike = new JLabel("Bluescale Pike");
		BSPike.setBounds(10, 53, 102, 14);
		frame.getContentPane().add(BSPike);
		
		JLabel SpTr = new JLabel("Spotted Trout");
		SpTr.setBounds(10, 85, 89, 14);
		frame.getContentPane().add(SpTr);
		
		JLabel BrZan = new JLabel("Brightscale Zander");
		BrZan.setBounds(10, 116, 104, 14);
		frame.getContentPane().add(BrZan);
		
		JLabel T3Fish = new JLabel("T3 Ingred. Fish");
		T3Fish.setBounds(10, 150, 89, 14);
		frame.getContentPane().add(T3Fish);
		
		JLabel T5Fish = new JLabel("T5 Ingred. Fish");
		T5Fish.setBounds(13, 175, 99, 14);
		frame.getContentPane().add(T5Fish);
		
		JLabel T7Fish = new JLabel("T7 Ingred. Fish");
		T7Fish.setBounds(10, 200, 89, 14);
		frame.getContentPane().add(T7Fish);
		
		JLabel BlscCod = new JLabel("Bluescale Cod");
		BlscCod.setBounds(10, 234, 99, 14);
		frame.getContentPane().add(BlscCod);
		
		JLabel SpWol = new JLabel("Spotted Wolffish");
		SpWol.setBounds(10, 269, 114, 14);
		frame.getContentPane().add(SpWol);
		
		JLabel StrSal = new JLabel("Strongfin Salmon");
		StrSal.setBounds(10, 300, 102, 14);
		frame.getContentPane().add(StrSal);
		
		BluescalePike = new JTextField();
		BluescalePike.setBounds(122, 50, 86, 20);
		frame.getContentPane().add(BluescalePike);
		BluescalePike.setColumns(10);
		
		SpottedTrout = new JTextField();
		SpottedTrout.setBounds(122, 82, 86, 20);
		frame.getContentPane().add(SpottedTrout);
		SpottedTrout.setColumns(10);
		
		Brightscale = new JTextField();
		Brightscale.setBounds(122, 113, 86, 20);
		frame.getContentPane().add(Brightscale);
		Brightscale.setColumns(10);
		
		T3 = new JTextField();
		T3.setBounds(122, 144, 86, 20);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		T5 = new JTextField();
		T5.setBounds(122, 169, 86, 20);
		frame.getContentPane().add(T5);
		T5.setColumns(10);
		
		T7 = new JTextField();
		T7.setBounds(122, 200, 86, 20);
		frame.getContentPane().add(T7);
		T7.setColumns(10);
		
		BluescaleCod = new JTextField();
		BluescaleCod.setBounds(122, 231, 86, 20);
		frame.getContentPane().add(BluescaleCod);
		BluescaleCod.setColumns(10);
		
		SpottedWolf = new JTextField();
		SpottedWolf.setBounds(122, 266, 86, 20);
		frame.getContentPane().add(SpottedWolf);
		SpottedWolf.setColumns(10);
		
		Strongfin = new JTextField();
		Strongfin.setBounds(122, 297, 86, 20);
		frame.getContentPane().add(Strongfin);
		Strongfin.setColumns(10);
		
		JButton btnChop = new JButton("Chop Fish");
		btnChop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int BluPike, BluPikeCH, Sptr, SptrCH, BrSc, BrScCH, t3, t3CH, t5, t5CH, t7, t7CH, BluCod, BluCodCH, Sptw, SptwCH, strfin, strfinCH; 
				String str;
				
				//calculate the amount of Chopped fish from amount specified.
			
				str = BluescalePike.getText();
				BluPike = Integer.parseInt(str);
				BluPikeCH = BluPike*4;
			
				
				str = SpottedTrout.getText();
				Sptr = Integer.parseInt(str);
				SptrCH = Sptr * 6;
				
				str = Brightscale.getText();
				BrSc = Integer.parseInt(str);
				BrScCH = BrSc * 8;
				
				str = T3.getText();
				t3 = Integer.parseInt(str);
				t3CH = t3 * 10;
				
				str = T5.getText();
				t5 = Integer.parseInt(str);
				t5CH = t5 * 20;
				
				str = T7.getText();
				t7 = Integer.parseInt(str);
				t7CH = t7 * 30;
				
				str = BluescaleCod.getText();
				BluCod = Integer.parseInt(str);
				BluCodCH = BluCod * 4;
				
				str = SpottedWolf.getText();
				Sptw = Integer.parseInt(str);
				SptwCH = Sptw * 6;
				
				str = Strongfin.getText();
				strfin = Integer.parseInt(str);
				strfinCH = strfin * 8;
				
				ChopFish = (BluPikeCH + SptrCH + BrScCH + t3CH + t5CH + t7CH + BluCodCH + SptwCH + strfinCH);
				
				tfChopFish.setText("Chopped Fish: " + String.valueOf(ChopFish));
				
				
			}
		});
		btnChop.setBounds(243, 18, 95, 23);
		frame.getContentPane().add(btnChop);
		
		JButton btnBas = new JButton("Basic Sauce");
		btnBas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int seaweed, seaweedSauce; 
				String str;
				
				str = Seaweed.getText();
				seaweed = Integer.parseInt(str);
				
				
				Basic = ChopFish/15;
				seaweedSauce = seaweed/1;
				
				
				if (seaweed < 1) {
					tfSauce.setText("Not enough seaweed to craft");
				} 
				else if (ChopFish < 15) {
					tfSauce.setText("Not enough Chopped Fish to craft");
				}
				else if (Basic < seaweedSauce) {
					tfSauce.setText(String.valueOf(Basic));
				}
				else {
					tfSauce.setText(String.valueOf(seaweedSauce));
				}
				
				
				
			}
		});
		btnBas.setBounds(348, 18, 119, 23);
		frame.getContentPane().add(btnBas);
		
		JButton btnFan = new JButton("Fancy Sauce");
		btnFan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int seaweed, seaweedSauce; 
				
				String str;
				
				str = Seaweed.getText();
				seaweed = Integer.parseInt(str);
				
				
				Fancy = ChopFish/45;
				seaweedSauce = seaweed/3; 
				
				
				
				if (seaweed < 3) {
					tfFancy.setText("Not enough seaweed to craft");
				} 
				else if (ChopFish < 45) {
					tfFancy.setText("Not enough Chopped Fish to craft");
				}
				else if(Fancy < seaweedSauce) {
					tfFancy.setText(String.valueOf(Fancy));
				} else {
					tfFancy.setText(String.valueOf(seaweedSauce));
				}
				
				
			}
		});
		btnFan.setBounds(473, 18, 132, 23);
		frame.getContentPane().add(btnFan);
		
		JButton btnSpc = new JButton("Special Sauce");
		btnSpc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int seaweed, seaweedSauce; 
				String str;
				
				str = Seaweed.getText();
				seaweed = Integer.parseInt(str);
				
				
				Special = ChopFish/135;
				seaweedSauce = seaweed/9; 
				
				
				
				if (seaweed < 9) {
					tfSpecial.setText("Not enough seaweed to craft");
				} else if (ChopFish < 135) {
					tfSpecial.setText("Not enough Chopped Fish to craft");
				} else if (Special < seaweedSauce) {
					tfSpecial.setText(String.valueOf(Special));
				} else {
					tfSpecial.setText(String.valueOf(seaweedSauce));
				}
			}
		});
		btnSpc.setBounds(243, 68, 119, 23);
		frame.getContentPane().add(btnSpc);
		
		tfChopFish = new JTextField();
		tfChopFish.setBounds(243, 119, 314, 78);
		frame.getContentPane().add(tfChopFish);
		tfChopFish.setColumns(10);
		
		tfSauce = new JTextField();
		tfSauce.setBounds(243, 216, 314, 45);
		frame.getContentPane().add(tfSauce);
		tfSauce.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter the amount of Fish you have.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 223, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSea = new JLabel("Seaweed");
		lblSea.setBounds(28, 335, 56, 14);
		frame.getContentPane().add(lblSea);
		
		Seaweed = new JTextField();
		Seaweed.setBounds(122, 332, 86, 20);
		frame.getContentPane().add(Seaweed);
		Seaweed.setColumns(10);
		
		tfFancy = new JTextField();
		tfFancy.setBounds(243, 280, 314, 50);
		frame.getContentPane().add(tfFancy);
		tfFancy.setColumns(10);
		
		tfSpecial = new JTextField();
		tfSpecial.setBounds(243, 354, 314, 50);
		frame.getContentPane().add(tfSpecial);
		tfSpecial.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Chopped Fish");
		lblNewLabel_1.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(243, 102, 119, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Basic Sauce");
		lblNewLabel_2.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(243, 200, 119, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fancy Sauce");
		lblNewLabel_3.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(243, 266, 119, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Special Sauce");
		lblNewLabel_4.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(243, 335, 119, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnPrice = new JButton("Price Button");
		btnPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Basic, BasicPrice, Fancy, FancyPrice, Special, SpecialPrice;
				String str;
				
				str = tfSauce.getText();
				Basic = Integer.parseInt(str);
				
				str = BscPrc.getText();
				BasicPrice = Integer.parseInt(str);
				BscPro.setText(Basic*BasicPrice + " Silver");
				
				str = tfFancy.getText();
				Fancy = Integer.parseInt(str);
				
				str = FncPrc.getText();
				FancyPrice = Integer.parseInt(str);
				FncPro.setText(Fancy*FancyPrice + " Silver");
				
				str = tfSpecial.getText();
				Special = Integer.parseInt(str);
				
				str = SpcPrc.getText();
				SpecialPrice = Integer.parseInt(str);
				SpcPro.setText(Special*SpecialPrice + "Silver");
				
				
				
			}
		});
		btnPrice.setBounds(372, 68, 114, 23);
		frame.getContentPane().add(btnPrice);
		
		BscPro = new JTextField();
		BscPro.setBounds(593, 119, 298, 78);
		frame.getContentPane().add(BscPro);
		BscPro.setColumns(10);
		
		FncPro = new JTextField();
		FncPro.setBounds(593, 234, 298, 67);
		frame.getContentPane().add(FncPro);
		FncPro.setColumns(10);
		
		SpcPro = new JTextField();
		SpcPro.setBounds(593, 332, 298, 72);
		frame.getContentPane().add(SpcPro);
		SpcPro.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Basic Sauce Price");
		lblNewLabel_5.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(600, 102, 152, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fancy Sauce Price");
		lblNewLabel_6.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(593, 216, 159, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Special Sauce Price");
		lblNewLabel_7.setFont(new Font("Slope Opera", Font.PLAIN, 13));
		lblNewLabel_7.setBounds(593, 312, 159, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Basic Sauce Price");
		lblNewLabel_8.setBounds(12, 372, 112, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Special Sauce Price");
		lblNewLabel_9.setBounds(10, 454, 114, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Fancy Sauce Price");
		lblNewLabel_10.setBounds(10, 411, 114, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		BscPrc = new JTextField();
		BscPrc.setBounds(122, 369, 86, 20);
		frame.getContentPane().add(BscPrc);
		BscPrc.setColumns(10);
		
		FncPrc = new JTextField();
		FncPrc.setBounds(122, 408, 86, 20);
		frame.getContentPane().add(FncPrc);
		FncPrc.setColumns(10);
		
		SpcPrc = new JTextField();
		SpcPrc.setBounds(122, 451, 86, 20);
		frame.getContentPane().add(SpcPrc);
		SpcPrc.setColumns(10);
	}
}
