package com.stepicJava;

import com.stepicJava.Lesson3_5.*;

/**
 * Stepic testing tasks
 */
public class Main {


    public static Label main(String[] args) {

        //----------------------------------- checkLabels ------------------------------------------------------------

//        public Label checkLabels(TextAnalyzer[] analyzers, String text) {       // return OK if all analyzers return OK
//
//            return Label.OK;
//        }

        String[] spamKeywords = {"bad", "spam"};                                         // Слова, относящиеся к спаму
        int commentMaxLength = 40;                                                      // Максимальная длина строки
        String s = "This spam";                                                         // Тестируемая строка

        TextAnalyzer[] textAnalyzers = {                                    // Массив, подаваемый на вход checkLabels()
                new SpamAnalyzer(spamKeywords),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(commentMaxLength)
        };

        public Label checkLabels (TextAnalyzer[] analyzers, String text){ // Для удобства тестирования checkLabels() делаем временно static
            // Здесь перебираем массив analyzers и подставляем processText(text)
            for (int i = 0; i <= analyzers.length; i++) {
                if (analyzers[i].processText(s) != Label.OK){            // один из Analyzers выдает СПАМ
                    return analyzers[i].processText(text);
                }
            }
            return Label.OK;
        }

        System.out.println(checkLabels(textAnalyzers, s)); // На выходе SPAM, так как String s содержит ключевое слово "spam" из spamKeywords
    }







        //---------------------------- Test checkLabels ---------------------
//        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(5);
//        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
//        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"haha", "Maxim"});
//
//        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "text etxt"));
//        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "text"));
//        System.out.println(checkLabels(new TextAnalyzer[]{tooLongTextAnalyzer, negativeTextAnalyzer}, "te:("));
//        System.out.println(checkLabels(new TextAnalyzer[]{spamAnalyzer, negativeTextAnalyzer}, "Maximt("));












        //----------------------------------- integrate ------------------------------------------------------------
//        //import java.util.function.DoubleUnaryOperator;
//
//        System.out.println(integrate(f -> 1, 0, 9));//10.0
//        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
//        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
//
//    }
//    //-------------------------- integrate Lesson3.5 -------------------------------------------------------------------
//    public static double integrate(DoubleUnaryOperator f, double a, double b){
//        double e = 1.0e-7;
//        double n = (b - a)*e;                            // шаг сетки
//        double squere = 0;
//
//        for (double i = a; i < b; i += n){
//            squere += f.applyAsDouble(i) * n;
//        }
//        return squere;
//    }




}