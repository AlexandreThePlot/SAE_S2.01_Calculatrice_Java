/**
	Classe héritant de la classe abstraite Opération, 
	elle permet de faire la multiplication entre deux opérandes.
*/
public class Multiplication extends Operation{
	
	/**
		Constructeur par défaut
	*/
	public Multiplication(){

	}
	
	/**
		Constructeur champs à champs
	*/
	public Multiplication(Expression valeur1, Expression valeur2){
		super(valeur1, valeur2);
	}
	
	/**
		Constructeur par copie
	*/
	public Multiplication(Multiplication mult){
		super(mult);
	}
	
	// Méthodes
	
	/**
		Résultat de la multiplication entre les deux opérandes
	*/
	public int valeur(){
		return this.getOperande1().valeur() * this.getOperande2().valeur();
	}
	
	/**
		Affiche le calcul suivi du résultat 
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " x " + this.getOperande2();
		s += ")";
		return s;
	}
	
} // fin classe Multiplication