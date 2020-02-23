// Lesson about class variables and
// main elements of the class


// PACKAGE always before IMPORT!

package com.company;        // Package declaration (First)

// import        (second)

// To memorize it use the acronim PIC - Package,Impoort,Class

// Multiple classes can be declared in one file but only one of then can be public

public class MyClass {  // Class declaration
    int value;          // Field declaration
    int x1,x2;

    int sumValues(){
        return  x1+x2;
    }

}

// This classes are private and can be declared here:
class myPrivateClass1{

}

class myPrivateClass2{

}