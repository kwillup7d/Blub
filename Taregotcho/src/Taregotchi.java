
public class Taregotchi {
	
	private int energy;
	private StringBuffer status = new StringBuffer( "Bwoup" );
	
	public Taregotchi() { energy = 3;};
	
	public void update() {
		status.delete(0,status.length()+1);
		if (this.energy >= 2){
			
			status.append("Je vais bien");
		}
		else if(energy != 0){
			status.append("Je suis affamé !");
		}else{
			status.append("Aaaaargh..."); 
		}
	};
	public void printStatus(){
		System.out.println(status);
	};
	public void nourrir(){
		if (energy < 2){
			energy += 2;
		}else{
			System.out.println("Je n'ai pas faim !");
			energy--;
		}
	}
	public int getEnergy(){
		return energy;
	}
	
	public void setEnergy(int n){
		energy = n;
	}

}
