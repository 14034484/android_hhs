# Android Hands-on sessie Haagse Hogeschool

## Dependencies en eerste start-up
1. Download en installeer de volgende onderdelen:
	* [Git](https://git-scm.com/)
	* [Android studio](https://developer.android.com/studio/index.html)
2. Check deze repository uit met git dmv: `git clone https://github.com/xanvierb/android_hhs.git`.
3. _Optioneel: Fork de repository in je eigen github als je ook wilt kunnen pushen naar remote._
4. **Importeer** het project in Android Studio
5. Er zullen nog onderdelen ontbreken die de ide nodig heeft om de code uit te voeren. Je krijgt hiervan een melding onderin bij de 'messages'. Deze errors kunnen automatisch worden ge-resolved. Klik op "Install missing platform(s) and sync project."
6. Klik op de groene play knop bovenin. Je krijgt nu een scherm te zien 'Select Deployment Target'.
7. Creeer een nieuwe Pixel 2 telefoon met een API level 26 (Android 8 Oreo)
8. Selecteer het toestel dat je zojuist hebt aangemaakt en klik op `OK`
9. Als alles goed is gegaan start je nu de applicatie op een virtuele Pixel 2 telefoon op.

## Opdracht 1
1. Plaats een `TextView` in de Opdracht1 activity.
2. Geef hier wat tekst in weer dat, afhankelijk van de taalinstellingen van de telefoon, Engelse of Nederlandse tekst weergeeft.
3. Plaats een `EditText` en een nieuwe `TextView` en geef de tekst weer in de `TextView`.
4. Zorg dat de ingevoerde tekst ook wordt weergegeven in de taalafhankelijke `TextView` uit punt 2.
5. Plaats een button op de Activity.
6. Maak een nieuwe empty activity aan en noem deze `Opdracht1a`
7. Zorg dat als je op die knop drukt, deze nieuwe activity opstart
8. Voeg een `TextView` toe aan de nieuwe activity.
9. Stuur de tekst uit de `EditText` door naar de Opdracht1a activity en geef het weer in de `TextView`

### Extra informatie:
* EditText: https://developer.android.com/training/keyboard-input/style.html
* Activity Lifecycle: https://developer.android.com/guide/components/activities/activity-lifecycle.html
* Event listening: https://guides.codepath.com/android/Basic-Event-Listeners
* Intent: https://developer.android.com/reference/android/content/Intent.html

## Opdracht 2
1. Voeg een nieuwe List Fragment toe (file > new > Fragment > Fragment (List))
2. Zorg dat deze nieuwe fragment wordt geladen op de `Opdracht2` activity (Via de layout XML)
3. Laat in de list fragment 15 verschillende ingrediënten zien. (kijk in de dummy folder, daar zit er code voor in)
4. Bedenk een manier om ingrediënten toe te voegen en te verwijderen en implementeer dit
5. Persisteer de toegevoegde en verwijderde ingredienten in een SQLite database.

### Extra informatie: 
* Fragments: https://developer.android.com/guide/components/fragments.html
* RecyclerView: https://developer.android.com/training/material/lists-cards.html
* SQLite database: https://developer.android.com/training/data-storage/sqlite.html#java
* Room persistence library: https://developer.android.com/training/data-storage/room/index.html

## Opdracht 3
1. Maak een API key aan op https://newsapi.org/
2. Laat het laatste Nederlandse nieuws zien in de Opdracht 3 activity d.m.v. REST calls.

### Extra informatie: 
* REST: https://en.wikipedia.org/wiki/Representational_state_transfer
* AsyncTask: https://developer.android.com/reference/android/os/AsyncTask.html

## Bonus opdracht
1. Maak een nieuw scherm en zorg dat je deze kunt opstarten vanuit het hoofdscherm
2. Geef hier de huidige koers van de USD/EUR op weer. (of van Bitcoin als je dat leuker vind)
3. Geef de laatste koers weer in een grafiek.

