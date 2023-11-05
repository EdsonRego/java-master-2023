package com.edsonrego.models;

import java.util.Arrays;

public class AplanarArregloBidimensional {
        public static void main(String[] args) {

            String[][] lenguajes = {{"java", "groovy"},
                    {"php"},
                    {"c#", "python", "groovy"},
                    {"java", "javascript", "kotlin"},
                    {"javascript"},
                    {}};

            Arrays.stream(lenguajes)
                    .flatMap(arr -> Arrays.stream(arr))
                    .distinct()
                    .forEach(e -> System.out.println(e));
   }
}
