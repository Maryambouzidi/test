package TP;
public class Identite {
	// attributes
			private String nip , nom , prenom;
			
			// constructor
			public Identite(String nip , String nom , String prenom) {
				this.nip = nip ;
				this.nom = nom ;
				this.prenom = prenom ;
			}
			
			// getters
			public String getNip() {
				return nip;
			}
			public String getNom() {
				return nom;
			}
			public String getPrenom() {
				return prenom;
			}

			// toString
			public String toString() {
				return "NIP : "+nip+", Nom : "+nom+", Prenom : "+prenom;
			}
		}

