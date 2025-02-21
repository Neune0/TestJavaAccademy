/* Scrivi un programma Java che permetta all'utente di 
registrarsi(Nome, Pass, risposta a domanda segreta [ a vostra scelta])  
/ Loggarsi e modificare i propri dati, per modificare i dati devi rispondere alla 
domanda segreta e poi reimpostarla.  */

import java.util.ArrayList;
import java.util.Scanner;

public class GestLogin {
    public static void main(String[] args) {
        
        ArrayList<String> utente = new ArrayList<>();
        
        register(utente);

        boolean logged = login(utente);

        modificaDati(utente);
        
    }

    public static void register(ArrayList<String> utente){
        Scanner myStringScanner = new Scanner(System.in);
        String nome = "";
        String pass = "";
        String risposta = "";
        do{
            System.out.println("Inserisci il tuo nome: ");
            nome = myStringScanner.nextLine().trim();
            if(nome.isEmpty()){
                System.out.println("Inserisci un nome valido, riprova");
            }

        }while(nome.isEmpty());

        do{
            System.out.println("Inserisci la password: ");
            pass = myStringScanner.nextLine().trim();
            if(pass.isEmpty()){
                System.out.println("Inserisci una password valida, riprova");
            }

        }while(pass.isEmpty());

        do{
            System.out.println("Inserisci la risposta alla domanda segreta: ");
            risposta = myStringScanner.nextLine().trim();
            if(risposta.isEmpty()){
                System.out.println("Inserisci una risposta valida, riprova");
            }

        }while(risposta.isEmpty());

        myStringScanner.close();
    }
    public static boolean login(ArrayList<String> utente){
        Scanner myStringScanner = new Scanner(System.in);
        boolean logged= false;
        String nome="";
        String pass="";
        
        do{
            do{
                System.out.println("Inserisci il tuo nome: ");
                nome = myStringScanner.nextLine().trim();
                if(!nome.equals(utente.get(0))){
                    System.out.println("Inserisci un nome valido, riprova");
                }
    
            }while(!nome.equals(utente.get(0)));
    
            do{
                System.out.println("Inserisci la password: ");
                pass = myStringScanner.nextLine().trim();
                if(!pass.equals(utente.get(1))){
                    System.out.println("Password errata, riprova");
                }
    
            }while(!pass.equals(utente.get(1)));

            logged = true;

        }while(!logged);
        myStringScanner.close();
        return logged;
    }
    public static void modificaDati(ArrayList<String> utente){
        Scanner myStringScanner = new Scanner(System.in);
        String risposta = "";
        System.out.println("per modificare i dati inserisci la risposta segreta");
        do{
            System.out.println("inserisci la risposta segreta: ");
            risposta = myStringScanner.nextLine().trim();
            if(!risposta.equals(utente.get(2))){
                System.out.println("Risposta errata");
            }

        }while(!risposta.equals(utente.get(2)));

        System.out.println("adesso puoi modificare i tuoi dati: ");
        register(utente);
    }
}
