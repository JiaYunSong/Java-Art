import lik1.func_class;
import lik1.lik2._func_inter;

public class Functional {   //��������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func_class fu1=new func_class();
		//new���ǹ�������󣬱��ʾ���һ������
		fu1.a();
		//��������󷽷�
		
		_func_inter fu=new _func_inter() {
			public void a() {
				// TODO Auto-generated method stub
				System.out.println("�����ຯ�����ǣ�");
			}
		};     //������򻯴���
		fu.a();
	}

}