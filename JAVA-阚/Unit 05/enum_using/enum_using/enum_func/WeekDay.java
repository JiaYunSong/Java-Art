package enum_using.enum_func;

//�̳й� Enum<E> �ˣ�������
//String name()  ���س�����
//int ordinal()  �������
//String toString()   ת���ַ���

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
