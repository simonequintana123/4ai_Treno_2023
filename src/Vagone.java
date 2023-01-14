import java.util.*;

public class Vagone {
    private String Classe;
    private int PostiDisp;
    private int PostiOcc;
    

	public Vagone(String Classe, int PostiDisp, int PostiOcc) {
		this.Classe = Classe;
		this.PostiDisp = PostiOcc;
	}


	public int getPostiDisp() {
		return PostiDisp;
	}


	public void setPostiDisp(int postiDisp) {
		PostiDisp = postiDisp;
	}


	public int getPostiOcc() {
		return PostiOcc;
	}


	public void setPostiOcc(int postiOcc) {
		PostiOcc = postiOcc;
	}


	@Override
	public String toString() {
		return "Vagone [Classe=" + Classe + ", PostiDisp=" + PostiDisp + ", PostiOcc=" + PostiOcc + "]";
	}

	
}