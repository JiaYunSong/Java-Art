package T02_TextKey;

import function.Scan;

/**
 * ���Java��WordCounter��ʵ�ִ��ı�Text����Key�Ӵ���ͳ��Key��Text�еĳ��ִ�����������Key��Text�е�һ�κ����һ�γ��ֵ�λ�á�
 * @author ��ҹ֮��
 *
 */

public class WordCounter {
	/**
	 * a[0]Ϊ����
	 * a[1]Ϊ��һ��λ��
	 * a[2]Ϊ�ڶ���λ��
	 */
	public static int[] TextScan(String s,String k) {
		int a[]= {0,-1,0};
		if(k.length()==0||s.length()==0||s.length()<k.length())
			return a;
		for(int i=0; i<s.length()-k.length()+1; i++)
			if(s.charAt(i)==k.charAt(0)) {
				boolean yn=true;
				for(int j=0; j<k.length(); j++)
					if(s.charAt(i+j)!=k.charAt(j))
						yn=false;
				if(yn) {
					a[0]++;
					if(a[1]==-1) a[1]=i;
					a[2]=i;
				}
			}
		return a;
	}
	public static void main(String[] args) {
		String s=Scan.nextLine("Text=");
		String k=Scan.next("Key=");
		int a[]=TextScan(s,k);
		System.out.println("Time="+a[0]);
		System.out.println("First Location="+a[1]);
		System.out.println("Last Location="+a[2]);
	}

}
