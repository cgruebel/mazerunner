/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import org.junit.Test;
import static org.junit.Assert.*;
import DataStructures.EmptyCollectionException;

/**
 *
 * @author Christian
 */
public class ArrayListStackTest {
    /**
     * Test constructor, prepares fields for unit tests.
     */
    
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element;
        element = null;
        ArrayListStack instance = new ArrayListStack();
        instance.push(element);
        
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() {
        try{
            System.out.println("pop");
            ArrayListStack instance = new ArrayListStack();
            String expResult;
            expResult = null;
            String result;
            result = (String) instance.pop();
            assertEquals(expResult, result);
        }
        catch(EmptyCollectionException ece){
            assertEquals("The Array List Stack is empty.", ece.getMessage());
            
        }
        
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek(){
        try{
            System.out.println("peek");
            ArrayListStack instance = new ArrayListStack();
            String expResult;
            expResult = null;
            String result;
            result = (String) instance.peek();
            assertEquals(expResult, result);
        }
        catch(EmptyCollectionException ece){
            assertEquals("The Array List Stack is empty.", ece.getMessage());
        }
        
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        boolean expResult = true; 
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        
        
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
    }

    
}
