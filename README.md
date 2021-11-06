# Hetfo esti amoba Jozsival

### Szia Jozsi! A hetfo esti alkotasunkat itt talalod. 

```text
    0      1     2
  ╔═════╤═════╤═════╗
0 ║  O  │     │     ║
  ╟─────┼─────┼─────╢
1 ║     │     │     ║
  ╟─────┼─────┼─────╢
2 ║     │     │     ║
  ╚═════╧═════╧═════╝
X jatekos, sor koordinata:
```

### Amiket utolag megvaltoztattam: 
1. Kijavitottam a tablat, hogy jol nezzen ki.
2. Hozzaadtam a clear screent, ami csak akkor mukodik szepen, 
ha nem a fejlesztoi kornyezettel futtatod. Legalabbis IntelliJ-vel nem mukodik a clearscreen.

### Amin javithatnal:
1. Megvizsgalni, hogy tele van -e a tabla
2. Atnezni, hogy hianyzik -e valami a tesztekbol
3. Atirni a programot ugy, hogy tetszoleges tablamerettel is mukodjon.
4. Esetleg vmi kis grafikat belevinni, amikor majd a tanfolyammal veszitek.
5. Ha valamit valtoztatnal, akkor csinalj egy 'pull requestet'! A github-on talalsz info-t hogyan kell. :)

### Hogy futtasd a programot:
1. Klonozd le a projected:

```shell
git clone https://github.com/jjolsvai/amoba.git
```

2. Forditsd le a kodot, keszits jar file-t belole:

```shell
mvn clean package
```

3. Futtasd a jatekot:
```shell
java -jar <project konyvtar>/MyAmoba/target/MyAmoba-1.0-SNAPSHOT.jar
```