package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] intLeftArr = new Integer[0];
        Integer[] arr;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j< array.length;j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count < maxNumberOfDuplications){
                arr = Arrays.copyOf(intLeftArr,intLeftArr.length+1);
                arr[arr.length-1]=array[i];
                intLeftArr = arr;
            }
            count=0;
        }
        return intLeftArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] remDupExArr = new Integer[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                Integer[] arr = Arrays.copyOf(remDupExArr, remDupExArr.length + 1);
                arr[arr.length-1]=array[i];
                System.out.println(arr[arr.length-1]);
                remDupExArr = arr;
            }
            count=0;
        }
        return remDupExArr;
    }
}
