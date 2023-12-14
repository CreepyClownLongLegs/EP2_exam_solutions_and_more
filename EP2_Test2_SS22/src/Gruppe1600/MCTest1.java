package Gruppe1600;
// Bitte beantworten Sie die Multiple-Choice-Fragen (maximal 25 Punkte, 1 Punkt pro 'Choice').

public class MCTest1 {

    // Wenn 'answer' in 'new Choice(...)' für davor stehende 'question' zutrifft, 'valid' bitte auf 'true' ändern.
    // Sonst 'valid' auf 'false' belassen.
    // Kommentare wirken sich nicht auf die Beurteilung aus.
    // Bitte sonst nichts ändern. Zur Kontrolle MCTest1 ausführen.
    public static void main(String[] args) {
        checkAndPrint(

                new Question(
                        "Welche der folgenden Aussagen gelten in Java für die unterschiedlichen\n" +
                        "Arten von Variablen und Parametern?",

                        new Choice(false, "Objektvariablen können lokale Variablen verdecken.                            (1A)"),
                        new Choice(false, "Objektvariablen werden automatisch vorinitialisiert.                          (1B)"),
                        new Choice(false, "Klassenvariablen werden ohne 'static' deklariert.                             (1C)"),
                        new Choice(false, "Parameter und lokale Variablen dürfen gleich heißen.                          (1D)"),
                        new Choice(false, "Objektvariablen sollen nicht 'public' sein.                                   (1E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
                        "Datenstrukturen und abstrakten Datentypen?",

                        new Choice(false, "Datenstrukturen legen die Typen ihrer Einträge fest.                          (2A)"),
                        new Choice(false, "Datenstrukturen beschreiben, wie Operationen auf Daten zugreifen.             (2B)"),
                        new Choice(false, "Abstrakte Datentypen beschreiben vorwiegend Algorithmen.                      (2C)"),
                        new Choice(false, "Abstrakte Datentypen müssen verwendete Algorithmen festlegen.                 (2D)"),
                        new Choice(false, "Abstrakte Datentypen müssen bestimmte Datenstrukturen festlegen.              (2E)")
                ),

                new Question(
                        "Welche der folgenden Aussagen stimmen in Bezug auf rekursive Datenstrukturen?",

                        new Choice(false, "Schleifen erlauben kein vollständiges Traversieren.                           (3A)"),
                        new Choice(false, "Zur Fundierung wird meist 'null' verwendet.                                   (3B)"),
                        new Choice(false, "Fortschritt erfolgt durch induktiven Aufbau und Dereferenzierung.             (3C)"),
                        new Choice(false, "Zur Fundierung können spezielle Knoten verwendet werden.                      (3D)"),
                        new Choice(false, "Doppelt verkettete Listen sind in beide Richtungen traversierbar.             (3E)")
                ),

                new Question(
                        "J sei ein Referenztyp (Klasse oder Interface), und\n" +
                        "g sei eine Variable eines Referenztyps mit 'g != null'.\n" +
                        "Welche der folgenden Aussagen treffen für alle J und g zu?",

                        new Choice(false, "Liefert '(J)g' einen Laufzeitfehler, dann gilt 'g instanceof J'.              (4A)"),
                        new Choice(false, "Gilt 'g.getClass() == J.class', dann ist J ein Interface.                     (4B)"),
                        new Choice(false, "'J.class' liefert die interne Repräsentation von J.                           (4C)"),
                        new Choice(false, "Aus 'g instanceof J' folgt: 'g.getClass() != J.class'.                        (4D)"),
                        new Choice(false, "Gilt 'g instanceof J', dann ist J eine Klasse.                                (4E)")
                ),

                new Question(
                        "z sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
                        "ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
                        "    STree z = new STree(); z.add(6); z.add(8); z.add(2);\n" +
                        "Welche der folgenden Aussagen treffen auf z zu?",

                        new Choice(false, "Der Knoten mit Wert 2 ist Kind von dem mit Wert 6.                            (5A)"),
                        new Choice(false, "Der Knoten mit Wert 8 ist Elter von dem mit Wert 6.                           (5B)"),
                        new Choice(false, "Der Knoten mit Wert 6 ist die Wurzel.                                         (5C)"),
                        new Choice(false, "Der Baum ist perfekt ausbalanciert.                                           (5D)"),
                        new Choice(false, "Der Knoten mit Wert 8 ist ein Blattknoten.                                    (5E)")
                )
        );
    }

// Ende der Multiple-Choice-Fragen

//------------------------------------------------------------
// Bitte lassen Sie den Rest der Datei unverändert.
// Please do not edit below this line.

    private static final String EXPECT = // nochmals die gleichen Fragen zur Selbstkontrolle 
            " 1. Welche der folgenden Aussagen gelten in Java für die unterschiedlichen\n" +
            "    Arten von Variablen und Parametern?\n" +
            "    \n" +
            "    XXXXXXXXX Objektvariablen können lokale Variablen verdecken.                            (1A)\n" +
            "    XXXXXXXXX Objektvariablen werden automatisch vorinitialisiert.                          (1B)\n" +
            "    XXXXXXXXX Klassenvariablen werden ohne 'static' deklariert.                             (1C)\n" +
            "    XXXXXXXXX Parameter und lokale Variablen dürfen gleich heißen.                          (1D)\n" +
            "    XXXXXXXXX Objektvariablen sollen nicht 'public' sein.                                   (1E)\n" +
            "\n" +
            " 2. Welche der folgenden Aussagen stimmen in Bezug auf die Unterscheidung zwischen\n" +
            "    Datenstrukturen und abstrakten Datentypen?\n" +
            "    \n" +
            "    XXXXXXXXX Datenstrukturen legen die Typen ihrer Einträge fest.                          (2A)\n" +
            "    XXXXXXXXX Datenstrukturen beschreiben, wie Operationen auf Daten zugreifen.             (2B)\n" +
            "    XXXXXXXXX Abstrakte Datentypen beschreiben vorwiegend Algorithmen.                      (2C)\n" +
            "    XXXXXXXXX Abstrakte Datentypen müssen verwendete Algorithmen festlegen.                 (2D)\n" +
            "    XXXXXXXXX Abstrakte Datentypen müssen bestimmte Datenstrukturen festlegen.              (2E)\n" +
            "\n" +
            " 3. Welche der folgenden Aussagen stimmen in Bezug auf rekursive Datenstrukturen?\n" +
            "    \n" +
            "    XXXXXXXXX Schleifen erlauben kein vollständiges Traversieren.                           (3A)\n" +
            "    XXXXXXXXX Zur Fundierung wird meist 'null' verwendet.                                   (3B)\n" +
            "    XXXXXXXXX Fortschritt erfolgt durch induktiven Aufbau und Dereferenzierung.             (3C)\n" +
            "    XXXXXXXXX Zur Fundierung können spezielle Knoten verwendet werden.                      (3D)\n" +
            "    XXXXXXXXX Doppelt verkettete Listen sind in beide Richtungen traversierbar.             (3E)\n" +
            "\n" +
            " 4. J sei ein Referenztyp (Klasse oder Interface), und\n" +
            "    g sei eine Variable eines Referenztyps mit 'g != null'.\n" +
            "    Welche der folgenden Aussagen treffen für alle J und g zu?\n" +
            "    \n" +
            "    XXXXXXXXX Liefert '(J)g' einen Laufzeitfehler, dann gilt 'g instanceof J'.              (4A)\n" +
            "    XXXXXXXXX Gilt 'g.getClass() == J.class', dann ist J ein Interface.                     (4B)\n" +
            "    XXXXXXXXX 'J.class' liefert die interne Repräsentation von J.                           (4C)\n" +
            "    XXXXXXXXX Aus 'g instanceof J' folgt: 'g.getClass() != J.class'.                        (4D)\n" +
            "    XXXXXXXXX Gilt 'g instanceof J', dann ist J eine Klasse.                                (4E)\n" +
            "\n" +
            " 5. z sei eine Variable mit einem einfachen binären Suchbaum (nicht AVL-Baum)\n" +
            "    ganzer Zahlen, der durch diese Anweisungen aufgebaut wurde:\n" +
            "        STree z = new STree(); z.add(6); z.add(8); z.add(2);\n" +
            "    Welche der folgenden Aussagen treffen auf z zu?\n" +
            "    \n" +
            "    XXXXXXXXX Der Knoten mit Wert 2 ist Kind von dem mit Wert 6.                            (5A)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 8 ist Elter von dem mit Wert 6.                           (5B)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 6 ist die Wurzel.                                         (5C)\n" +
            "    XXXXXXXXX Der Baum ist perfekt ausbalanciert.                                           (5D)\n" +
            "    XXXXXXXXX Der Knoten mit Wert 8 ist ein Blattknoten.                                    (5E)\n" +
            "\n";

    public static final long UID = 240912873846153L;

    private static void checkAndPrint(Question... questions) {
        int i = 1;
        String s = "";
        for (Question question : questions) {
            java.util.Scanner scanner = new java.util.Scanner(question.toString());
            s += String.format("%2d. %s\n", i++, scanner.nextLine());
            while (scanner.hasNextLine()) {
                s += String.format("    %s\n", scanner.nextLine());
            }
            s += "\n";
        }
        String converted = s.replace("Richtig: ", "XXXXXXXXX").replace("Falsch:  ", "XXXXXXXXX");
        if (!converted.replaceAll("[ \t]+", " ").equals(EXPECT.replaceAll("[ \t]+", " "))) {
            i = 0;
            String err = "\n";
            java.util.Scanner e = new java.util.Scanner(EXPECT);
            java.util.Scanner f = new java.util.Scanner(converted);
            while (e.hasNextLine() && f.hasNextLine() && i < 5) {
                String el = e.nextLine(), fl = f.nextLine();
                if (!el.replaceAll("[ \t]+", " ").equals(fl.replaceAll("[ \t]+", " "))) {
                    i++;
                    err += "Statt der Zeile: " + fl + "\nsollte stehen:   " + el + "\n\n";
                }
            }
            if (i >= 5) {
                err = "Das sind die erwarteten Fragen und Antwortmöglichkeiten in 'EXPECT':\n\n" + EXPECT;
            }
            System.out.println("ACHTUNG: Sie haben Programmteile verändert, die nicht geändert werden sollten.\n" +
                    "Beurteilt wird so, als ob diese Programmteile unverändert geblieben wären.\n" +
                    err);
            System.exit(1);
        }
        System.out.print("Die Multiple-Choice-Fragen wurden folgendermaßen beantwortet\n" +
                "(das sind nur Ihre Antworten, keine Aussage über Korrektheit):\n\n" +
                s);
        System.exit(0);
    }

    private static class Question {
        private final String question;
        private final Choice[] choices;

        public Question(String question, Choice... choices) {
            this.question = question;
            this.choices = choices;
        }

        public String toString() {
            String s = question + "\n\n";
            for (Choice choice : choices) {
                s += choice + "\n";
            }
            return s;
        }
    }

    private static class Choice {
        private final String answer;
        private final boolean valid;

        public Choice(boolean valid, String answer) {
            this.answer = answer;
            this.valid = valid;
        }

        public String toString() {
            return (valid ? "Richtig:  " : "Falsch:   ") + answer;
        }
    }
}