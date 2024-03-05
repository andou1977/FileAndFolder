package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        FileAndFolderOrganisation fileAndFolderOrganisation = new FileAndFolderOrganisation();
        fileAndFolderOrganisation.createfolder();
        fileAndFolderOrganisation.createfile();
        fileAndFolderOrganisation.listfichier();
        fileAndFolderOrganisation.ecriredanslefichier();
        fileAndFolderOrganisation.lire();
        fileAndFolderOrganisation.verifyifexistfile();
        System.out.println(fileAndFolderOrganisation.absolutpathconverter());

    }
}
