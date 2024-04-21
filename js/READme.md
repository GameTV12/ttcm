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
- exeArgs.exe - soubor, ve kterém píšete parametry ve vnitřní kozoli aplikaci `Enter args: ` přes mezerník (space) 1 nebo 2 argumenty: způsob vstupu a soubor vystupu (nebo prazdné - konzole). Pokud budete psát v konzoli, napíšete pole čísel, kliknutím `Enter` skončíte vstup
- consoleArgs.exe - soubor, ve kterém píšete parametry a spustítě přes Windows Power Shell, např. Napíšete `.\consoleArgs.exe (1 parameter) (2 parameter)`. Pokud spustíte 2x kliknutím exe, bude to považovano za konzolní vstup a výstup.
- Ještě můžete spustit aplikaci přes `node *.js (1 parameter) (2 parameter)`

### Příklady vstupu pro exeArgs.exe
- `5` - Konzole pro vstup a výstup
- `input.txt out` Soubor pro vstup a výstup. Soubor výstupu můžete napsát s .txt nebo bez, automaticky to bude překládano do .txt
- `input.txt` Souborový vstup, konzolní výstup
- `10 output.txt` Konzolní vstup, souborový výstup

### Příklady vstupu pro consoleArgs.exe (v PowerShell)
- `.\consoleArgs.exe input.txt output` - Souborový vstup a výstup
- `.\consoleArgs.exe input.txt` Soubor pro vstup, konzole pro výstup.
- `.\consoleArgs.exe 5` Konzolní vstup a výstup
- `.\consoleArgs.exe 5 output` Konzolní vstup, souborový výstup