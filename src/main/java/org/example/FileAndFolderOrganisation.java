package org.example;


import java.io.*;
import java.nio.file.*;

public class FileAndFolderOrganisation {
//create a folder
    public void createfolder(){
        Path chemin= Paths.get("C:\\Users\\Genius\\IdeaProjects\\FileAndFolder\\src\\main\\java\\org\\example\\TheFolder");
      try{
    Files.createDirectory(chemin);
      }catch(FileAlreadyExistsException e){
          System.out.println("Fichier existe deja");
      }catch(IOException e){
          System.out.println("probleme de creation du folder");
      }

    }
    //create a file
    public void createfile(){
        Path chemin=Paths.get("C:\\Users\\Genius\\IdeaProjects\\FileAndFolder\\src\\main\\java\\org\\example\\TheFolder\\myfile.txt");
   try{
       Files.createFile(chemin);
   }catch(FileAlreadyExistsException e){
       System.out.println("Fichier existe deja");
   }catch(IOException e){
       System.out.println("probleme de creation du fichier");
   }
    }

    //list all file that exist in folder
    public void listfichier(){
        Path chemin=Paths.get("C:\\Users\\Genius\\IdeaProjects\\FileAndFolder\\src\\main\\java\\org\\example\\TheFolder");

        try(DirectoryStream<Path>mypath=Files.newDirectoryStream(chemin)){
            System.out.println("voila la liste des fichiers");
            for(Path f:mypath){
                System.out.println(f.getFileName());
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }



        }
    //write in file
    public void ecriredanslefichier(){
        String chemins="C:\\Users\\Genius\\IdeaProjects\\FileAndFolder\\src\\main\\java\\org\\example\\TheFolder\\myfile.txt";
        try(FileWriter f=new FileWriter(chemins,true)){
            BufferedWriter bf=new BufferedWriter(new FileWriter(chemins));
            bf.write("My first text");
            bf.newLine();
            bf.write("My Second text");
            bf.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void lire(){
        String chemins="C:\\Users\\Genius\\IdeaProjects\\FileAndFolder\\src\\main\\java\\org\\example\\TheFolder\\myfile.txt";
        try{
            BufferedReader reader=new BufferedReader(new FileReader(chemins));
            String line;
            for(int i=0;(line=reader.readLine())!=null;i++){
                System.out.println("line :"+i+" "+line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
