package function;

import java.io.*;
import java.math.*;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;
/**
 * 输入流整理
 * @author 黎夜之梦
 *
 */
public class Scan {
	private static Scanner sc=new Scanner(System.in);
	/**
	 * 构造一个新的 Scanner ，产生从指定文件扫描的值。 
	 * @throws FileNotFoundException 
	 */
	static public void build(File source) throws FileNotFoundException {
		sc=new Scanner(source);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定文件扫描的值。 
	 * @throws FileNotFoundException 
	 */
	static public void build(File source, String charsetName) throws FileNotFoundException {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定输入流扫描的值。 
	 */
	static public void build(InputStream source) {
		sc=new Scanner(source);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定输入流扫描的值。 
	 */
	static public void build(InputStream source, String charsetName)  {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定文件扫描的值。 
	 * @throws IOException 
	 */
	static public void build(Path source) throws IOException   {
		sc=new Scanner(source);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定文件扫描的值。 
	 * @throws IOException 
	 */
	static public void build(Path source, String charsetName)  throws IOException   {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定源扫描的值。
	 */
	static public void build(Readable source)   {
		sc=new Scanner(source);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定源扫描的值。
	 */
	static public void build(ReadableByteChannel source)    {
		sc=new Scanner(source);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定源扫描的值。
	 */
	static public void build(ReadableByteChannel source, String charsetName)     {
		sc=new Scanner(source,charsetName);
	}
	/**
	 * 构造一个新的 Scanner ，产生从指定字符串扫描的值。 
	 */
	static public void build(String source)      {
		sc=new Scanner(source);
	}
	/**
	 * 读出下一个字符串 
	 */
	static public String next() {
		return sc.next();
	}
	/**
	 * 读出下一个字符串 
	 */
	static public String next(String mes) {
		System.out.print(mes);
		return sc.next();
	}
	/**
	 * 检查扫描器中是否还有输入项 
	 */
	static public boolean hasNext() {
		return sc.hasNext();
	}
	/**
	 * 读出下一个int型整数 
	 */
	static public int nextInt() {
		return sc.nextInt();
	}
	/**
	 * 读出下一个double型浮点数 
	 */
	static public double nextDouble() {
		return sc.nextDouble();
	}
	/**
	 * 输出字符,读出下一个int型整数
	 */
	static public int nextInt(String mes) {
		System.out.print(mes);
		return sc.nextInt();
	}
	/**
	 * 输出字符,读出下一个double型浮点数 
	 */
	static public double nextDouble(String mes) {
		System.out.print(mes);
		return sc.nextDouble();
	}
	/**
	 * 返回 IOException最后通过此抛出 Scanner的基本 Readable 。 
	 */
	static public IOException ioException() {
		return sc.ioException();
	}
	/**
	 * 将输入的下一个标记扫描为布尔值，并返回该值。 
	 */
	static public boolean nextBoolean() {
		return sc.nextBoolean();
	}
	/**
	 * 将输入的下一个标记扫描为 byte 。  
	 */
	static public byte nextByte() {
		return sc.nextByte();
	}
	/**
	 * 将输入的下一个标记扫描为 float 。 
	 */
	static public float nextFloat() {
		return sc.nextFloat();
	}
	/**
	 * 将此扫描仪推进到当前行并返回跳过的输入。 
	 */
	static public String nextLine()   {
		return sc.nextLine();
	}
	/**
	 * 将此扫描仪推进到当前行并返回跳过的输入。 
	 */
	static public String nextLine(String mes)   {
		System.out.print(mes);
		return sc.nextLine();
	}
	/**
	 * 将输入的下一个标记扫描为 long 。  
	 */
	static public long nextLong()  {
		return sc.nextLong();
	}
	/**
	 * 将输入的下一个标记扫描为 short 。 
	 */
	static public short nextShort()  {
		return sc.nextShort();
	}
	/**
	 * 返回 Pattern这个 Scanner正在使用来匹配分隔符。 
	 */
	static public Pattern delimiter()    {
		return sc.delimiter();
	}
	/**
	 * 尝试找到忽略分隔符的指定模式的下一个出现。 
	 */
	static public String findInLine(Pattern pattern)  {
		return sc.findInLine(pattern);
	}
	/**
	 * 尝试查找从指定字符串构造的模式的下一个出现，忽略分隔符。 
	 */
	static public String findInLine(String pattern)  {
		return sc.findInLine(pattern);
	}
	/**
	 * 尝试找到指定模式的下一个出现。 
	 */
	static public String findWithinHorizon(Pattern pattern, int horizon)  {
		return sc.findWithinHorizon(pattern,horizon);
	}
	/**
	 * 尝试查找从指定字符串构造的模式的下一个出现，忽略分隔符。 
	 */
	static public String findWithinHorizon(String pattern, int horizon)  {
		return sc.findWithinHorizon(pattern,horizon);
	}
	/**
	 * 如果下一个完整的令牌匹配指定的模式，则返回true。 
	 */
	static public boolean hasNext(Pattern pattern)  {
		return sc.hasNext(pattern);
	}
	/**
	 * 如果下一个令牌匹配从指定字符串构造的模式，则返回true。
	 */
	static public boolean hasNext(String pattern)  {
		return sc.hasNext(pattern);
	}
	/**
	 * 如果在此扫描器输入信息的下一个标记可以解释为，则返回true BigInteger在使用默认基数 nextBigInteger()方法。 
	 */
	static public boolean hasNextBigInteger()  {
		return sc.hasNextBigInteger();
	}
	/**
	 * 如果在此扫描器输入信息的下一个标记可以解释为，则返回true BigInteger在使用指定基数 nextBigInteger()方法。 
	 */
	static public boolean hasNextBigInteger(int radix)  {
		return sc.hasNextBigInteger(radix);
	}
	/**
	 * 如果此扫描器输入中的下一个标记可以使用从字符串“true | false”创建的不区分大小写的模式解释为布尔值，则返回true。 
	 */
	static public boolean hasNextBoolean()  {
		return sc.hasNextBoolean();
	}
	/**
	 * 如果此扫描仪输入中的下一个标记可以使用 nextByte()方法将其 解释为默认基数中的字节值，则返回true。 
	 */
	static public boolean hasNextByte()  {
		return sc.hasNextByte();
	}
	/**
	 * 如果扫描仪输入中的下一个标记可以使用 nextByte()方法解释为指定基数中的字节值，则返回true。 
	 */
	static public boolean hasNextByte(int radix)  {
		return sc.hasNextByte(radix);
	}
	/**
	 * 如果扫描仪的输入中的下一个标记可以使用 nextDouble()方法将其解释为双重值，则返回true。 
	 */
	static public boolean hasNextDouble()  {
		return sc.hasNextDouble();
	}
	/**
	 * 如果扫描仪输入中的下一个标记可以使用 nextFloat()方法将其解释为浮点值，则返回true。 
	 */
	static public boolean hasNextFloat()  {
		return sc.hasNextFloat();
	}
	/**
	 * 如果此扫描仪输入中的下一个标记可以使用 nextInt()方法解释为默认基数中的int值，则返回true。 
	 */
	static public boolean hasNextInt()  {
		return sc.hasNextInt();
	}
	/**
	 * 如果此扫描仪输入中的下一个标记可以使用 nextInt()方法解释为指定基数中的int值，则返回true。 
	 */
	static public boolean hasNextInt(int radix)  {
		return sc.hasNextInt(radix);
	}
	/**
	 * 如果扫描仪的输入中有另一行，则返回true。 
	 */
	static public boolean hasNextLine()  {
		return sc.hasNextLine();
	}
	/**
	 * 如果扫描仪的输入中的下一个标记可以使用 nextLong()方法解释为指定基数中的长整型值，则返回true。 
	 */
	static public boolean hasNextLong()  {
		return sc.hasNextLong();
	}
	/**
	 * 如果此扫描仪输入中的下一个标记可以使用 nextShort()方法将其 解释为默认基数中的一个短值，则返回true。 
	 */
	static public boolean hasNextShort()  {
		return sc.hasNextShort();
	}
	/**
	 * 如果扫描仪的输入中的下一个标记可以使用 nextShort()方法解释为指定基数中的一个短值，则返回true。 
	 */
	static public boolean hasNextShort(int radix)  {
		return sc.hasNextShort(radix);
	}
	/**
	 * 返回此扫描仪的区域设置。 
	 */
	static public Locale locale()  {
		return sc.locale();
	}
	/**
	 * 如果匹配指定的模式，则返回下一个令牌。 
	 */
	static public String next(Pattern pattern)  {
		return sc.next(pattern);
	}
	/**
	 * 将输入的下一个标记扫描为BigDecimal 。 
	 */
	static public BigDecimal nextBigDecimal()  {
		return sc.nextBigDecimal();
	}
	/**
	 * 将输入的下一个标记扫描为BigInteger 。 
	 */
	static public BigInteger nextBigInteger(int radix)  {
		return sc.nextBigInteger(radix);
	}
	/**
	 * 将输入的下一个标记扫描为BigInteger 。 
	 */
	static public BigInteger nextBigInteger()  {
		return sc.nextBigInteger();
	}
	/**
	 * 返回此扫描仪的默认基数。 
	 */
	static public int radix()  {
		return sc.radix();
	}
	/**
	 * Iterator的此实现不支持删除 Iterator 。 
	 */
	static public void remove()  {
		sc.remove() ;
	}
	/**
	 * 重设此扫描仪。 
	 */
	static public Scanner reset()  {
		return sc.reset();
	}
	/**
	 * 跳过与指定模式匹配的输入，忽略分隔符。 
	 */
	static public Scanner skip(Pattern pattern)  {
		return sc.skip(pattern);
	}
	/**
	 * 跳过与指定字符串构成的模式匹配的输入。
	 */
	static public Scanner skip(String pattern)  {
		return sc.skip(pattern);
	}
	/**
	 * 将此扫描仪的分隔模式设置为指定的模式。 
	 */
	static public Scanner useDelimiter(Pattern pattern)  {
		return sc.useDelimiter(pattern);
	}
	/**
	 * 将此扫描器的分隔模式设置为从指定的构造的模式 String 。 
	 */
	static public Scanner useDelimiter(String pattern)  {
		return sc.useDelimiter(pattern);
	}
	/**
	 * 将此扫描仪的区域设置设置为指定的区域设置。 
	 */
	static public Scanner useLocale(Locale locale)  {
		return sc.useLocale(locale);
	}
	/**
	 * 将此扫描仪的默认基数设置为指定的基数。 
	 */
	static public Scanner useRadix(int radix)  {
		return sc.useRadix(radix);
	}
}
