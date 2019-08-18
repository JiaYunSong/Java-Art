package in_out;

public class Split_using {
	public static void main(String[] args) {
		String str="I am a good boy !";
		String words[];
		words=str.split(" ");
		for(String w:words)
			System.out.print("["+w+"]");
		System.out.println();
		
		str="I,am,a,good,boy,!";
		words=str.split(",");
		for(String w:words)
			System.out.print("["+w+"]");
		System.out.println();
	}
}
