
public class Jeu {

	public static void main(String[] args) {
		Taregotchi Bruno = new Taregotchi();
		StringBuffer choix = new StringBuffer("Truc");
		java.util.Scanner entree = new java.util.Scanner(System.in);
				
		Bruno.update();
		while (Bruno.getEnergy()!=0){
			
			Bruno.printStatus();
			
				while ( !choix.toString().equals("o") && !choix.toString().equals("n")){
					choix.delete(0,choix.length()+1);
					System.out.println("Nourrir votre taregotcho ?");
					choix.append(entree.next());
				}
				if (choix.toString().equals("n")){
					Bruno.setEnergy(Bruno.getEnergy()-1);
				}else{
					Bruno.nourrir();
				}
				Bruno.update();
				choix.delete(0,choix.length()+1 );
				
	}
		Bruno.printStatus();
		
		System.out.println("Game Over.");
		entree.close();
}

	
}
