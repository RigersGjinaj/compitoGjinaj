package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

/**
 * Hello world!
 *
 */
public class Client 
{
    public static void main( String[] args ) throws Exception
    {
        
            Socket s = new Socket("localhost", 3000);
            ServerConnection serverConn = new ServerConnection(s);
            serverConn.start();
        
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            boolean controllo = true;
            System.out.println("lista comandi: \nDigita a per Aggiungere una Persona\nDigita n per Richiesta elenco per nazione \nDigita c per Richiesta elenco completo");
            while (controllo) {
                String command = keyboard.readLine();
                out.println(command);
            }
    }
}
