/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jolug
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String HOST = "127.0.0.1";
        final int PUERTO = 5000;
        DataInputStream in1;
        DataInputStream in2;
        DataInputStream in3;
        DataInputStream in4;
        DataOutputStream out1;
        DataOutputStream out2;
        DataOutputStream out3;
        DataOutputStream out4;
 
        try {
            Socket st = new Socket(HOST, PUERTO);
 
            in1 = new DataInputStream(st.getInputStream());
            in2 = new DataInputStream(st.getInputStream());
            in3 = new DataInputStream(st.getInputStream());
            in4 = new DataInputStream(st.getInputStream());
            out1 = new DataOutputStream(st.getOutputStream());
            out2 = new DataOutputStream(st.getOutputStream());
            out3 = new DataOutputStream(st.getOutputStream());
            out4 = new DataOutputStream(st.getOutputStream());
 
            //1
            Scanner sc = new Scanner(System.in);
            String mensaje1 = sc.nextLine();
            out1.writeUTF(mensaje1);
 
            String mensajeservidor1 = in1.readUTF();
 
            System.out.println(mensajeservidor1);
            if(mensajeservidor1.equals("Error")){
                System.exit(0);
            }
            //2
            Scanner sc2 = new Scanner(System.in);
            String mensaje2 = sc2.nextLine();
            out2.writeUTF(mensaje2);
 
            String mensajeservidor2 = in2.readUTF();
            
            System.out.println(mensajeservidor2);
            if(mensajeservidor2.equals("Error")){
                System.exit(0);
            }
            //3
            Scanner sc3 = new Scanner(System.in);
            String mensaje3 = sc3.nextLine();
            out3.writeUTF(mensaje3);
 
            String mensajeservidor3 = in3.readUTF();
            
            System.out.println(mensajeservidor3);
            if(mensajeservidor3.equals("Error")){
                System.exit(0);
            }
            //4
            Scanner sc4 = new Scanner(System.in);
            String mensaje4 = sc4.nextLine();
            out4.writeUTF(mensaje4);
 
            String mensajeservidor4 = in4.readUTF();
 
            System.out.println(mensajeservidor4);
            if(mensajeservidor4.equals("Error")){
                System.exit(0);
            }
            
            Boton btn = new Boton();
            btn.setVisible(true);

            st.close();
 
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


