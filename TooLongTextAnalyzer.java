package com.stepicJava.Lesson3_5;

public class TooLongTextAnalyzer extends KeywordAnalyzer {
    // Приватный int maxLength, заполняемый конструктором
    // Конструктор TooLongTextAnalyzer
    // Реализуем processText(){
    // Если длина текста больше maxLength возвращает TOO_LONG из Label, если меньше OK

    //int maxLength;         перекинули переменную в super!    KeywordAnalyzer

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }



    @Override
    public Label processText(String text) {

        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }

    @Override
    public String[] getKeywords() {          // ????????
        return keywords;
    }

    @Override
    public Label getLabel() {                // ????????
        return Label.TOO_LONG;
    }



}
