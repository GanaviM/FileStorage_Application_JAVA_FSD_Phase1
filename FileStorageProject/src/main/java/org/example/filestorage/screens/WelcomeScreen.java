package org.example.filestorage.screens;

//*********************@author Ganavi M***********************

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.example.filestorage.services.DirectoryService;
import org.example.filestorage.services.ScreenService;


public class WelcomeScreen implements Screen {

    private String welcomeText = "Welcome to File Storage Application!";
    private String developerText = "Developer: Ganavi M";
    

    private ArrayList<String> options = new ArrayList<>();


    public WelcomeScreen() {
        options.add("1. All Files");
        options.add("2. File Options");
        options.add("3. Close\n");
        

    }
    
    public void introWS() {
    	System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
       
        
        Show();
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("\n===================================");
    	System.out.println("Main Menu");
    	
        for (String s : options)  {
            System.out.println(s);
           
        }
        System.out.println("Enter the option: ");
        
    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: // Show File Options menu
            	ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();
                
                this.Show();
                
                break;
                        	
                
            default:
                System.out.println("Invalid Option\n");
                break;
        }
        
    }

    public void ShowFiles() {

        //TODO: Get the files from the Directory
    	
    	//Finished TODO Task

        System.out.println("\nList of Files: ");
    	DirectoryService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}
