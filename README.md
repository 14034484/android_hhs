# Android Hands-on sessie Haagse Hogeschool

## Dependencies en eerste start-up
1. Download en installeer de volgende onderdelen:
	* [Git](https://git-scm.com/)
	* [Android studio](https://developer.android.com/studio/index.html)
2. Check deze repository uit met git dmv: `git clone https://github.com/xanvierb/android_hhs.git`.
3. _Optioneel: Fork de repository in je eigen github als je ook wilt kunnen pushen naar remote._
4. Importeer het project in Android Studio
5. Klik op de groene play knop bovenin. Je krijgt nu een scherm te zien 'Select Deployment Target'.
6. Creeer een nieuwe Pixel 2 telefoon met een API level 26 (Android 8 Oreo)
7. Selecteer het toestel dat je zojuist hebt aangemaakt en klik op `OK`
8. Als alles goed is gegaan start je nu de applicatie op een virtuele Pixel 2 telefoon op.

## Opdracht 1
1. Plaats een `TextView` in de Opdracht1 activity.
2. Geef hier wat tekst in weer dat, afhankelijk van de taalinstellingen van de telefoon, Engelse of Nederlandse tekst weergeeft.
3. Plaats een `EditText` en een nieuwe `TextView` en geef de tekst weer in de `TextView`.
4. Zorg dat de ingevoerde tekst ook wordt weergegeven in de taalafhankelijke `TextView` uit punt 2.

## Opdracht 2
1. Voeg een nieuwe List Fragment toe (file > new > Fragment > Fragment (List))
2. Zorg dat deze nieuwe fragment wordt geladen op de `Opdracht2` activity (Via de layout XML)
3. Laat in de list fragment 15 verschillende ingrediënten zien. (kijk in de dummy folder, daar zit er code voor in)
4. Zorg dat je ingrediënten kan toevoegen en verwijderen
5. Persisteer de toegevoegde en verwijderde ingredienten in een SQLite database.

## Opdracht 3
1. Maak een API key aan op https://newsapi.org/
2. Laat het laatste Nederlandse nieuws zien in de Opdracht 3 activity d.m.v. REST calls

## Bonus opdracht
1. Maak een nieuw scherm en zorg dat je deze kunt opstarten vanuit het hoofdscherm
2. Geef hier de huidige koers van de USD/EUR op weer. (of van Bitcoin als je dat leuker vind)
3. Geef de laatste koers weer in een grafiek.
