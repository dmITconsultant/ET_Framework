/*
 * ET_Framework - JavaSocketThread.java
 * 
 */
package et_framework.ObjectModel;

import java.net.*;
import java.io.*;

/**
 *
 * @author Daniel Martin
 */
public class JavaSocketThread extends Thread {
    /*
     * OBJECT ATTRIBUTES
     */
    private Socket         theSocket;
    private BufferedReader in;
    private PrintWriter    out;
        
    /*
     * CONSTRUCTOR
     */
    public JavaSocketThread(){
        
    }
    
    /*
     * IMPLEMENT RUNNABLE
     */
    @Override
    public void run(){
        
    }
}
