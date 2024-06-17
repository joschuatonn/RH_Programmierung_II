# Kontrollfragen Betriebssysteme

## Geschichte

- **Was ist ein CPU- und ein EA-Burst?**
  - **CPU-Burst**: Phase, in der ein Prozess die CPU intensiv nutzt, ohne E/A-Operationen.
  - **EA-Burst**: Phase, in der ein Prozess hauptsächlich auf E/A-Operationen wartet und die CPU weniger nutzt, die CPU muss warten.

- **Was ist ein Residenter Monitor?**
  - Begriff für die ersten Betriebssysteme, z.B. Fortran Monitoring System (FMS).
  - Residieren permanent im Speicher und können grundlegende Funktionen wie Prozessmanagement und Speicherverwaltung bereitstellen.

- **Gibt es Beispiele, bei denen kein Betriebssystem benötigt wird?**
  - Ja, z.B. bei Mikrocontrollern, die einfache Aufgaben ausführen können, Programme durchaus ohne OS direkt auf der Hardware ausgeführt werden.

## Von Neumann

- **Erläutern Sie die Weiterentwicklung der Von Neumann-Architektur.**
  - (Inhalt fehlt)

- **Wie unterscheiden sich von Neumann und Harvard?**
  - Im Gegensatz zur von Neumann Architektur verwendet Harvard separate Speicher und Busse für die Verarbeitung von Daten.

- **Was sind die jeweiligen Vorteile?**
  - **Von Neumann**
    - **Vorteile**: Einfachere Implementierung und Flexibilität.
    - **Nachteile**: (Inhalt fehlt)
  - **Harvard**
    - **Vorteile**: 
      - Sicherheit: Trennung von Befehlen (Programmcode) und Daten ist sicherer, da der Programmcode nicht von anderen Programmen, z.B. Viren, geändert werden kann.
      - Geschwindigkeit: Zwei Busse und simultaner Zugriff auf Befehle und Daten erhöht direkt die Geschwindigkeit.
    - **Nachteile**: Mehr Hardware notwendig, aufwändiger und teurer.

- **Wie ist der Zusammenhang von Maschinenbefehl und Arbeit der CPU?**
  - Ein Maschinenbefehl wird von der CPU dekodiert und ausgeführt. Dies beinhaltet das Holen des Befehls aus dem Speicher, das Interpretieren und das Ausführen der entsprechenden Operationen.

- **Wie ist der Zusammenhang von Maschinenbefehl und Ausdruck einer höheren Programmiersprache?**
  - Maschinenbefehle sind die niedrigste Abstraktionsebene, während höhere Programmiersprachen abstrakte Befehle bieten, die vom Compiler in Maschinenbefehle übersetzt werden.

## Definitionen

- **Nennen Sie die Hauptaufgaben von Betriebssystemen**
  - Verbergen der Komplexität der Maschine vor dem Anwender (Abstraktion)
  - Ressourcenverwaltung (Speicher, CPU, E/A-Geräte)
  - Prozess- und Speicherverwaltung
  - Bereitstellung einer Benutzerschnittstelle (Kommandointerpreter, Shell)
  - Bereitstellung einer normierten Programmierschnittstelle (API)

- **Was für Schichten (ganz grob) gibt es in Betriebssystemen?**
  - Kernel
  - Middelware (Systemdienste)
  - Benutzerprogramme

## Commandline

- **Was ist eine Commandline und was eine Shell?**
  - **Commandline**: Schnittstelle, um Befehle direkt an das Betriebssystem zu senden.
  - **Shell**: Programm, das die Commandline bereitstellt und die Eingabe von Befehlen ermöglicht.

- **Sind Automatisierungen für die Commandline möglich?**
  - Ja

- **Wie sehen diese aus?**
  - zum Beispiel durch Skripte (e.g. Bash), die eine Sequenz von Kommandos automatisiert ausführen
  - So kann zum Beispiel die Einrichtung eines Servers automatisiert werden.

## C Programmierung

- **Erläutern Sie den Scope von globalen und lokalen Variablen**
  - **Globale Variablen**: Variablen, die außerhalb von Funktionen deklariert werden und im gesamten Programm sichtbar sind.
  - **Lokale Variablen**: Variablen, die innerhalb von Funktionen deklariert werden und nur innerhalb dieser Funktion sichtbar sind.

