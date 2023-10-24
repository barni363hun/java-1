/*
primitív adattípusok (érték alapján adja át):
byte, short, int, long, float, double, char (1 byte), boolean

összetett adattípusok = osztályok (cím alapján adja át):

*/

//tömb deklarálás fix és változó mérettel

int[] arr = new int[5];
int[] arr2 = new int[] {1,2,58,3};
arr.length

for (int i = 0; i < arr.length; i++) {

}

//foreach (nem kell) 
for (int it : arr){

}

/*
referencia változó = pointer
ha függvénynek objektumot adunk akkor valójában csak pointert fogunk csinálni
és értékadásnál is csak referenciát csinál
*/

String s1 = "asd";
String s2 = s1;

//ugyanazon memóriahelyre mutatnak
//ha s1 = "lol"; attól még s1 nem változik

// osztály

class Person {
    int a,b;
}

/*
A jvm arra jó, hogy java bytecode-ot futtat.

java constructor:
Ha nem adunk meg akkor is van default.
De ha megadunk konstruktort akkor már nincs default.

*/
//coord class

class Coord {
    int x,y;
    Coord(int x, int y){
        this.x = x;
        this.y = y;
    }
    Coord(){
        Coord(0,0);
    }
}

/*
A virtuális gép foglal magának memóriát.

encapsulation:
a változók privátok

a valóságban az öröklődés nem jellemző inkább interfészezünk

loop-ok:
for
while
do whole
foreach ( for (int it : arr) )

exception kezelhető
error nem kezelhető
*/
try {
} 
catch (Exception e) {

}
finally {

}
/*
try catch finally
a finally mindenképp lefut

static

autónak van motorja = kompozíció = az autó konstruktora fogja megkapni a motrot



absztrakt osztály = kiindulási osztály

*/

//abstract class

// abstract = alapul szolgál, felül kell írni a rendes osztályban
abstract class Shape {
    abstract void draw();
}

class Square extends Shape {
    @Override
    void draw() {

    }
}

//interface

interface Shape2 {
    void draw();
}

//implemets = kell neki draw metódus
class Square2 implements Shape2 {
    @Override
    void draw() {

    }
}

/*
jobb az interface, mert 1 java osztály több interfészt valóra válthat
de csak 1 absztakt osztályból származhat

static függvény csak statikus dolgokat tud meghívni

*/

public static void main(String[] args) {
    //TrainApp(); nem jó
    new TrainApp().start();
}

public TrainApp(){
    ...
}


/*
bufferedreader
*/
