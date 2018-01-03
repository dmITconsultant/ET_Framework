/*
 * ET_Framework - JavaSocketClient
 * This needs to be a called object
 *   getting a String and
 *   returning a String.
 */
package et_framework.ObjectModel;

import java.net.*;
import java.io.*;

/**
 *
 * @author Daniel Martin
 */
public class JavaSocketClient {
    
    private int            thePort = 17001;
    private Socket         theSocket = null;
    private BufferedReader theReader = null;
    private PrintWriter    theWriter = null;
    
    /*
     * CONSTRUCTOR
     */
    public void JavaSocketClient(){
        
    }
    
    /* Initialization and Starting */
    public String init(String messageOUT){
        
        String messageBACK = null;
        
        return messageBACK;
    }
    
    /* Stopping                    */
    public void stop(){
        
    }
    
    
    /*
     * TEST METHOD
     */
    public static void main(String args[]){
        
    }
}
