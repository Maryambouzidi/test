package TP;
import java.util.*;
public class Formation {
	// attributes
		private String identifiant ;
		public HashMap<String,Integer> List_Matiere =new HashMap<String ,Integer>();
		
		
		
		
		// constructor
		public Formation(String id) {
			this.identifiant = id ;
		}
		
		
		
		
		// getters
		public String getId() {
			return identifiant ;
		}
		public HashMap<String , Integer> getList_matiere(){
			return List_Matiere;
		}
		
		
		
		
		// ajouter un matiere
		public void ajouter_matiere(String m , Integer cof) {
			List_Matiere.put(m, cof);
		}
		
		
		
		// supprimer un matiere
		
		public void supprimer_matiere(String  m) {
				if(List_Matiere.containsKey(m))
					List_Matiere.remove(m);
				else {
					System.out.println("cette matière est deja supprimer");
				}
		}
		
		
		
		
		// connaitre coeff d'une matiere
		public int getcoeff_matiere(String m) {
			int K=List_Matiere.get(m);
			return K;}




		@Override
		public String toString() {
			return "Formation [identifiant=" + identifiant + ", List_Matiere=" + List_Matiere + "]";
		}
		
			
			
	}

