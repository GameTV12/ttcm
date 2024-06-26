Testový úkol pro TTCM

### Text zadání:

Napište konzolovou aplikaci, která přečte a zpracuje řadu čísel. Čísla se budou číst buď ze souboru nebo ze standardního vstupu. Přečtená čísla zpracuje podle těchto pravidel:
- počet přečtených čísel je sudé číslo, aplikace vypíše z této řady pouze sudá čísla
- počet přečtených čísel je liché číslo, aplikace vypíše jenom lichá čísla
  Výsledek zapíše do souboru nebo na standardní výstup. Chováni aplikace, odkud se čte a zapisuje, se bude řídit parametry při spuštění.
  První parametr určuje odkud se budou čísla číst a je povinný. Parametr může být celé kladné číslo n (čísla se budou zadávat ze s. vstupu) nebo cesta k souboru s čísly. Způsob jak jsou čísla v tomto souboru uložená si určete sami.
  Druhý parametr je nepovinný. Když se nezadá, bude se výsledek zapisovat na s. výstup, v opačném případě je to souboru.

Příklady spuštění aplikace:

Aplikace přečte čísla ze s. vstupu, výsledek zapíše na s. výstup:
aplikace 4


Aplikace přečte čísla ze souboru, výsledek zapíše do souboru:
aplikace input.txt output.txt



Aplikace přečte čísla ze souboru, výsledek zapíše na s. výstup:
aplikace input.txt

### Návod
Java máme v /java. Jar soubory jsou v /jarFiles.
- exeArgs.bat - soubor, ve kterém napíšete parametry po spuštění, máte spustit "exeArgs.bat" soubor. `Enter args: ` přes mezerník (space) 1 nebo 2 argumenty: způsob vstupu a soubor vystupu (nebo prazdné - konzole). Pokud budete psát v konzoli, napíšete pole čísel, kliknutím `Enter` skončíte vstup
- consoleArgs.jar - soubor, pro který píšete parametry a spustítě přes Windows Power Shell, napíšete `java -jar .\consoleArgs.jar [par1] [par2]`.
- Ještě můžete spustit aplikaci v standardním .java souboru

### Příklady vstupu pro exeArgs.bat
- `5` - Konzole pro vstup a výstup
- `input.txt out` Soubor pro vstup a výstup. Soubor výstupu můžete napsát s .txt nebo bez, automaticky to bude překládano do .txt
- `input.txt` Souborový vstup, konzolní výstup
- `10 output.txt` Konzolní vstup, souborový výstup

### Příklady vstupu pro consoleArgs.jar (v PowerShell)
- `java -jar .\consoleArgs.jar input.txt output` - Souborový vstup a výstup
- `java -jar .\consoleArgs.jar input.txt` Soubor pro vstup, konzole pro výstup.
- `java -jar .\consoleArgs.jar 5` Konzolní vstup a výstup
- `java -jar .\consoleArgs.jar 5 output` Konzolní vstup, souborový výstup