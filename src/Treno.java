//package prgTreno;
import java.util.*;

/**
 * <b> classe treno </b>
 * <p> array di oggetti </p>
 * <p> dati in ingresso: </p>
 * <UL>
 * <LI> nome
 * <LI> destinazione 
 * <LI> nome vagoni massimi
 * </LU>
 */
public class Treno {
    private String Nome;
    private int Destinazione;
    private int NumeroMaxV;
  
    
    
    public Treno(String Nome,int Destinazione, int NumeroMaxV) {
    	this.Nome = Nome;
		this. Destinazione = Destinazione;
		this.NumeroMaxV = NumeroMaxV;
		}



	public int getDestinazione() {
		return Destinazione;
	}



	public void setDestinazione(int destinazione) {
		Destinazione = destinazione;
	}
	public Vagone[] aggiungiVagone() {
        // TODO implement here
        return null;
    }



	@Override
	public String toString() {
		return "Treno [Nome=" + Nome + ", Destinazione=" + Destinazione + ", NumeroMaxV=" + NumeroMaxV + "]";
	}
	
    



}