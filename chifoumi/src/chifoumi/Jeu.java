package chifoumi;

public class Jeu {
	
	private Joueur joueur2;
	private Joueur joueur1;
	private int Scoremax;
	
	public Jeu(String nom1, String nom2, int scoremax){
		joueur1 = new Joueur(nom1);
		joueur2 = new Joueur(nom2);
		Scoremax = scoremax;
		jouer();
				
	}
	
	public void jouer(){
		
		boolean fini = false;
		System.out.println("Le jeu s'arrêtera quand l'un de vous aura "+ Scoremax+" points.");
		while(!fini){
			tour();
			joueur1.ecrireScore();
			joueur2.ecrireScore();
			fini = conclure();
		}
		System.out.println("Jeu terminé.");
	}
	
	public void tour(){
		
		Choix choix1;
		Choix choix2;
		
		choix1 = joueur1.choisir();
		choix2 = joueur2.choisir();
		if (choix1 == choix2){
			return;
		}
		
		if (choix1 == Choix.PAPIER){
			if (choix2 == Choix.CISEAUX)
			{
				joueur2.crediter();
				return;
			}
			joueur1.crediter();
			return;
		}
		if (choix1 == Choix.CISEAUX){
			if (choix2 == Choix.PIERRE){
				joueur2.crediter();
				return;
			}
			joueur1.crediter();
			return;
		}
		if (choix2==Choix.PAPIER){
			joueur2.crediter();
			return;
		}
		joueur1.crediter();
		return;
	}
	
	public boolean conclure(){
		if ((joueur1.getScore()!=Scoremax)&(joueur2.getScore()!=Scoremax)){
			return false;
		}
		return true;
	}

}
