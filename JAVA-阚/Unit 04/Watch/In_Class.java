import lib1.lib2.Clock_plus;

public class In_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock_plus cp=new Clock_plus();
		Clock_plus.Clock_in ci=cp.new Clock_in();
		ci.call();
		//���ʹ��������
		
		cp.Clock_pa();
		//���оֲ���
		
		cp.Clock_nu();
		//����������
		
		cp.Clock_nu_etc();
		//�����������д
	}

}
