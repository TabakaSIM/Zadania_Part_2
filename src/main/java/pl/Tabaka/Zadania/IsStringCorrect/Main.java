package pl.Tabaka.Zadania.IsStringCorrect;

/*
2. Napisz metodę która dostaje jako parametr dowolnego stringa zawierającego okrągłe nawiasy np. “tekst(tekst(tekst))”.
Metoda ma zwracać true albo false w zależności od tego czy wszystkie otwarte nawiasy w tym stringu są zamknięte
i czy nie ma żadnego nawiasu zamykającego jeśli nie był otwarty. Innymi słowy metoda ma sprawdzać czy nawiasy są poprawne.

Przykład:
2+4*(7+8) - true - nawiasy są poprawnie
cos(cos(cos) - false - jeden nawias jest niezamknięty

Idealne rozwiązanie to takie w którym czas działania programu ma złożoność liniową - możecie zastanowić się jak można zrobić to najprościej jak się tylko da.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(isStringCorrect("(tekst()tekst()tekst())"));
    }

    public static boolean isStringCorrect(String string){
        int counter=0;
        for(char c : string.toCharArray()){
            if (c=='('){
                counter++;
                continue;
            }
            if (c==')'){
                counter--;
                if(counter<0){
                    return false;
                }
            }
        }

        return counter==0;
    }
}
