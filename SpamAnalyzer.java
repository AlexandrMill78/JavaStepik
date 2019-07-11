package com.stepicJava.Lesson3_5;

import java.lang.reflect.Array;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] words;                                     // по наличию указанных ключевых слов в тексте...
    private String [] keywords;                              // нельзя финализировать! private final String[] words;
    // Приватный строчный массив keywords, заполняемый конструктором
    // модификатор // Label processText(String text){
    // возвращает processText(text)

    //private String [] keywords;  // ключевые слова         перекинули переменную в super!    KeywordAnalyzer

    public SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }



    @Override
    public Label processText(String text) {   // ЭТОТ МЕТОД processText НЕ ПЕРЕОПРЕДЕЛЕН если return super.processText(text);
        // если в   String text - есть - []keywords          то return Label.SPAM;
        String[] keywords1 = super.keywords;
        for (int i = 0; i <= keywords1.length - 1; i++){  // проверяем наличие keywords[1]  в  text
            if (text.contains(keywords[i])){
                return Label.SPAM;
            }
        }
        return Label.OK;
    }

    // модификатор // String[] getKeywords(){
    // возвращает keywords;
    @Override
    public String[] getKeywords() {               // ?????????

        return keywords;
    }

    // модификатор // Label getLabel(){
    // возвращает SPAM из Label;
    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
