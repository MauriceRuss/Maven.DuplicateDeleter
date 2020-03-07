package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] intLeftArr = new String[0];
        String[] arr;
        int count = 0;
        for (String value : array) {
            for (String s : array) {
                if (value.equals(s)) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications) {
                arr = Arrays.copyOf(intLeftArr, intLeftArr.length + 1);
                arr[arr.length - 1] = value;
                intLeftArr = arr;
            }
            count = 0;
        }
        return intLeftArr;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] remDupExArr = new String[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count != exactNumberOfDuplications){
                String[] arr = Arrays.copyOf(remDupExArr, remDupExArr.length + 1);
                arr[arr.length-1]=array[i];
                System.out.println(arr[arr.length-1]);
                remDupExArr = arr;
            }
            count=0;
        }
        return remDupExArr;
    }
}
