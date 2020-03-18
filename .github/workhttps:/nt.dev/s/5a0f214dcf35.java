import java.util.ArrayList;

public class ColorsArray { 
    public static void main(String[] args){  
       
        

        //TODO- Déclarez une variable nommée colors qui correspond à un tableau de String de longueur 5
        String[] Colors=new String[5];
        int i=0;
      
        //TODO- Remplissez le tableau avec les couleurs demandées
    Colors[0]="red";
    Colors[1]="yellow";
    Colors[2]="orange";
    Colors[3]="green";
    Colors[4]="blue";
        //TODO- Remplacez 'green' par 'emerald' dans le tableau
     Colors[3]="emerald";
      
        //Affiche le contenu du tableau
        while(i<5){
            System.out.println(Colors[i]);
            i+=1;
        } 
    }
}
