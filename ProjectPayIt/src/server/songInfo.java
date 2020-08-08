/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class songInfo {
    public static String ReadTextFile(String ReqSong)
    {
       
        try{
            BufferedReader in = new BufferedReader(new FileReader("SongNames.txt"));
            String line = null;
            
            while((line = in.readLine()) != null)
            {
                if((line = in.readLine()).equals(ReqSong))
                {
                    return "Song Found";
                }
                
                else 
                {
                //return "Song not found";
                }
           
            }
        return "Song not found";
        }
  

        catch(Exception e)
        {
            return e.getMessage();
            
        }
       
        
    }
    
    public static void main(String[] args)throws Exception
    {
        
    } 
}