/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author ashif
 * @param <T>
 */
public interface Array<T> {

    public abstract T[] getArray();

    public abstract T getItem(int index);

    public abstract void deleteItem();

    public abstract void deleteItem(int index);

    public abstract int getSize();

}
