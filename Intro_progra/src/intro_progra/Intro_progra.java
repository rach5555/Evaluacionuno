/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro_progra;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Intro_progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       float salario, sem, ivm, totalEmpleado;
       float totalPagar = 0;
      
       n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
       
       for (int i = 1; i <= n; i++){
           salario = Float.parseFloat(JOptionPane.showInputDialog("ingrese el salario del empleado " + i + ":"));
           
           sem = salario * 0.0925f;
           ivm = salario * 0.0508f;
           
           totalEmpleado = sem + ivm;
           totalPagar = totalPagar + totalEmpleado;
       
       }
       JOptionPane.showMessageDialog(null, "La empresa debe abonar a la CCSS el monto " + totalPagar + " por concepto de sem y ivm");
        
       }
    }
    

