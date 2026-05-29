package debug;

public class DebugMain1 {

	public static void main(String[] args) {
		Position[] positions = new Position[]{
				new Position(1, 1),
				new Position(2, 2),
				new Position(3, 3)
		};
		for(int i = 0; i < positions.length; i++) {
			positions[i].translate(i, i); // no se puede hacer translate a null
			System.out.println(positions[i]);
		}
	}

}
