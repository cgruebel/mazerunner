/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
//import java.util.Arrays;

/**
 *
 * @author Christian
 * @param <T>
 */
public class ArrayListStack<T> implements StackADT<T>{
    
    private T[] stackArray;
    private int top;
    private static int initCapacity = 500;
    
    /**
     * Default constructor
     */
    public ArrayListStack() {
        this(initCapacity);
    }
   /**
    * 
    * @param capacity 
    */
    public ArrayListStack(int capacity) {
         stackArray = (T[])(new Object[capacity]);
    }
    
/**
* Pushes an element onto the stack.
* @param element element to be pushed
* onto the stack.
*/
    @Override
    public void push(T element) {
        
        stackArray[top] = element;
        top++;
        
    }
/**
* Removes the element at the top of
* the stack.
* @return The element that was removed.
*/
    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Array List Stack");
        }
        T result = stackArray[top-1];
        top--;
        stackArray[top] = null;
        return result;
        
    }
/**
* Checks the element at the top of the
* stack without removing it.
* @return element at the top of the stack.
*/
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()){
            throw new EmptyCollectionException("Array List Stack");
        }
        return stackArray[top-1];
        
    }
/**
* Checks if the stack is empty.
* @return Returns true if the stack is empty.
*/
    @Override
    public boolean isEmpty() {
        if(top == 0){
            return true;
        }
        return false;
        
    }
/**
* Number of elements in the stack.
* @return The number of elements in
* the stack.
*/
    @Override
    public int size() {
        return top;
        
    }
/**
* Returns a string representation of this stack.
* @return a string representation of the stack
*/
    @Override
    public String toString() {
        return "ArrayListStack{" + "stackArray=" + stackArray + ", top=" + top + '}';
    }

    
    
}
