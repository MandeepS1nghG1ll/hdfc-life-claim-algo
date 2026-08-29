package com.hdfclife.store;

import com.hdfclife.exception.InvalidIndexException;
import com.hdfclife.exception.StoreFullException;

public class ClaimAmountStore {
    private int[] data;
    private int size;

    public ClaimAmountStore() {
        data = new int[16];
        size = 0;
    }

    public void add(int amount){
        if(size == data.length){
            throw new StoreFullException("Store is full");
        }

        data[size] = amount;
        size++;
    }

    public int insert(int index, int amount){
        if (index>size || index<0){
            throw new InvalidIndexException("Index number invalid: "+index);
        }
        if(size == data.length){
            throw new StoreFullException("Store is full");
        }

        int shift = size - index;

        for (int i=size;i>index;i--){
            data[i] = data[i - 1];   // the current index will have the value of the left index, till the target index
        }

        data[index] = amount;
        size++;

        return shift;
    }

    public void delete(int index){

        if (index>size || index<0){
            throw new InvalidIndexException("Index number invalid: "+index);
        }

        for (int i=index;i<size-1;i++){
            data[i] = data[i + 1];   // the current index will have the value of the left index, till the target index
        }
        size--;

    }

    public int[] toArray(){
        int[] res = new int[size];

        for (int i=0;i<size;i++){
            res[i] = data[i];
        }
        return res;
    }
}
