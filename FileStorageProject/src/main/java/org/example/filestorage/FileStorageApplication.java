package org.example.filestorage;

//*********************@author Ganavi M***********************

import org.example.filestorage.screens.WelcomeScreen;

public class FileStorageApplication {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
