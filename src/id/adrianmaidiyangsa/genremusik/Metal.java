/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.adrianmaidiyangsa.genremusik;

/**
 *
 * @author Beta Three
 */
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artisName){
        System.out.println(artisName+"adalah genre Metal");
    }


    @Override
    public void genreHeavyMetal(String artisName) {
        System.out.println(artisName+"adalah genre Heavy Metal");
    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName+"adalah genre Punk");
    }

    public void genreGrunge(String artisName){
        System.out.println(artisName+"adalah genre Grunge");
    }

    void setArtisName(String dreamTheater) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getArtisName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void genrePopRock(String artisName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void genrePsychedelic(String artisName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void genreProgressive(String artisName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
