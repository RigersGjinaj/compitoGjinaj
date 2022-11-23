package com.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class GestioneClient extends Thread {
    
    private Socket s;
    private ArrayList <GestioneClient> collegati;
    private ArrayList <Persona> persone = new ArrayList<>();
    PrintWriter pr;
    BufferedReader br;


    public GestioneClient(Socket s, ArrayList <GestioneClient> collegati){
        this.s=s;
        this.collegati=collegati;
        try {
            pr = new PrintWriter(s.getOutputStream(), true);
            br =  new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    public void run() {
        String richiesta = "";
        boolean controllo= true;

        
        

        while(controllo){
            try{
            richiesta = br.readLine();
            if(richiesta.equalsIgnoreCase("a")){
              pr.println("Dimmi il nome");
              String nome = br.readLine();
              pr.println("Dimmi cognome");
              String cognome = br.readLine();
              pr.println("Dimmi la nazione di residenza");
              String nazione = br.readLine();
              
              Persona p = new Persona();

              p.setNome(nome);
              p.setCognome(cognome);
              p.setNazioneDiResidenza(nazione);

              persone.add(p);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
}
