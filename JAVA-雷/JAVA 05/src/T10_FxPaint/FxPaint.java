package T10_FxPaint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.*;

/**
 * 函数曲线绘制， 
 * 界面如下示意图（非实际界面）所示： 
 * 运用NetBeans自动生成了窗体
 * @author 黎夜之梦
 *
 */
public class FxPaint extends JFrame {
	private static final long serialVersionUID = 20190718164456L;
	private Button button2;
	private ButtonGroup buttonGroup2;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JPanel jPanel1;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private TextField textField1;
	private TextField textField2;
	
	static private int i=0;
	
	private void button2ActionPerformed(java.awt.event.ActionEvent evt) {
		double x1=Double.valueOf(textField2.getText());
		double x2=Double.valueOf(textField1.getText());
		int w=jPanel1.getWidth();
		int h=jPanel1.getHeight();
		Graphics g=jPanel1.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, w, h);
		g.setColor(Color.BLACK);
		
		int t=(int)(Math.abs(x1)/(x2-x1)*w);
		int width=(int)((double)w/(x2-x1));
		g.setColor(Color.LIGHT_GRAY);
		for(int i=(int)x1*6/5-1; i<(int)x2*6/5; i++)
			g.drawLine(t+i*width, 0, t+i*width, h);
		
		if(x1>=x2) {
			g.setFont(new Font("sansserif", 0, 25));
			g.drawString("范围有误，请重新输入！", 50, 50);
		}
		else if(i==1) {
			for(int i=0; h-i*width>-50; i++)
				g.drawLine(0, h-20-i*width, w, h-20-i*width);
			for(int i=0; i*width<30; i++)
				g.drawLine(0, h-20+i*width, w, h-20+i*width);
			g.setColor(Color.BLACK);
			g.drawLine(t, 0, t, h);
			g.drawLine(0, h-20, w, h-20);
			
			double d=(x2-x1)/w;
			double k1=x1,k2=x1+d;
			g.setColor(Color.RED);
			for(int i=0; i<w; i++) {
				g.drawLine(i, h-20-(int)((k1*k1+2*k1+1)*width), i+1, h-20-(int)((k2*k2+2*k2+1)*width));
				k1+=d; k2+=d;
			}
		}
		else if(i==2) {
			g.setColor(Color.LIGHT_GRAY);
			g.drawLine(0, 50, w, 50);
			g.drawLine(0, h-50, w, h-50);
			g.setColor(Color.BLACK);
			g.drawLine(t, 0, t, h);
			g.drawLine(0, h/2, w, h/2);
			
			double d=(x2-x1)/w;
			double k1=x1,k2=x1+d;
			g.setColor(Color.RED);
			for(int i=0; i<w; i++) {
				g.drawLine(i, h/2+(int)((Math.cos(k1)*(h/2-50))),
						i+1, h/2+(int)((Math.cos(k2)*(h/2-50))));
				k1+=d; k2+=d;
			}
		}
    } 

	private void jRadioButton1ActionPerformed(ActionEvent evt) {
		i=1;}

	private void jRadioButton2ActionPerformed(ActionEvent evt) {
		i=2;}
	
	public FxPaint() {
		initComponents();}

	private void initComponents() {

		buttonGroup2 = new ButtonGroup();
		jLabel1 = new JLabel();
		jRadioButton1 = new JRadioButton();
		jRadioButton2 = new JRadioButton();
		jLabel2 = new JLabel();
		textField1 = new TextField();
		jLabel3 = new JLabel();
		textField2 = new TextField();
		jPanel1 = new JPanel();
        button2 = new Button();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("函数绘制");

		jLabel1.setFont(new Font("sansserif", 0, 20));
		jLabel1.setText("选择函数");

		buttonGroup2.add(jRadioButton1);
		jRadioButton1.setFont(new Font("sansserif", 0, 16));
		jRadioButton1.setText("二次函数 x^2+2x+1");
		jRadioButton1.addActionListener(evt -> jRadioButton1ActionPerformed(evt));

		buttonGroup2.add(jRadioButton2);
		jRadioButton2.setFont(new Font("sansserif", 0, 16));
		jRadioButton2.setText("三角函数 cos(x)");
		jRadioButton2.addActionListener(evt -> jRadioButton2ActionPerformed(evt));

		jLabel2.setFont(new Font("sansserif", 0, 18));
		jLabel2.setText("X取值范围");

		textField1.setFont(new Font("Dialog", 0, 18));
		textField1.setText("5");

		jLabel3.setFont(new Font("sansserif", 0, 24));
		jLabel3.setText("~");

		textField2.setFont(new Font("Dialog", 0, 18));
		textField2.setText("-5");

		jPanel1.setBackground(new Color(255, 255, 255));

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGap(0, 472, Short.MAX_VALUE)
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	            .addGap(0, 228, Short.MAX_VALUE)
	        );

	        button2.setFont(new Font("Dialog", 0, 14));
	        button2.setLabel("绘制");
	        button2.setName("");
	        button2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                button2ActionPerformed(evt);
	            }
	        });

	        GroupLayout layout = new GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	        		layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	    	        .addGap(51, 51, 51)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	        .addGroup(layout.createSequentialGroup()
	    	        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	        .addComponent(jLabel1)
	        		.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
	        		.addGap(45, 45, 45)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	    	        .addGroup(layout.createSequentialGroup()
	    	        .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
	        		.addGap(18, 18, 18)
	        		.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
	        		.addGroup(layout.createSequentialGroup()
	    	        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
	        		.addGap(29, 29, 29)
	        		.addComponent(jLabel3)
	        		.addGap(18, 18, 18)
	        		.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))))
	    	        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
	    	        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
	    	        .addComponent(jPanel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
	        		.addContainerGap(37, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        		layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        		.addGap(26, 26, 26)
	        		.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
	        		.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	        		.addGap(20, 20, 20)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	        		.addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
	        		.addComponent(jLabel1))))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
	                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addComponent(jLabel3)
	                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
	                .addGap(30, 30, 30))
	        );

	        pack();
	        
		setSize(this.getWidth(), 800);
		setLocation(600, 100);
	}
	
	
	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(FxPaint.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(FxPaint.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(FxPaint.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(FxPaint.class.getName()).log(Level.SEVERE, null, ex);
		}
		EventQueue.invokeLater(() -> new FxPaint().setVisible(true));
	}
	
}