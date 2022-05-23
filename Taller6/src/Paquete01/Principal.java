/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Ciudad;
import Paquete02.Enfermeros;
import Paquete02.Hospital;
import Paquete02.Medicos;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombreH;
        String direccion;
        String ciudad;
        String provincia;
        Medicos[] medicos;
        int numeroM;
        String nombreM;
        double sueldoM;
        String especialidadM;
        Enfermeros[] enfermeros;
        int numeroE;
        String nombreE;
        double sueldoE;
        String tipoE;
        int numeroEs;

        System.out.println("Ingrese el nombre del Hospital");
        nombreH = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        provincia = entrada.nextLine();
        
        Ciudad c1 = new Ciudad(ciudad, provincia);
        
        
        
        System.out.println("Ingrese el numero de médicos que tiene el hospital");
        numeroM = entrada.nextInt();
        medicos = new Medicos[numeroM];
        entrada.nextLine();

        for (int i = 0; i < numeroM; i++) {
            
            System.out.printf("Ingrese el nombre del médico %d\n", i + 1);
            nombreM = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoM = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            especialidadM = entrada.nextLine();

            Medicos m1 = new Medicos(nombreM, sueldoM, especialidadM);

            medicos[i] = m1;
        }

        System.out.println("Ingrese el número de enfermeros(as)");
        numeroE = entrada.nextInt();
        enfermeros = new Enfermeros[numeroE];
        
        entrada.nextLine();

        for (int i = 0; i < numeroE; i++) {
            System.out.printf("Ingrese el nombre del enfermero/a %d\n", i + 1);
            nombreE = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoE = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato que tiene");
            tipoE = entrada.nextLine();

            Enfermeros e1 = new Enfermeros(nombreE, sueldoE, tipoE);

            enfermeros[i] = e1;
            
        }
        numeroEs = numeroM + numeroE;
        
        Hospital entidadHospitalaria = new Hospital (nombreH, direccion, c1, numeroEs, medicos, enfermeros);
        entidadHospitalaria.calcularSueldo();
        
        
        System.out.printf("\n%s\n", entidadHospitalaria);
    }

}