- **Wie erstellen Sie ein C Programm unter Linux/Unix?**
  - Entweder Datei direkt mit einem Text-Editor öffnen (e.g. "nano dateiname.c") und den Code schreiben oder die Datei einfach per "touch dateiname.c" erstellen und dann mit einem Editor öffnen.
  - Code schreiben und speichern.
  - Mit dem Compiler (z.B. gcc) kompilieren: "gcc dateiname.c -o dateiname"
  - Ausführen: "./dateiname"

- **Nennen Sie Unterschiede zwischen C und Java**
  - **C**: Direktes Speichermanagement, keine Garbage-Collection, Plattformabhängig, keine Klassen, keine Vererbung
  - **Java**: Plattformunabhängig durch die JVM,  Garbage-Collection, keine direkte Speicherverwaltung

## Prozesse

- **Welche Prozesszustände gibt es?**
  - **In UNIX**
  - Erzeugt
  - Bereit, im Speicher
  - Bereit, ausgelagert
  - Schlafend, im Speicher
  - schlafend, ausgelagert
  - im Kern laufend
  - im Benutzermodus laufend
  - verdrängt
  - Zombie

- **Was beinhaltet ein Prozesskontrollkontext (PCB)?**
  - (Inhalt fehlt)

- **Was wird wo im PCB gespeichert?**
  - (Inhalt fehlt)

- **Wie können neue Prozesse in C erzeugt werden?**
  - Mit der Funktion `fork()` oder `exec()`

- **Was ist ein Zombie im Kontext von Prozessen?**
  - Ein Prozess, der seine Ausführung beendet hat, aber dessen Exit-Status noch nicht vom Elternprozess abgeholt wurde. 

## Threads

- **Was sind Threads?**
  - Threads sind leichte Prozesse, die innerhalb eines Prozesses laufen und sich den Adressraum teilen.
  - **Vorteile:**:
  - Aufwändige Operationen können in einen leichtgewichtigen Hilfsprozess ausgelagert werden, während der Hauptprozess weiterarbeiten kann.
  - Schneller Kontextwechsel, da weniger Informationen gespeichert und wiederhergestellt werden müssen.
  - Je nach Scheduler eventuell mehr Rechenzeit
  - **Nachteile**:
  - Programmierung ist schwierig: Zugriff auf gemeinsame Daten muss koordiniert werden

- **Worin unterscheiden Sie sich von Prozessen? Warum wurden Threads entwickelt?**
  - Threads teilen sich den gleichen Adressraum, während Prozesse separate Adressräume haben. Threads wurden entwickelt, um parallele Ausführung in einem Programm zu ermöglichen und Ressourcenkosten zu reduzieren.

- **Für welche Anwendungen könnten Threads verwendet werden?**
  - Anwendungen, die parallele Ausführung benötigen, z.B. Webserver, Datenbanken, Multimediaanwendungen.

## Scheduling

- **Nennen Sie einige Schedulingstrategien.**
  - Einfach: FCFS
  - Zeitscheibenbasiert: RR, VRR
  - Vorhersagebasiert: SPN (SJF), SRTF, HRRN
  - Prioritätsbasiert: FB (MLQ, MLFQ)

- **Was ist der Unterschied von preemptive zu non-preemptive Scheduling?**
  - **Preemptive**: Ein Prozess kann unterbrochen werden, um einem anderen Prozess die CPU zu geben. Zum Beispiel bei Zeitscheibenbasierten Scheduling-Strategien. Der Prozess wird somit "ausgeladen" oder "preempted".
  
- **Welche Vor-/Nachteile gibt es jeweils?**
  - **Preemptive**:
    - **Vorteile**: Bessere Reaktionszeit, Fairness
    - **Nachteile**: Overhead durch Kontextwechsel, schlechtere Performance bei vielen Prozessen
  - **Non-Preemptive**:
    - **Vorteile**: Einfacher, weniger Overhead
    - **Nachteile**: Schlechtere Reaktionszeit

- **Welchen Einfluss haben CPU und E/A-Bursts aufs Scheduling, bzw. worauf muss geachtet werden?**
  - Prozesse sollten so geplant werden, dass CPU- und E/A-Bursts effizient genutzt werden. Lange CPU-Bursts können Wartezeiten für I/O-intensive Prozesse erhöhen.

