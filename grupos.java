import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Campus FP
 */
public class Grupos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String alumnos[]= {"JOHAN ESTIBEN ACARO MASACHE","JOSE JAVIER ALAMO MORGADO","SERGIO CAMINO SAIZ","ASTRID CAROLINA CRUCES HUAMANI","JUAN DEL CAMPO CRUZ","ALBERTO CARLOS DIAZ LAZARO","DANIEL FERNANDEZ GARCIA-CARPINTERO","IKER GOMEZ ADAN", "DIEGO GÓMEZ GONZÁLEZ","JUAN SEBASTIAN GONZALEZ LOPEZ","JAVIER GUTIERREZ GUTIERREZ","JOHN BRYAN LEINES CAMALLE","ANGEL LOPEZ MELERO","MARIO LUQUERO IÑIGUEZ","JAVIER MARTIN ARROYO","RAFAEL MARTINEZ LINARES","ISLA PEINADO HENRIQUEZ","JUAN MARCIAL PORTILLA ZAMBRANO","JAVIER SANCHEZ CARRIZO","VICTOR SANCHEZ GRANDE","ADRIAN TAUSTE SAIZ","MARIO VALVERDE DIAZ - MALAGUILLA","DAVID VALVERDE FERNANDEZ","JAVIER VILLALOBOS PASTOR"};
        List<String>lista=Arrays.asList(alumnos);
        int pesonas;
        Collections.shuffle(lista);
        lista.toArray(alumnos);
        
        //System.out.println(Arrays.toString(alumnos));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("De cauntas personas es cada equipo??");
        pesonas=sc.nextInt();
        
        int i=pesonas;
        int k=1;
        
        for(int j=0; j<alumnos.length; j++){   
            if(i == pesonas){
                System.out.println("\nEquipo "+k);
                k++;
                i=0;
            }
            System.out.println("- "+ alumnos[j]);
            i++;
        }
        
        
    } 
}

