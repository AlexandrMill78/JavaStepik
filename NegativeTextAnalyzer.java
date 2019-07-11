package com.stepicJava.Lesson3_5;

public class NegativeTextAnalyzer extends KeywordAnalyzer{

    // Приватный строчный массив keywords ":(", "=(", ":|";
    // getKeywords() и getLabel() реализуем по примеру SpamAnalyzer


    public NegativeTextAnalyzer() {         // ! В КОНСТРУКТОРЕ ПЕРЕМЕННАЯ УКАЗЫВАЕТСЯ С ТИПОМ ДАННЫХ !

    }

    @Override
    public Label processText(String text) {
        // если в   String text - есть - []keywords          то return Label.SPAM;
        String [] keywords = {":(", "=(", ":|"};

        for (int i = 0; i <= keywords.length - 1; i++){  // проверяем наличие keywords[1]  в  text
            if (text.contains(keywords[i])){
                return Label.SPAM;
            }
        }
        return Label.OK;
    }

    @Override
    public String[] getKeywords() {

        return keywords;
    }

    @Override
    public Label getLabel() {

        return Label.NEGATIVE_TEXT;
    }
}
