package com.stepicJava.Lesson3_5;

abstract class KeywordAnalyzer implements TextAnalyzer{          //??? processText, чтобы зависел только от getKeywords и getLabe
    // Здесь реализуем processText(), не забываем public
    // Абстрактный защищенный метод String[] getKeywords();
    // Абстрактный защищенный метод Label getLabel();

    int maxLength;
    String [] keywords;




     protected abstract String[] getKeywords();            //Нам незачем показывать эти методы потребителям данного!! класса,
                                                          //поэтому оставим доступ к ним только для наследников.
     protected abstract Label getLabel();                  //  ... protected

                    // protection   - не идет

    @Override
    public Label processText(String text) {

        return Label.OK;
    }
}
