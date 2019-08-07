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
        int [] itens = {10, 20, 30, 40};
        //Act
        int pos = searcher.search(itens,10);
        int pos1 = searcher.search(itens,20);
        int pos2 = searcher.search(itens,30);
        int pos3 = searcher.search(itens,40);
        //Assert
        assertEquals(0, pos);
        assertEquals(1, pos1);
        assertEquals(2, pos2);
        assertEquals(3, pos3);
    }
}