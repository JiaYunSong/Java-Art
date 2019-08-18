package T12_Stock;

import java.awt.*;
import javax.swing.*;

public class StockShow {
	/*
	 * �и߱�����60��1CM
	 * �߾ࣺ50
	 * �иߣ�0.4CM
	 * */
	public static void f(String number,int Year,String category,String nameSpecification,
			String unitOfMeasurement,int totalPageNumber,int accountPages,Content content[]) {
		JFrame w=new JFrame();
		w.setTitle("�����Ʒ��̬");
		w.setSize(1180,880);
		w.setLocation(350, 50);
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Graphics g=w.getGraphics();
		g.drawString("��ʼ��", -1, -1);
		
		{				//���
			g.drawRect(50, 50, 1080, 780);
			for(int i=1; i<=28; i++)
				if(i!=24 && i!=26)
					g.drawLine(50, 830-26*i, 1130, 830-26*i);
			g.drawLine(350, 830-26*26, 50, 830-26*26);
			g.drawLine(350, 830-26*24, 1130, 830-26*24);
			g.drawLine(350, 830, 350, 830-26*28);
			g.drawLine(350+280, 830, 350+280, 830-26*25);
			g.drawLine(350+560, 830, 350+560, 830-26*25);
			g.drawLine(350+560, 830-26*27, 350+560, 830-26*28);
			g.drawLine(50+36, 830, 50+36, 830-26*24);
			g.drawLine(50+36*2, 830, 50+36*2, 830-26*25);
			g.drawLine(50+36*3, 830, 50+36*3, 830-26*24);
			g.drawLine(50+36*3, 830-26*27, 50+36*3, 830-26*26);
			g.drawLine(50+36*4, 830, 50+36*4, 830-26*25);
			g.drawLine(50+36*4, 830-26*27, 50+36*4, 830-26*28);
			g.drawLine(50, 830-26*24, 50+36*4, 830-26*24);
			g.drawLine(350+90, 830, 350+90, 830-26*24);
			g.drawLine(350+180, 830, 350+180, 830-26*24);
			g.drawLine(350+90+280, 830, 350+90+280, 830-26*24);
			g.drawLine(350+180+280, 830, 350+180+280, 830-26*24);
			g.drawLine(350+180+280, 830-26*27, 350+180+280, 830-26*28);
			g.drawLine(350+70+560, 830, 350+70+560, 830-26*24);
			g.drawLine(350+140+560, 830, 350+140+560, 830-26*24);
			g.drawLine(350+70+560, 830-26*27, 350+70+560, 830-26*28);
			g.drawLine(350+140+560, 830-26*27, 350+140+560, 830-26*28);
		}
		
		{
			g.setFont(new Font("����", Font.BOLD,30));
			g.drawString("�����Ʒ��ϸ��", 50+15*30, 90);
			
			g.setFont(new Font("����", Font.PLAIN, 17));
			g.drawString("��ţ�  "+number, 55+36*7-10, 122);
			
			g.drawString(Year+"��", 55, 122+26*3);
			g.drawString("����ƾ֤", 55+36*2-3, 122+26*3);
			
			g.drawString("����", 355+120, 122+26*3);
			g.drawString("����", 355+120+280, 122+26*3);
			g.drawString("���", 355+110+540, 122+26*3);
			
			g.drawString("���"+category, 55, 122);
			g.drawString("Ʒ�����    "+nameSpecification, 55, 122+26*1);
			g.drawString("������λ��"+unitOfMeasurement, 55, 122+26*2);
			g.drawString("��ҳ��             "+totalPageNumber, 355+180+280+20, 122);
			g.drawString("�˻�ҳ��          "+accountPages, 355+560-4, 122);
			
			g.drawString("��", 55+5, 122+26*4);
			g.drawString("��", 55+5+36*1, 122+26*4);
			g.drawString("��", 55+5+36*2, 122+26*4);
			g.drawString("��", 55+5+36*3, 122+26*4);
			g.setFont(new Font("����", Font.PLAIN, 23));
			g.drawString("ժҪ", 55+38*5, 122+31*3);
			g.setFont(new Font("����", Font.PLAIN, 17));
			g.drawString("����", 355+25, 122+26*4);
			g.drawString("����", 355+90+20, 122+26*4);
			g.drawString("���", 355+180+25, 122+26*4);
			g.drawString("����", 355+25+280, 122+26*4);
			g.drawString("����", 355+90+20+280, 122+26*4);
			g.drawString("���", 355+180+25+280, 122+26*4);
			g.drawString("����", 355+15+280*2, 122+26*4);
			g.drawString("����", 355+70+13+280*2, 122+26*4);
			g.drawString("���", 355+140+15+280*2, 122+26*4);
			if(content==null) return;
			for(int i=0; i<content.length; i++) {
				g.drawString(content[i].time.month+"", 55+5, 122+26*(5+i));
				g.drawString(content[i].time.day+"", 55+5+36*1, 122+26*(5+i));
				g.drawString(content[i].accountingVouchers.word+"", 55+5+36*2, 122+26*(5+i));
				g.drawString(content[i].accountingVouchers.number+"", 55+5+36*3, 122+26*(5+i));
				g.drawString(content[i].summary+"", 55+5+36*4, 122+26*(5+i));
				if(content[i].stockPurchase.number!=0) {
					g.drawString(content[i].stockPurchase.number+"", 355, 122+26*(5+i));
					g.drawString(content[i].stockPurchase.unitPrice+"", 355+90, 122+26*(5+i));
					g.drawString(content[i].stockPurchase.sumOfMoney()+"", 355+180, 122+26*(5+i));
				}
				if(content[i].sale.number!=0) {
					g.drawString(content[i].sale.number+"", 355+280, 122+26*(5+i));
					g.drawString(content[i].sale.unitPrice+"", 355+90+280, 122+26*(5+i));
					g.drawString(content[i].sale.sumOfMoney()+"", 355+180+280, 122+26*(5+i));
				}
				if(content[i].balance.number!=0) {
					g.drawString(content[i].balance.number+"", 355+280*2, 122+26*(5+i));
					g.drawString(content[i].balance.unitPrice+"", 355+70+280*2, 122+26*(5+i));
					g.drawString(content[i].balance.sumOfMoney()+"", 355+140+280*2, 122+26*(5+i));
				}
			}
		}
	}

}
