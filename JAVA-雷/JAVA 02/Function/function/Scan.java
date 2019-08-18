package function;

import java.io.*;
import java.math.*;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;
/**
 * ����������
 * @author ��ҹ֮��
 *
 */
public class Scan {
	private static Scanner sc=new Scanner(System.in);
	/**
	 * ����һ���µ� Scanner ��������ָ���ļ�ɨ���ֵ�� 
	 * @throws FileNotFoundException 
	 */
	static public void build(File source) throws FileNotFoundException {
		sc=new Scanner(source);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ���ļ�ɨ���ֵ�� 
	 * @throws FileNotFoundException 
	 */
	static public void build(File source, String charsetName) throws FileNotFoundException {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ��������ɨ���ֵ�� 
	 */
	static public void build(InputStream source) {
		sc=new Scanner(source);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ��������ɨ���ֵ�� 
	 */
	static public void build(InputStream source, String charsetName)  {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ���ļ�ɨ���ֵ�� 
	 * @throws IOException 
	 */
	static public void build(Path source) throws IOException   {
		sc=new Scanner(source);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ���ļ�ɨ���ֵ�� 
	 * @throws IOException 
	 */
	static public void build(Path source, String charsetName)  throws IOException   {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ��Դɨ���ֵ��
	 */
	static public void build(Readable source)   {
		sc=new Scanner(source);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ��Դɨ���ֵ��
	 */
	static public void build(ReadableByteChannel source)    {
		sc=new Scanner(source);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ��Դɨ���ֵ��
	 */
	static public void build(ReadableByteChannel source, String charsetName)     {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * ����һ���µ� Scanner ��������ָ���ַ���ɨ���ֵ�� 
	 */
	static public void build(String source)      {
		sc=new Scanner(source);
	}
	/**
	 * ������һ���ַ��� 
	 */
	static public String next() {
		return sc.next();
	}
	/**
	 * ������һ���ַ��� 
	 */
	static public String next(String mes) {
		System.out.print(mes);
		return sc.next();
	}
	/**
	 * ���ɨ�������Ƿ��������� 
	 */
	static public boolean hasNext() {
		return sc.hasNext();
	}
	/**
	 * ������һ��int������ 
	 */
	static public int nextInt() {
		return sc.nextInt();
	}
	/**
	 * ������һ��double�͸����� 
	 */
	static public double nextDouble() {
		return sc.nextDouble();
	}
	/**
	 * ����ַ�,������һ��int������
	 */
	static public int nextInt(String mes) {
		System.out.print(mes);
		return sc.nextInt();
	}
	/**
	 * ����ַ�,������һ��double�͸����� 
	 */
	static public double nextDouble(String mes) {
		System.out.print(mes);
		return sc.nextDouble();
	}
	/**
	 * ���� IOException���ͨ�����׳� Scanner�Ļ��� Readable �� 
	 */
	static public IOException ioException() {
		return sc.ioException();
	}
	/**
	 * ���������һ�����ɨ��Ϊ����ֵ�������ظ�ֵ�� 
	 */
	static public boolean nextBoolean() {
		return sc.nextBoolean();
	}
	/**
	 * ���������һ�����ɨ��Ϊ byte ��  
	 */
	static public byte nextByte() {
		return sc.nextByte();
	}
	/**
	 * ���������һ�����ɨ��Ϊ float �� 
	 */
	static public float nextFloat() {
		return sc.nextFloat();
	}
	/**
	 * ����ɨ�����ƽ�����ǰ�в��������������롣 
	 */
	static public String nextLine()   {
		return sc.nextLine();
	}
	/**
	 * ����ɨ�����ƽ�����ǰ�в��������������롣 
	 */
	static public String nextLine(String mes)   {
		System.out.print(mes);
		return sc.nextLine();
	}
	/**
	 * ���������һ�����ɨ��Ϊ long ��  
	 */
	static public long nextLong()  {
		return sc.nextLong();
	}
	/**
	 * ���������һ�����ɨ��Ϊ short �� 
	 */
	static public short nextShort()  {
		return sc.nextShort();
	}
	/**
	 * ���� Pattern��� Scanner����ʹ����ƥ��ָ����� 
	 */
	static public Pattern delimiter()    {
		return sc.delimiter();
	}
	/**
	 * �����ҵ����Էָ�����ָ��ģʽ����һ�����֡� 
	 */
	static public String findInLine(Pattern pattern)  {
		return sc.findInLine(pattern);
	}
	/**
	 * ���Բ��Ҵ�ָ���ַ��������ģʽ����һ�����֣����Էָ����� 
	 */
	static public String findInLine(String pattern)  {
		return sc.findInLine(pattern);
	}
	/**
	 * �����ҵ�ָ��ģʽ����һ�����֡� 
	 */
	static public String findWithinHorizon(Pattern pattern, int horizon)  {
		return sc.findWithinHorizon(pattern,horizon);
	}
	/**
	 * ���Բ��Ҵ�ָ���ַ��������ģʽ����һ�����֣����Էָ����� 
	 */
	static public String findWithinHorizon(String pattern, int horizon)  {
		return sc.findWithinHorizon(pattern,horizon);
	}
	/**
	 * �����һ������������ƥ��ָ����ģʽ���򷵻�true�� 
	 */
	static public boolean hasNext(Pattern pattern)  {
		return sc.hasNext(pattern);
	}
	/**
	 * �����һ������ƥ���ָ���ַ��������ģʽ���򷵻�true��
	 */
	static public boolean hasNext(String pattern)  {
		return sc.hasNext(pattern);
	}
	/**
	 * ����ڴ�ɨ����������Ϣ����һ����ǿ��Խ���Ϊ���򷵻�true BigInteger��ʹ��Ĭ�ϻ��� nextBigInteger()������ 
	 */
	static public boolean hasNextBigInteger()  {
		return sc.hasNextBigInteger();
	}
	/**
	 * ����ڴ�ɨ����������Ϣ����һ����ǿ��Խ���Ϊ���򷵻�true BigInteger��ʹ��ָ������ nextBigInteger()������ 
	 */
	static public boolean hasNextBigInteger(int radix)  {
		return sc.hasNextBigInteger(radix);
	}
	/**
	 * �����ɨ���������е���һ����ǿ���ʹ�ô��ַ�����true | false�������Ĳ����ִ�Сд��ģʽ����Ϊ����ֵ���򷵻�true�� 
	 */
	static public boolean hasNextBoolean()  {
		return sc.hasNextBoolean();
	}
	/**
	 * �����ɨ���������е���һ����ǿ���ʹ�� nextByte()�������� ����ΪĬ�ϻ����е��ֽ�ֵ���򷵻�true�� 
	 */
	static public boolean hasNextByte()  {
		return sc.hasNextByte();
	}
	/**
	 * ���ɨ���������е���һ����ǿ���ʹ�� nextByte()��������Ϊָ�������е��ֽ�ֵ���򷵻�true�� 
	 */
	static public boolean hasNextByte(int radix)  {
		return sc.hasNextByte(radix);
	}
	/**
	 * ���ɨ���ǵ������е���һ����ǿ���ʹ�� nextDouble()�����������Ϊ˫��ֵ���򷵻�true�� 
	 */
	static public boolean hasNextDouble()  {
		return sc.hasNextDouble();
	}
	/**
	 * ���ɨ���������е���һ����ǿ���ʹ�� nextFloat()�����������Ϊ����ֵ���򷵻�true�� 
	 */
	static public boolean hasNextFloat()  {
		return sc.hasNextFloat();
	}
	/**
	 * �����ɨ���������е���һ����ǿ���ʹ�� nextInt()��������ΪĬ�ϻ����е�intֵ���򷵻�true�� 
	 */
	static public boolean hasNextInt()  {
		return sc.hasNextInt();
	}
	/**
	 * �����ɨ���������е���һ����ǿ���ʹ�� nextInt()��������Ϊָ�������е�intֵ���򷵻�true�� 
	 */
	static public boolean hasNextInt(int radix)  {
		return sc.hasNextInt(radix);
	}
	/**
	 * ���ɨ���ǵ�����������һ�У��򷵻�true�� 
	 */
	static public boolean hasNextLine()  {
		return sc.hasNextLine();
	}
	/**
	 * ���ɨ���ǵ������е���һ����ǿ���ʹ�� nextLong()��������Ϊָ�������еĳ�����ֵ���򷵻�true�� 
	 */
	static public boolean hasNextLong()  {
		return sc.hasNextLong();
	}
	/**
	 * �����ɨ���������е���һ����ǿ���ʹ�� nextShort()�������� ����ΪĬ�ϻ����е�һ����ֵ���򷵻�true�� 
	 */
	static public boolean hasNextShort()  {
		return sc.hasNextShort();
	}
	/**
	 * ���ɨ���ǵ������е���һ����ǿ���ʹ�� nextShort()��������Ϊָ�������е�һ����ֵ���򷵻�true�� 
	 */
	static public boolean hasNextShort(int radix)  {
		return sc.hasNextShort(radix);
	}
	/**
	 * ���ش�ɨ���ǵ��������á� 
	 */
	static public Locale locale()  {
		return sc.locale();
	}
	/**
	 * ���ƥ��ָ����ģʽ���򷵻���һ�����ơ� 
	 */
	static public String next(Pattern pattern)  {
		return sc.next(pattern);
	}
	/**
	 * ���������һ�����ɨ��ΪBigDecimal �� 
	 */
	static public BigDecimal nextBigDecimal()  {
		return sc.nextBigDecimal();
	}
	/**
	 * ���������һ�����ɨ��ΪBigInteger �� 
	 */
	static public BigInteger nextBigInteger(int radix)  {
		return sc.nextBigInteger(radix);
	}
	/**
	 * ���������һ�����ɨ��ΪBigInteger �� 
	 */
	static public BigInteger nextBigInteger()  {
		return sc.nextBigInteger();
	}
	/**
	 * ���ش�ɨ���ǵ�Ĭ�ϻ����� 
	 */
	static public int radix()  {
		return sc.radix();
	}
	/**
	 * Iterator�Ĵ�ʵ�ֲ�֧��ɾ�� Iterator �� 
	 */
	static public void remove()  {
		sc.remove() ;
	}
	/**
	 * �����ɨ���ǡ� 
	 */
	static public Scanner reset()  {
		return sc.reset();
	}
	/**
	 * ������ָ��ģʽƥ������룬���Էָ����� 
	 */
	static public Scanner skip(Pattern pattern)  {
		return sc.skip(pattern);
	}
	/**
	 * ������ָ���ַ������ɵ�ģʽƥ������롣
	 */
	static public Scanner skip(String pattern)  {
		return sc.skip(pattern);
	}
	/**
	 * ����ɨ���ǵķָ�ģʽ����Ϊָ����ģʽ�� 
	 */
	static public Scanner useDelimiter(Pattern pattern)  {
		return sc.useDelimiter(pattern);
	}
	/**
	 * ����ɨ�����ķָ�ģʽ����Ϊ��ָ���Ĺ����ģʽ String �� 
	 */
	static public Scanner useDelimiter(String pattern)  {
		return sc.useDelimiter(pattern);
	}
	/**
	 * ����ɨ���ǵ�������������Ϊָ�����������á� 
	 */
	static public Scanner useLocale(Locale locale)  {
		return sc.useLocale(locale);
	}
	/**
	 * ����ɨ���ǵ�Ĭ�ϻ�������Ϊָ���Ļ����� 
	 */
	static public Scanner useRadix(int radix)  {
		return sc.useRadix(radix);
	}
}