- **Was ist Nettigkeit bei Linux?**
  - Mit dem Linux-Befehl "nice" kann ein Nutzer seinen Prozess netter machen, also in der Priorität herabsetzen (positive nice-Werte, normale Benutzer)
  - root darf auch negative nice-Werte für seine Prozesse setzen, um sie zu bevorzugen.

## Mehr C Programmieren

- **Was bewirkt `#` in C?**
  - `#` wird in C verwendet, um Präprozessor-Direktiven zu kennzeichnen.

- **Nennen Sie Beispiele für sinnvolle Anwendungen von Makros.**
  - Konstante Werte definieren (#define PI 3.14), Code-Abschnitte für bedingte Kompilierung (#ifdef DEBUG).

- **Wodurch wird ein String in C beendet?**
  - Ein String in C wird durch ein Null-Byte (`\0`) beendet.

- **Was ist bei einem Pointer-Inkrement zu beachten?**
  - Pointer-Inkrement erhöht den Pointer um die Größe des Typs, auf den der Pointer zeigt.

## Synchronization

- **Was ist eine Race Condition?**
  - (Inhalt fehlt)

- **Was ist ein kritischer Abschnitt?**
  - (Inhalt fehlt)

- **Worauf muss geachtet werden, wenn ein kritischer Abschnitt mit einem Mutex gesperrt wird?**
  - (Inhalt fehlt)

- **Wie funktionieren Semaphoren?**
  - (Inhalt fehlt)

## Verklemmungen

- **Definieren Sie Deadlock und Livelock.**
  - (Inhalt fehlt)

- **Was sind die vier Bedingungen für eine Verklemmung?**
  - (Inhalt fehlt)

- **Wie wird ein Betriebsmittelgraph erstellt und was wird darin abgelesen?**
  - (Inhalt fehlt)

- **Was kann gegen Verklemmungen getan werden?**
  - (Inhalt fehlt)

## Interprozesskommunikation und Synchronisation

- **Welche Arten von Interprozesskommunikation gibt es?**
  - (Inhalt fehlt)

- **Was ist bei Interprozesskommunikation über gemeinsame Speichersegmente (Shared Memory) zu beachten?**
  - (Inhalt fehlt)

- **Wieviele Prozesse können durch eine Pipe verbunden werden?**
  - (Inhalt fehlt)

- **Was passiert, wenn ein Prozess in eine volle Pipe schreibt?**
  - (Inhalt fehlt)

- **Was ist ein kritischer Abschnitt?**
  - (Inhalt fehlt)

- **Was sind Race Conditions?**
  - (Inhalt fehlt)

- **Warum sind Race Conditions schwierig zu lokalisieren und zu beheben?**
  - (Inhalt fehlt)

- **Was können Sie gegen Race Conditions tun?**
  - (Inhalt fehlt)

## Speicherverwaltung

- **Welche Aufgaben und Herausforderungen hat die Speicherverwaltung?**
  - (Inhalt fehlt)

- **Was ist der grundlegende Unterschied zwischen Methoden wie Buddy-Verfahren und Freilisten und der Seitenadressierung?**
  - (Inhalt fehlt)

- **Was ist eine MMU?**
  - (Inhalt fehlt)

- **Nennen Sie Platzierungsstrategien bei der Freispeicherverwaltung.**
  - (Inhalt fehlt)

## Virtueller Speicher

- **Wie funktioniert Demand Paging?**
  - (Inhalt fehlt)

- **Was ist Thrashing im Bezug auf Prozesse und Speicher?**
  - (Inhalt fehlt)

- **Erläutern Sie Ersetzungsstrategien aus der Vorlesung.**
  - (Inhalt fehlt)

## Ein- / Ausgabe

- **Wie könnte eine neue Festplatten-Scheduling-Strategie aussehen?**
  - (Inhalt fehlt)

- **Wie kann auf E/A-Geräte zugegriffen werden?**
  - (Inhalt fehlt)

- **Wie kommt das BS an deren Daten?**
  - (Inhalt fehlt)

- **Wo liegen diese Daten?**
  - (Inhalt fehlt)

## Dateisysteme (NICHT KLAUSURRELEVANT)

- **Was sind I-Nodes?**
  - (Inhalt fehlt)

- **Wofür sind Super und Boot Blöcke in Dateisystemen gut?**
  - (Inhalt fehlt)

- **Wie arbeitet ein Journaled Filesystem?**
  - (Inhalt fehlt)

- **Was für Gerätetypen gibt es bei Posix-Systemen?**
  - (Inhalt fehlt)
```