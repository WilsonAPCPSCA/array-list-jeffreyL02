package Work;
import java.util.ArrayList;
public class emperorsNewGrove {
	public static void main(String[] args){
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.println("original: " + emperorCast);
		
		emperorCast.remove(1);
		emperorCast.set(2, "chaca");
		emperorCast.add("tipo");
		emperorCast.add("Kronk");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.println("after: " + emperorCast);
	}
}
