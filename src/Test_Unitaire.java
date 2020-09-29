import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class Test_Unitaire {
	
	
		ArrayList <Analyste> listeAnalyste = new ArrayList <Analyste>() ;
		
		
		ListeAnalyste listeA = new ListeAnalyste(listeAnalyste);
		
		
	@Test
	public void Initlist() {
		assertTrue(listeAnalyste.isEmpty());
		assertTrue(listeAnalyste.size() == 0);
	}
	
	@Test
	public void Ajout_Analyste() {
		Date date1 =  new Date();
		Analyste salarie3 = new Analyste(1,"Costes","Quentin","Http/testst",date1,5);
		listeAnalyste.add(0,salarie3);
		
		assertEquals(1,listeAnalyste.get(0).getCode());
		
	}

}
