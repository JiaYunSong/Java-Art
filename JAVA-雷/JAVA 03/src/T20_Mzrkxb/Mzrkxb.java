package T20_Mzrkxb;

/**
 * �±��ǡ��ҹ��������˿��Ա𹹳�һ�����Ĳ������ݡ�
 * ��ϸ���������������һ������Java�ࣨһ���������������ࣩ
 * ���������ݱ������ñ�ʵ�廯������������Mzrkxb��
 * 
 * ��ҪҪ��
(1)�ṩ����������ʵ������
(2)�ṩ���ݲ��Ҳ���
    ���ֱ������塢�����˿ڡ�Ů���˿ڡ����Ա��ء�Ů�Ա���Ϊ�ؼ��֣���
(3)�ṩ���ݺϼƲ���
    ���ֱ������塢�����˿ڡ�Ů���˿ڡ����Ա��ء�Ů�Ա���Ϊ�������
(4)�ṩ��ӡ�ɾ��һ�����ݲ�����
(5)�ṩ������������ͽ��򣩲���
    ���ֱ������塢�����˿ڡ�Ů���˿ڡ����Ա��ء�Ů�Ա���Ϊ�ؼ��֣���
 * @author ��ҹ֮��
 *
 */

public class Mzrkxb {
	M m[];
	public Mzrkxb() {}
	/**
	 * ����������ʵ����
	 */
	public Mzrkxb(String Na[],long bb[],long gg[],double bb$[],double gg$[],double $[]) {
		m=new M[Na.length];
		for(int i=0; i<Na.length; i++)
			m[i]=new M(Na[i],bb[i],gg[i],bb$[i],gg$[i],$[i]);
	}
	/**
	 * ����������ʵ����,���վ�����������,�����
	 */
	public void setMzrkxb(String Na,long bb,long gg,double bb$,double gg$,double $) {
		if(m==null) {
			m=new M[1];
			m[0] = new M(Na,bb,gg,bb$,gg$,$);
			return ;
		}
		M[] m2 = new M[m.length + 1];
		System.arraycopy(m, 0, m2, 0, m.length);
		m2[m.length] = new M(Na,bb,gg,bb$,gg$,$);
		m=m2;
	}
	/**
	 * ɾ���ض���
	 */
	public void delMzrkxb(String Na) {
		M[] mx=null;
		for(int i=0; i<m.length; i++)
			if(!(m[i].NationName==Na)){
				if(mx==null) {
					mx=new M[1];
					mx[0] = m[i];
					continue ;
				}
				M[] m2 = new M[mx.length + 1];
				System.arraycopy(mx, 0, m2, 0, mx.length);
				m2[m.length] = m[i];
				mx=m2;
			}
		m=mx;
	}
	/**
	 * ���ݲ��Ҳ���-NationName
	 */
	public void seekNationName(String NationName) {
		System.out.println("\n\n���ݲ��Ҳ���-NationName:");
		for(int i=0; i<m.length; i++)
			if(m[i].NationName==NationName)
				m[i].show();
	}
	/**
	 * ���ݲ��Ҳ���-Boy
	 */
	public void seekBoy(long b) {
		System.out.println("\n\n���ݲ��Ҳ���-Boy:");
		for(int i=0; i<m.length; i++)
			if(m[i].b==b)
				m[i].show();
	}
	/**
	 * ���ݲ��Ҳ���-Girl
	 */
	public void seekGirl(long g) {
		System.out.println("\n\n���ݲ��Ҳ���-Girl:");
		for(int i=0; i<m.length; i++)
			if(m[i].g==g)
				m[i].show();
	}
	/**
	 * ���ݲ��Ҳ���-Boy$
	 */
	public void seekBoy$(double b$) {
		System.out.println("\n\n���ݲ��Ҳ���-Boy$:");
		for(int i=0; i<m.length; i++)
			if(m[i].b$==b$)
				m[i].show();
	}
	/**
	 * ���ݲ��Ҳ���-Girl$
	 */
	public void seekGirl$(double g$) {
		System.out.println("\n\n���ݲ��Ҳ���-Girl$:");
		for(int i=0; i<m.length; i++)
			if(m[i].g$==g$)
				m[i].show();
	}
	/**
	 * ���ݲ��Ҳ���-BG$
	 */
	public void seekBG$(double bg$) {
		System.out.println("\n\n���ݲ��Ҳ���-BG$:");
		for(int i=0; i<m.length; i++)
			if(m[i].bg$==bg$)
				m[i].show();
	}
	/**
	 * ����ͳ�Ʋ���-NationName
	 * @return 
	 */
	public String addNationName() {
		String n="";
		for(int i=0; i<m.length; i++)
			if(i==0) n+=m[i].NationName;
			else n+="\\\\"+m[i].NationName;
		return n;
	}
	/**
	 * ����ͳ�Ʋ���-Boy
	 */
	public long addBoy() {
		long b=0;
		for(int i=0; i<m.length; i++)
			b+=m[i].b;
		return b;
	}
	/**
	 * ����ͳ�Ʋ���-Girl
	 */
	public long addGirl() {
		long g=0;
		for(int i=0; i<m.length; i++)
			g+=m[i].g;
		return g;
	}
	/**
	 * ����ͳ�Ʋ���-All
	 */
	public void addAll() {
		long b=addBoy(),g=addGirl();
		double a=b+g;
		System.out.println("\n\n����ͳ�Ʋ���-All:");
		System.out.println("--------------------------------------");
		System.out.println("����:\t"+addNationName());
		System.out.println("�����˿�:\t"+b+"\tŮ���˿�:\t"+g);
		System.out.println("���Ա���:\t"+b/a*100+"%"+"\tŮ�Ա���:\t"+g/a*100+"%");
		System.out.println("��Ů�Ա��:\t"+(double)b/a*100+"%");
		System.out.println(g);
	}
	/**
	 * �����������-NationName
	 */
	public void sortNationName() {
		System.out.println("\n\n�����������-NationName:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].NationName.compareTo(mm[j].NationName)<0){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * �����������-Boy
	 */
	public void sortBoy() {
		System.out.println("\n\n�����������-Boy:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].b<mm[j].b){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * �����������-Girl
	 */
	public void sortGirl() {
		System.out.println("\n\n�����������-Girl:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].g<mm[j].g){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * �����������-Boy$
	 */
	public void sortBoy$() {
		System.out.println("\n\n�����������-Boy$:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].b$<mm[j].b$){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * �����������-Girl$
	 */
	public void sortGirl$() {
		System.out.println("\n\n�����������-Girl$:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].g$<mm[j].g$){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * �����������-BG$
	 */
	public void sortBG$() {
		System.out.println("\n\n�����������-BG$:");
		M[] mm=new M[m.length];
		M ss;
		for(int i=0; i<m.length-1; i++)
			mm[i]=new M(m[i].NationName,m[i].b,m[i].g,m[i].b$,m[i].g$,m[i].bg$);
		for(int i=0; i<mm.length-1; i++)
			for(int j=i; j<mm.length; j++)
				if(mm[i].bg$<mm[j].bg$){
					ss=mm[i];
					mm[i]=mm[j];
					mm[j]=ss;
				}
		for(int i=0; i<m.length; i++)
			mm[i].show();
	}
	/**
	 * ��ʾ����
	 */
	public void show() {
		System.out.println("\n\n���ҹ��������˿��Ա𹹳�һ����:");
		for(int i=0; i<m.length; i++)
			m[i].show();
	}
}
/**
 * ������Ϣ
 * @author ��ҹ֮��
 *
 */
class M {
	public String	NationName;		//����
	public long	b,g;				//�����˿ڡ�Ů���˿�
	public double	b$,g$,bg$;		//���Ա��ء�Ů�Ա��ء���Ů�Ա��
	/**
	 * ����������ʵ����
	 */
	public M(String Na,long bb,long gg,double bb$,double gg$,double $) {
		NationName=Na;
		b=bb;g=gg;
		b$=bb$;g$=gg$;
		bg$=$;
	}
	/**
	 * ��ʾ����
	 */
	public void show() {
		System.out.println("--------------------------------------");
		System.out.println("����:\t"+NationName);
		System.out.println("�����˿�:\t"+b+"\tŮ���˿�:\t"+g);
		System.out.println("���Ա���:\t"+b$*100+"%"+"\tŮ�Ա���:\t"+g$*100+"%");
		System.out.println("��Ů�Ա��:\t"+bg$*100+"%");
	}
}