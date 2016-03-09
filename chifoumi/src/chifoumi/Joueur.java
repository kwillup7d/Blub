package chifoumi;


public class Joueur {
	
	private int score = 0;
	private String nom;
	private chifoumi.IHMSaisie saisie;
	public Joueur(String s){
		nom = s;
		saisie = new chifoumi.IHMSaisie(nom);
	};
	public void crediter(){ score++;};
	public Choix choisir(){
		return saisie.proposerChoix();
	};
	public int getScore(){
		return score;
	};
	
	public void ecrireScore(){
		System.out.println("Le score de " + nom +" est "+ score);
	}
	
}
