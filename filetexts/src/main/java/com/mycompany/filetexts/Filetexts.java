/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.filetexts; 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KIIT
 */
public class Filetexts {
    
    public static void createFolder(String file_path){
    
        File obj=new File(file_path);
        if(obj.mkdir())
        System.out.println("File created : "+file_path);
        else
            System.out.println(file_path+" already exists !");
    }
    public static void exist(String file_path){
        File obj=new File(file_path);
    System.out.println(file_path+" exists : "+obj.exists());
    }
    public static void renameFolder(String old_path,String new_path){
    File oldFolder=new File(old_path);
    File newFolder=new File(new_path);
    
    if(oldFolder.exists()){
    oldFolder.renameTo(newFolder);
    System.out.println("Folder "+old_path+" renamed to "+new_path);
    }
    }
    public static void del_folder(String file_path){
    File file=new File(file_path);
    if(file.exists()){
        for(File file1 : file.listFiles()){
        file1.delete();
        }
    file.delete();
    System.out.println("File path : "+file_path+" deleted !");
    }
    }
    public static void create_file(String file_path){
        try {
            File obj=new File(file_path);
            if(obj.createNewFile()){
                System.out.println("File is created !");
            }
            else{
                System.out.println("File already exists !");
            }   } catch (IOException ex) {
            Logger.getLogger(Filetexts.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void writeFile(String file_path){
    FileWriter fw=null;
        try {
            fw = new FileWriter(file_path);
            if(new File(file_path).exists()){
                fw.write("Hello !");
                System.out.println("Written into the file !");
            }
            else{
                System.out.println("File does not exist !");
            }  
        } catch (IOException ex) {
            Logger.getLogger(Filetexts.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Filetexts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void read_file(String file_path){
        File file;
        Scanner scan=null;
        try {
            file=new File(file_path);
            scan=new Scanner(file);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line); 
            }   } catch (FileNotFoundException ex) {
            Logger.getLogger(Filetexts.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try{
        scan.close();
            }
            catch(NullPointerException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
     //Filetexts.createFolder("C:\\Myfiles");
     //Filetexts.renameFolder("C:\\Myfiles" , "C:\\Files");
    // Filetexts.create_file("C:\\Myfiles\\open.txt");
    // Filetexts.writeFile("C:\\Myfiles\\open.txt");
     Filetexts.read_file("C:\\Myfiles\\open.txt");
    }
}
