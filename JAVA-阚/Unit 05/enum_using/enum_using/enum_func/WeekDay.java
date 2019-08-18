package enum_using.enum_func;

//继承过 Enum<E> 了，函数有
//String name()  返回常量名
//int ordinal()  常量序号
//String toString()   转成字符串

public enum WeekDay {
	/**
	 * WeekDay has void show();
	 */
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
	public void show(){
		/**
		 * show() is to ((this.ordinal()+7)%7)+" "+this.name()
		 */
		System.out.println(((this.ordinal()+7)%7)+" "+this.name());
	}
}
