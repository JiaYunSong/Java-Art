package syntaxerror;

public class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8275807636494210578L;
	private String ID=null;
	public MyException(String msg,String id)
	{
		super(msg);
		ID=id;
	}
	public String toString()
	{
		return (ID+":"+super.toString());
	}
}
