public class StringVariables {
	public static void main(String[] args) {
		String a = "foo", b = "bar", c = "baz", x, y, z;
		x = a+b;
		y = b+c;
		z = a+c;
		System.out.println("x: "+x+" y: "+y+" z: "+z);
	}
}
