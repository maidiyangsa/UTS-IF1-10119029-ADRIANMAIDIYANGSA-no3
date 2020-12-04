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
public class BlackMetal extends Metal{
    public void genreBlackMetal(String artisName){
        System.out.println(artisName+"adalah genre Black Metal");
    }

    @Override
    void setArtisName(String behemoth) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
