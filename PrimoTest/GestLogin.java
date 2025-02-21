/* Scrivi un programma Java che permetta all'utente di 
registrarsi(Nome, Pass, risposta a domanda segreta [ a vostra scelta])  
/ Loggarsi e modificare i propri dati, per modificare i dati devi rispondere alla 
domanda segreta e poi reimpostarla.  */

import java.util.ArrayList;
import java.util.Scanner;

public class GestLogin {
    public static void main(String[] args) {
        
        ArrayList<String> utente = new ArrayList<>();
        
        register(utente); // faccio registrare l'utente

        boolean logged = login(utente); // login dell'utente

        modificaDati(utente); // modifica dati utente
        
    }

    public static void register(ArrayList<String> utente){
        // creazione scanner
        Scanner myStringScanner = new Scanner(System.in);
        // variabili ausiliare per dati utente
        String nome = "";
        String pass = "";
        String risposta = "";
        // richiesta nome
        do{
            System.out.println("Inserisci il tuo nome: ");
            nome = myStringScanner.nextLine().trim();
            if(nome.isEmpty()){
                System.out.println("Inserisci un nome valido, riprova");
            }

        }while(nome.isEmpty());
        // richiesta password
        do{
            System.out.println("Inserisci la password: ");
            pass = myStringScanner.nextLine().trim();
            if(pass.isEmpty()){
                System.out.println("Inserisci una password valida, riprova");
            }

        }while(pass.isEmpty());
        // richiesta risposta a domanda segreta
        do{
            System.out.println("Inserisci la risposta alla domanda segreta: ");
            risposta = myStringScanner.nextLine().trim();
            if(risposta.isEmpty()){
                System.out.println("Inserisci una risposta valida, riprova");
            }

        }while(risposta.isEmpty());

        // aggiungo utente
        utente.add(nome);
        utente.add(pass);
        utente.add(risposta);
        // chiusura scanner
        myStringScanner.close();
    }
    // per login utente
    public static boolean login(ArrayList<String> utente){
        // creazione scanner string
        Scanner myStringScanner = new Scanner(System.in);
        boolean logged= false; // controllo per logged non logged
        // ausiliari per dati utente
        String nome="";
        String pass="";

        // finche non è loggato
        do{
            // richiesta nome
            do{
                System.out.println("Inserisci il tuo nome: ");
                nome = myStringScanner.nextLine().trim();
                if(!nome.equals(utente.get(0))){
                    System.out.println("Inserisci un nome valido, riprova");
                }
    
            }while(!nome.equals(utente.get(0)));
            // richiesta password
            do{
                System.out.println("Inserisci la password: ");
                pass = myStringScanner.nextLine().trim();
                if(!pass.equals(utente.get(1))){
                    System.out.println("Password errata, riprova");
                }
    
            }while(!pass.equals(utente.get(1)));

            logged = true;

        }while(!logged);
        // chiusura scanner
        myStringScanner.close();
        return logged;
    }
    public static void modificaDati(ArrayList<String> utente){
        // scanner per dati utente
        Scanner myStringScanner = new Scanner(System.in);
        
        // ausiliare per risposta a domanda segreta
        String risposta = "";
        System.out.println("per modificare i dati inserisci la risposta segreta");
        // richiesta risposta
        do{
            System.out.println("inserisci la risposta segreta: ");
            risposta = myStringScanner.nextLine().trim();
            if(!risposta.equals(utente.get(2))){
                System.out.println("Risposta errata");
            }

        }while(!risposta.equals(utente.get(2))); // finche non inserisce la risposta giusta

        System.out.println("adesso puoi modificare i tuoi dati: ");
        // puo modificare i dati gli faccio inserire tutto di nuovo facendo ripartire register
        register(utente);
        // chiusura scanner
        myStringScanner.close();
    }
}
