package T02_TextKey;

import function.Scan;

/**
 * 设计Java类WordCounter，实现从文本Text检索Key子串，统计Key在Text中的出现次数，并返回Key在Text中第一次和最后一次出现的位置。
 * @author 黎夜之梦
 *
 */

public class WordCounter {
	/**
	 * a[0]为次数
	 * a[1]为第一次位置
	 * a[2]为第二次位置
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
