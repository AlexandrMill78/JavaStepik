package com.stepicJava.Lesson3_5;

public interface TextAnalyzer {

    Label processText(String text);     // method of interface TextAnalyzer.   заглушка интерфейса
}                                       // ПО РЕЗУЛЬТАТУ ПРОВЕРКИ   String text   ВОЗВРАЩАЕТ   Label. ...

// метод processText интерфейса берет исходный текст и возвращает одну из меток, когда находит требуемое
