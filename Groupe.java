package TP;
import java.util.*;
public class Groupe {
	Formation formations;

	public ArrayList<Etudiant> list_Etudiant = new ArrayList<Etudiant>();
	public Groupe(Formation f) {
		this.formations=f;
		
	}
	
	// ajouter un etudiant
	public void ajouter_etudiant(Etudiant etud) {
		if(!list_Etudiant.contains(etud))
			list_Etudiant.add(etud);
		else
			System.out.println("Cette Etudiant est deja dans le groupe !");
	}
	
	//supprimer un etudiant
	public void supprimer_etudiant(Etudiant etud) {
		if(list_Etudiant.contains(etud))
			list_Etudiant.remove(etud);
		else
			System.out.println("Cette Etidiant n'est pas dans le groupe !");
	}
	
	// moyene de groupe dans une matiere
	public float moyene_matiere(String m) {
		float moy = 0 ;
		for(int i=0;i<this.list_Etudiant.size();i++) {
	        moy+=this.list_Etudiant.get(i).moyenne (m);
	}
		return moy/list_Etudiant.size();
	}
	
	// moyenne general de group
	
	public float moyenne_general() {
		float moy_gen=0;
    for(int i=0;i<this.list_Etudiant.size();i++) {
	moy_gen+=this.list_Etudiant.get(i).moyenne_generale();
	}
		System.out.println("La moyene general de groupe est : "+moy_gen);
		return moy_gen/list_Etudiant.size();
	}
	
	// triParMerite
	public ArrayList<Etudiant> triParMerite(){
		if(list_Etudiant.isEmpty()) {
			return null ;
		}
		else {
			ArrayList<Etudiant> list_trie = new ArrayList<Etudiant>();
			Etudiant etudiant  ;
			while(!(list_Etudiant.isEmpty())) {
				
				etudiant= list_Etudiant.get(0);
				int pos =0;
				for(int i =1;i<list_Etudiant.size()-1;i++) {
					if(list_Etudiant.get(i).moyenne_generale()>etudiant.moyenne_generale()) {
						etudiant = list_Etudiant.get(i);
						pos=i;
					}
				}
				list_trie.add(list_Etudiant.get(pos));
				list_Etudiant.remove(pos);
			}
			return list_trie;
		}
		
	}

	@Override
	public String toString() {
		return "Groupe [formations=" + formations + ", list_Etudiant=" + list_Etudiant + "]";
	}
	
	
}
		
		