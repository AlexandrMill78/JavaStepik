package com.stepicJava.Lesson3_5;
import java.lang.CharSequence;
import java.lang.reflect.Array;            // СВОЙ КЛАСС ДОЛЖЕН ОБХОДИТСЯ БЕЗ ЗАГРУЗКИ ДРУГИХ КЛАССОВ
import java.util.Arrays;

public class AsciiCharSequence extends Object implements CharSequence {

    byte [] array;     // ASCII {..0, 23, 127..

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }
    //-----------------------------------------------------


    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));    // конструктор, AsciiCharSequence(byte[] array)
    }

    @Override
    public String toString() {             // yне принимает (byte [] array)       просто переводит в    .toString()
        //return Arrays.toString(array);
        return new String(array);          // класс String уже принимает массив
    }

}


