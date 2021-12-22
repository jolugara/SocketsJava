/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jolug
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket servidor = null;
        Socket st = null;
        DataInputStream in1;
        DataInputStream in2;
        DataInputStream in3;
        DataInputStream in4;
        DataInputStream in5;
        DataOutputStream out1;
        DataOutputStream out2;
        DataOutputStream out3;
        DataOutputStream out4;
        DataOutputStream out5;
 
        final int PUERTO = 5000;
 
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true) {
 
                st = servidor.accept();
 
                System.out.println("Cliente conectado");
                in1 = new DataInputStream(st.getInputStream());
                in2 = new DataInputStream(st.getInputStream());
                in3 = new DataInputStream(st.getInputStream());
                in4 = new DataInputStream(st.getInputStream());
                in5 = new DataInputStream(st.getInputStream());
                out1 = new DataOutputStream(st.getOutputStream());
                out2 = new DataOutputStream(st.getOutputStream());
                out3 = new DataOutputStream(st.getOutputStream());
                out4 = new DataOutputStream(st.getOutputStream());
                out5 = new DataOutputStream(st.getOutputStream());
 
                //1
                String mensaje1 = in1.readUTF();
 
                System.out.println(mensaje1); 
                
                if(mensaje1.equals("¿Quién es?")){
                    out1.writeUTF("Soy yo");
                }else{
                    out1.writeUTF("Error");
                    System.exit(0);
                }
                //2
                String mensaje2 = in2.readUTF();
 
                System.out.println(mensaje2); 
                
                if(mensaje2.equals("¿Qué vienes a buscar?")){
                    out2.writeUTF("A ti");
                }else{
                    out2.writeUTF("Error");
                    System.exit(0);
                }
                //3
                String mensaje3 = in3.readUTF();
 
                System.out.println(mensaje3); 
                
                if(mensaje3.equals("Ya es tarde")){
                    out3.writeUTF("¿Por qué?");
                }else{
                    out3.writeUTF("Error");
                    System.exit(0);
                }
                //4
                String mensaje4 = in4.readUTF();
 
                System.out.println(mensaje4); 
                
                if(mensaje4.equals("Porque ahora soy yo la que quiere estar sin ti")){
                    out4.writeUTF("Por eso vete, olvida mi nombre, mi cara, mi casa y pega la vuelta");
                }else{
                    out4.writeUTF("Error");
                    System.exit(0);
                }

                st.close();
                System.out.println("Cliente desconectado");
 
            }
 
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
}
