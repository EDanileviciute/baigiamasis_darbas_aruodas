# Automated test for aruodas.lt
## Links to the pages tested:
[Aruodas Home Page](https://www.aruodas.lt/) <br>
[Aruodas Nauji Projektai Page](https://www.aruodas.lt/nauji-projektai/) <br>
[Aruodas Uzsienio Objektai Page](https://www.aruodas.lt/uzsienio-objektai/) <br>
[Aruodas Mano Aruodas Page](https://www.aruodas.lt/mano-aruodas/) <br>
Note: all tests pre-start with opening the target page and closing the cookies.
### Test Scenarios for [Aruodas Home Page](https://www.aruodas.lt/): <br>
1. Test Login with valid credentials:
   + Click on "Login" button.
   + In the popup window, enter: 
     + valid email address.
     + valid password.
   + Click on "Prisijungti" button.
   + Click on "Mano aruodas".
   + Click on "Logout". <br>

Expected result: login button has text "Mano aruodas".


2. Test Login with invalid credentials:
   + Click on "Login" button.
   + In the popup window, enter:
      + valid email address.
      + invalid password.
   + Click on "Prisijungti" button.<br>

Expected result: error message shows up in the popup window.


3. Test search by selecting objectives:
    + In "Objekto tipas" dropdown menu, choose "Butai pardavimui".
    + In "Savivaldybe" dropdown menu, choose "Vilnius".
    + In "Gyvenviete" dropdown menu, choose "Vilniaus m.".
    + In "Plotas, m2" enter:
      + Plotas nuo: 40.
      + Iki: 100.
    + In "Kambariai" click on "2".
    + In "Irengimas" dropdown menu, click on "Irengtas".
    + In "Kaina" enter:
       + Kaina nuo: 0.
       + Iki: 1000000.
    + Click on "Ieskoti" button. <br>

Expected result: search message says "2-2 kamb., 40-100 m², iki 1000000 €, įrengtas".


4. Test search by manual text input:
   + Click on "Detalioji paieska".
   + In "Aukstas" dropdown menu, choose:
     + Nuo: 1.
     + Iki: 5.
     + "Ne pirmas".
   + In "Tekstine paieska" enter text "butai vilnius".
   + Press "Enter". <br>

Expected result: search message says "1-5 aukštas, ne pirmas, butai vilnius".


5. Test search with selecting neighbourhood:
   + In "Objekto tipas" dropdown menu, choose "Butai pardavimui".
   + In "Savivaldybe" dropdown menu, choose "Vilnius".
   + In "Gyvenviete" dropdown menu, choose "Vilniaus m.".
   + Click on "Pasirinkite mikrorajona".
   + In a popup window, click on "Pazymėti visus mikrorajonus".
   + Click on "Issaugoti". <br>

Expected result: search window contains text "Butai Vilniuje".


### Test Scenarios for [Aruodas Nauji Projektai Page](https://www.aruodas.lt/nauji-projektai/): <br>
1. Test New project search by city:
   + In "Vietove" dropdown menu, choose "Kaunas".
   + In "Objekto tipas" dropdown menu, choose "Namai pardavimui".
   + Click on "Daugiau apie projekta" of the top project. <br>

Expected result: project window has text "Kaunas" in the title.


2. Test New project search with map:
   + In "Objekto tipas" dropdown menu, choose "Butai nuomai".
   + Click on "Ziureti zemelapyje".
   + In dropdown menu, select "Palanga".

Expected result: project window contains text "Nauji projektai".


### Test Scenarios for [Aruodas Uzsienio Objektai Page](https://www.aruodas.lt/uzsienio-objektai/): <br>
1. Test Foreign objects search with adding it to favourites:
   + In "Objekto tipas" dropdown menu, choose "Sklypai".
   + In "Salis" dropdown menu, choose "Latvia".
   + Click on the top object.
   + Click on "Isiminti".
   + In the popup window, enter:
     + valid email address.
     + valid password.
   + Click on "Prisijungti" button.
   + Click "Nesutinku" in the popup window.
   + Click on "Mano aruodas".
   + Click on "Isiminti skelbimai".

Expected result: object is found containing text "Objektas užsienyje".


### Test Scenarios for [Aruodas Mano Aruodas Page](https://www.aruodas.lt/mano-aruodas/): <br>
1. Test deleting saved search results:
   + Click on "Ieskoti" button.
   + Click on "Mano aruodas".
   + Click on "Paieskos".
   + Click on "Trinti" at each existing button.

Expected result: saved searches page is empty and containing text "Neturite išsaugotų paieškų.".


    