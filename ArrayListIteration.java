//** WAP a program to iterate with different method and print the values accordingly.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Breaking Bad");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");
        tvSeries.add("Sacred Games#02");
        tvSeries.add("House of Cards");
        tvSeries.add("Orange is New Black");

        //1. Using Java8 with "For Each" loop and "Lambda" expression.
        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        //2. Using "Iterator".
        System.out.println("**************using Iterator************ **");

        Iterator<String> it = tvSeries.iterator();
        while (it.hasNext()) {
            String shows = it.next();
            System.out.println(shows);
        }


        //3. Using Iterator and Java08 Lambda and For Each Reaming () method.

        System.out.println("**************** Printing Using Iterator with Lambda and forEach loop *********************");
        it = tvSeries.iterator();
        it.forEachRemaining(show -> {
            System.out.println(show);
        });

        //4. Using Iterator and Java08 For Each loop.

        System.out.println("**************** Printing Using forEach loop *********************");
        for (String show : tvSeries) {
            System.out.println(show);
        }

        //5.Using ForEach with order Index.
        System.out.println("**************** Printing with ForEach and Order/Index *********************");

        for (int i = 0; i < tvSeries.size(); i++) {
            System.out.println(tvSeries.get(i));

        }

        //6.Using List Iterator() to traverse in both the directions.
        System.out.println("******** PRINTING FROM BACK TO START *********");
        ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
        while (tvSeriesListIterator.hasPrevious()) {
            String shows = tvSeriesListIterator.previous();
            System.out.println(shows);
        }


    }
}
