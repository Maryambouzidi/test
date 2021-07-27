package tp;
package TP;
import java.util.*;
public class Etudiant {
	// attributes
			private Identite id ;
			private Formation formation ;
			private HashMap<String, ArrayList<Integer>> resultats;
			
			//constructor
			public Etudiant(String n , String p , String N , Formation formation) {
				super();
				id =new Identite( n , p , N);
				this.formation = formation;
				resultats = new HashMap<String, ArrayList<Integer>>();
			}
			
			// ajouter une note 
			public void ajoueter_Note(int note, String matiere) {
				if(resultats.containsKey(matiere)){
				
					ArrayList<Integer> liste = resultats.get(matiere);
					liste.add(note);
					}
				else {
					ArrayList<Integer> liste =new ArrayList<Integer>();
			liste.add(note);
				resultats.put(matiere,liste);}
				}
				// calculer moyenne d'etudiant dans une matiere
				 public double moyenne (String m) {
					double moyenne= 0;
						ArrayList<Integer> tab = resultats.get(m);
						for(int i :tab) {
							moyenne += i;
						}
						 moyenne =moyenne/tab.size();
						return moyenne;
				}
				
				
				//modifier formation
				public void setformation(Formation f) {
					this.formation =f ;
				}
				
				// moyene general
				public double moyenne_generale() {
					double somme_note = 0;
					int somme_cofi= 0;
					for(String k : resultats.keySet()) {
						somme_note += moyenne(k) * formation.getcoeff_matiere(k);
						somme_cofi+= formation.getcoeff_matiere(k);
					}
					double moyenneGeneral= somme_note/somme_cofi;
					return moyenneGeneral;
				}
				
				// getid
				public Identite getId() {
					return id;
				}
				public HashMap<String, ArrayList<Integer>> getResultats(){
					return resultats;
				}

				@Override
				public String toString() {
					return "Etudiant [id=" + id + ", formation=" + formation + ", resultats=" + resultats + "]";
				}
				
		}

			
