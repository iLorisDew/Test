import java.util.Scanner;

public class sdzl 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		System.out.println("C'est iHyperMusic!");
		System.out.println("Yo le test");
		System.out.println("Github update test 2.");
		
		int temps;
		temps = 10;
		char rep = 'O';
		int j = 0;
		
		System.out.println(temps);
		String intro;
		intro = "Gj bois";
		
		String tab[] []= {{"Lo"," Mi", "Cro", "Al", "Roux"}, {"Dota", "Lol", "OverWatch", "Wow", "H1Z1"}};
		String tab2[] = {"Lo"," Mi", "Cro", "Al", "Roux"};
		
		String auRevoir = new String("Good bye my friends!");
		System.out.println(auRevoir);

		
		
		System.out.println(intro);
		
		System.out.println("La température aujourd'hui est de " +temps);
		
		
		
		while(rep == 'O')
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Entrez votre nom: ");
			String nom = scan.nextLine();
			System.out.println("Votre nom est: "+nom);
			System.out.println("Votre nom fait: "+nom.length()+" caractères.");
			System.out.println("Veuillez entrer votre age: ");
			int age = scan.nextInt();
			System.out.println("Votre âge est: " + age);
			System.out.print("\n");
			System.out.println("En résumé, vous vous appelez " +nom);
			System.out.println("Et vous avez " + age);
			char tchar = nom.charAt(2);
		
			System.out.println("Le 3ème caractère de votre nom est: "+tchar);	
			rep = ' ';
			do 
			{
				System.out.println("Voulez-vous réessayer ? (O/N)");
				scan.nextLine();
				String reponse = scan.nextLine();
				
				rep = reponse.charAt(0);
								
			}while(rep != 'O' && rep !='N');
			
			int i;
			
			for(i=0; i<10; i++) 
			{
				System.out.println("Merci " +i+ " fois beaucoup!");
			}
			
			for(i = 0; i<2; i++) 
			{
				for(j = 0; j<5; j++) 
				{
					System.out.println(tab[i][j]);
				}
				System.out.println("");
			}
			
			i=0;
			j=0;
			
			while (i < 2)
			{
				j = 0;
				while(j < 5)
				{
					System.out.print(tab[i][j]);
					j++; 
				}
				
				System.out.println("");
				i++; 
			}
			
			System.out.println("");
			
			i = 0;
			j = 0;
			
			for(String str: tab2) 
			{
				System.out.println(str);
			}
			
			String tabi[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
			i = 0;
			j = 0;
			for(String sousTab[] : tabi)
			{
				i = 0;
				for(String str : sousTab)
				{
					System.out.println("La valeur de la nouvelle boucle est : " +str);
					System.out.println("La valeur du tableau à l'indice["+j+"]["+i+"] est : " + tabi[j][i]);
					i++; 
				}
			j++; 
			}
		}
				
		// TODO Auto-generated method stub

	}

}
