/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar2876
 */
public class Basico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio9();
    }
    public static void ejercicio1() {
        Scanner num1= new Scanner(System.in);
        System.out.println("Primer número");
        int n1= num1.nextInt();
        Scanner num2= new Scanner(System.in);
        System.out.println("Segundo número");
        int n2= num2.nextInt();
        System.out.println("Suma =" + (n1+n2));
        System.out.println("Resta =" + (n1-n2));
        System.out.println("Residuo =" +(n1%n2));
    }
    public static void ejercicio2() {
        
    }
    public static void ejercicio3() {
        int notaMusi;
        notaMusi=Integer.parseInt(JOptionPane.showInputDialog(null,"Número de 1 al 7"));
        switch (notaMusi){
        case 1: 
                    System.out.println(notaMusi+"= DO");
                    break;   
        case 2: 
                    System.out.println(notaMusi+"= Re");
                    break;
        case 3: 
                    System.out.println(notaMusi+"= Mi");
                    break;
        case 4: 
                    System.out.println(notaMusi+"= Fa");
                    break;
        case 5: 
                    System.out.println(notaMusi+"= Sol");
                    break;
        case 6: 
                    System.out.println(notaMusi+"= La");
                    break;
        case 7: 
                    System.out.println(notaMusi+"= Si");
                    break;
        default:
                    System.out.println("no se econtraron coincidencias");
        }
       
        
    }
    public static void ejercicio4() {
        int secu;
        secu=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));
        for (int i=0;i<=secu;i++){
            System.out.println(i);}
    }
    public static void ejercicio5() {
     int secu;
        secu=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));
        for (int i=0;i<=secu;i=i+3){
            System.out.println(i);}   
    }
    public static void ejercicio6() {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));
        if(num%2==0){System.out.println("N="+num+"  es par");}
        else System.out.println("N="+num+"  es impar");
    }
    public static void ejercicio7() {
        int limi;
        int f1=0,f2=1,f3=1,f4;
        limi=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));
        
        System.out.println("0");
         System.out.println(f1);
        System.out.println(f2);
        
        while (f3<=limi) {
            System.out.println(f3);
            f4=f2+f3;
            f2=f3;
            f3=f4;
            }
    }
    public static void ejercicio8() {
        
        String acept = "p12";
        
        int c=3;
    for(c=3;c>0;c--){
        String clav=JOptionPane.showInputDialog(null,"Ingrese su contraseña:","Intentos restantes= "+c,JOptionPane.INFORMATION_MESSAGE);
            if(clav.equals(acept)){
            JOptionPane.showMessageDialog(null,"Acceso permitido");
            break;
       }
        else{       
       JOptionPane.showMessageDialog(null,"Acceso denegado");}
               
        }
    if(c==0){JOptionPane.showMessageDialog(null,"Clave Bloqueada");}
    
    }
    public static void ejercicio9() {
        //transformar un numero decimal a romano <=100
        int roma;
        roma=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un número entero positivo"));
        	int M, c, d, u;
	
	M = (roma/1000)% 10;
	c = (roma/100) % 10;
    d = (roma/10) % 10;
	u = (roma/1) % 10;
	if (roma>3000) System.out.println("No se puede con numero mayores a 3 Mil");
	else{
	System.out.print("El numero= ");
	System.out.println(roma);
	System.out.print("En Romano se escribe= ");
	switch (M){
			case 1:
			System.out.print("M");
			break;
			case 2:
			System.out.print("MM");
			break;
			case 3:
			System.out.print("MMM");
			break;
	}
	switch (c){
			case 1:
			System.out.print("C");
			break;
			case 2:
			System.out.print("CC");
			break;
			case 3:
			System.out.print("CCC");
			break;
			case 4:
			System.out.print("CD");
			break;
			case 5:
			System.out.print("D");
			break;
			case 6:
			System.out.print("DC");
			break;
			case 7:
			System.out.print("DCC");
			break;
			case 8:
			System.out.print("DCCC");
			break;
			case 9:
			System.out.print("CM");
			break;
	}
	switch (d){
			case 1:
			System.out.print("X");
			break;
			case 2:
			System.out.print("XX");
			break;
			case 3:
			System.out.print("XXX");
			break;
			case 4:
			System.out.print("XL");
			break;
			case 5:
			System.out.print("L");
			break;
			case 6:
			System.out.print("LX");
			break;
			case 7:
			System.out.print("LXX");
			break;
			case 8:
			System.out.print("LXXX");
			break;
			case 9:
			System.out.print("XC");
			break;
	}
	switch (u){
			case 1:
			System.out.print("I");
			break;
			case 2:
			System.out.print("II");
			break;
			case 3:
			System.out.print("III");
			break;
			case 4:
			System.out.print("IV");
			break;
			case 5:
			System.out.print("V");
			break;
			case 6:
			System.out.print("VI");
			break;
			case 7:
			System.out.print("VII");
			break;
			case 8:
			System.out.print("VIII");
			break;
			case 9:
			System.out.print("IX");
			break;
	}
	}
        System.out.print("         ");
	
    }
}
