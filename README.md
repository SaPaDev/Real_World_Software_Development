# Real World Software Development

## Chapter 2. The Bank Statements Analyzer [Book](https://learning.oreilly.com/library/view/real-world-software-development/9781491967164/ch02.html#idm45816839449976)

### The Challenge
Mark Erbergzuck gibt ein Menge-Geld für seine Einkäufe aus. Gern würde ein Tool besitzen welches
alle Ausgaben automatisch zusammenfasst.

Die monatlichen Kontoauszüge die Mark von seiner Bank erhält, erscheinen ihm aber etwas unübersichtlich. 
Es soll eine SW entwickelt werden welche diese Kontoauszüge Verarbeitet und Mark dabei hilf diese
besser lesen zu können.

### The Goal

- _Singel Responsibility Principle (SRP)_
- Einfache Klassen erstellen
- _cohesion_
- _coupling_

### Bank Statements Analyzer Requirements

- Der Analyser muss nur ein Text File einlesen.
- Das Text File beinhaltet eine Liste von Banktransaktionen.
- Text File ist ein CSV File.

__Welche Fragen sollen mit der SW beantwortet werden__

- Wie hoch ist der Gesamtgewinn bzw. -verlust aus einer Liste von Kontoauszügen? Ist sie positiv oder negativ?

- Wie viele Bankgeschäfte gibt es in einem Monat?

- Was sind seine Top–10-Ausgaben?

- Für welche Kategorie gibt er den grössten Teil seines Geldes aus?

__1. Challenge: Wie hoch ist der Gesamtgewinn bzw. -verlust aus einer Liste von Kontoauszügen? Ist sie positiv oder negativ?__l

1.) Das CSV File muss eingelesen werden und die Summe aller Ein- und Ausgaben berechnet werden.