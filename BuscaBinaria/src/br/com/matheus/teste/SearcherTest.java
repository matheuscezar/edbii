package br.com.matheus.teste;

import br.com.matheus.Searcher;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearcherTest {

    private Searcher searcher;

    @org.junit.Before
    public void setUp() throws Exception {
        searcher = new Searcher();
    }

    @Test
    public void retornaMenos1SeArrayEstaVazio(){
        //Arrange
        int [] itens = {};
        //Act
        int pos = searcher.search(itens,10);
        //Assert
        assertEquals(-1, pos);
    }

    @Test
    public void retornaMenos1SeElementoNaoEncontrado(){
        //Arrange
        int [] itens = {10, 20, 30, 40, 50};
        //Act
        int pos = searcher.search(itens,60);
        //Assert
        assertEquals(-1, pos);
    }

    @Test
    public void retornaMenos1SeElementoNEncontrado(){
        //Arrange
        int [] itens = {10, 20, 30, 40, 50};
        //Act
        int pos = searcher.search(itens,10);
        //Assert
        assertEquals(-1, pos);
    }
}