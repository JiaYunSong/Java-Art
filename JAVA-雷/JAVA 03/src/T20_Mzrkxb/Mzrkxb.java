package T20_Mzrkxb;

/**
 * 下表是《我国各民族人口性别构成一览表》的部分数据。
 * 仔细分析下面表个，设计一个或多个Java类（一个主类和若干相关类）
 * 描述该数据表（即将该表实体化），主类名称Mzrkxb。
 * 
 * 主要要求：
(1)提供用已有数据实例化。
(2)提供数据查找操作
    （分别以民族、男性人口、女性人口、男性比重、女性比重为关键字）。
(3)提供数据合计操作
    （分别以民族、男性人口、女性人口、男性比重、女性比重为数据项）。
(4)提供添加、删除一行数据操作。
(5)提供数据排序（升序和降序）操作
    （分别以民族、男性人口、女性人口、男性比重、女性比重为关键字）。
 * @author 黎夜之梦
 *
 */

public class Mzrkxb {
	M m[];
	public Mzrkxb() {}
	/**
	 * 用已有数据实例化
	 */
	public Mzrkxb(String Na[],long bb[],long gg[],double bb$[],double gg$[],double $[]) {
		m=new M[Na.length];
		for(int i=0; i<Na.length; i++)
			m[i]=new M(Na[i],bb[i],gg[i],bb$[i],gg$[i],$[i]);
	}
	/**
	 * 用已有数据实例化,依照具体数据输入,添加行
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
	 * 删除特定行
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
	 * 数据查找操作-NationName
	 */
	public void seekNationName(String NationName) {
		System.out.println("\n\n数据查找操作-NationName:");
		for(int i=0; i<m.length; i++)
			if(m[i].NationName==NationName)
				m[i].show();
	}
	/**
	 * 数据查找操作-Boy
	 */
	public void seekBoy(long b) {
		System.out.println("\n\n数据查找操作-Boy:");
		for(int i=0; i<m.length; i++)
			if(m[i].b==b)
				m[i].show();
	}
	/**
	 * 数据查找操作-Girl
	 */
	public void seekGirl(long g) {
		System.out.println("\n\n数据查找操作-Girl:");
		for(int i=0; i<m.length; i++)
			if(m[i].g==g)
				m[i].show();
	}
	/**
	 * 数据查找操作-Boy$
	 */
	public void seekBoy$(double b$) {
		System.out.println("\n\n数据查找操作-Boy$:");
		for(int i=0; i<m.length; i++)
			if(m[i].b$==b$)
				m[i].show();
	}
	/**
	 * 数据查找操作-Girl$
	 */
	public void seekGirl$(double g$) {
		System.out.println("\n\n数据查找操作-Girl$:");
		for(int i=0; i<m.length; i++)
			if(m[i].g$==g$)
				m[i].show();
	}
	/**
	 * 数据查找操作-BG$
	 */
	public void seekBG$(double bg$) {
		System.out.println("\n\n数据查找操作-BG$:");
		for(int i=0; i<m.length; i++)
			if(m[i].bg$==bg$)
				m[i].show();
	}
	/**
	 * 数据统计操作-NationName
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
	 * 数据统计操作-Boy
	 */
	public long addBoy() {
		long b=0;
		for(int i=0; i<m.length; i++)
			b+=m[i].b;
		return b;
	}
	/**
	 * 数据统计操作-Girl
	 */
	public long addGirl() {
		long g=0;
		for(int i=0; i<m.length; i++)
			g+=m[i].g;
		return g;
	}
	/**
	 * 数据统计操作-All
	 */
	public void addAll() {
		long b=addBoy(),g=addGirl();
		double a=b+g;
		System.out.println("\n\n数据统计操作-All:");
		System.out.println("--------------------------------------");
		System.out.println("民族:\t"+addNationName());
		System.out.println("男性人口:\t"+b+"\t女性人口:\t"+g);
		System.out.println("男性比重:\t"+b/a*100+"%"+"\t女性比重:\t"+g/a*100+"%");
		System.out.println("男女性别比:\t"+(double)b/a*100+"%");
		System.out.println(g);
	}
	/**
	 * 数据排序操作-NationName
	 */
	public void sortNationName() {
		System.out.println("\n\n数据排序操作-NationName:");
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
	 * 数据排序操作-Boy
	 */
	public void sortBoy() {
		System.out.println("\n\n数据排序操作-Boy:");
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
	 * 数据排序操作-Girl
	 */
	public void sortGirl() {
		System.out.println("\n\n数据排序操作-Girl:");
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
	 * 数据排序操作-Boy$
	 */
	public void sortBoy$() {
		System.out.println("\n\n数据排序操作-Boy$:");
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
	 * 数据排序操作-Girl$
	 */
	public void sortGirl$() {
		System.out.println("\n\n数据排序操作-Girl$:");
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
	 * 数据排序操作-BG$
	 */
	public void sortBG$() {
		System.out.println("\n\n数据排序操作-BG$:");
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
	 * 显示数据
	 */
	public void show() {
		System.out.println("\n\n《我国各民族人口性别构成一览表》:");
		for(int i=0; i<m.length; i++)
			m[i].show();
	}
}
/**
 * 单个信息
 * @author 黎夜之梦
 *
 */
class M {
	public String	NationName;		//民族
	public long	b,g;				//男性人口、女性人口
	public double	b$,g$,bg$;		//男性比重、女性比重、男女性别比
	/**
	 * 用已有数据实例化
	 */
	public M(String Na,long bb,long gg,double bb$,double gg$,double $) {
		NationName=Na;
		b=bb;g=gg;
		b$=bb$;g$=gg$;
		bg$=$;
	}
	/**
	 * 显示数据
	 */
	public void show() {
		System.out.println("--------------------------------------");
		System.out.println("民族:\t"+NationName);
		System.out.println("男性人口:\t"+b+"\t女性人口:\t"+g);
		System.out.println("男性比重:\t"+b$*100+"%"+"\t女性比重:\t"+g$*100+"%");
		System.out.println("男女性别比:\t"+bg$*100+"%");
	}
}