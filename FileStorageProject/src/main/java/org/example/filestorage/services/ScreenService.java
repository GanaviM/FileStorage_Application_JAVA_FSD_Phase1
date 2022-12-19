package org.example.filestorage.services;

//*********************@author Ganavi M***********************


import org.example.filestorage.entities.Directory;
import org.example.filestorage.screens.FileOptionsScreen;
import org.example.filestorage.screens.Screen;
import org.example.filestorage.screens.WelcomeScreen;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
