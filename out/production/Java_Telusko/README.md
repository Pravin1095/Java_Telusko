# Java_Telusko

jshell :

jshell is one where we can write the code directly in terminal. Initially enter jshell in terminal and you can start writing code in jshell

JVM :

Java is a platform independent (Meaning it can run on any machine but tat machine needs JVM). But JVM is not platform independent as it does not run in IOS. This is because every operating system like Windows, Mac and Linux has JVM installed in it. If you have JVM in your OS you can run it else you cannot. JVM needs byte code to compile our code. Hence we write our code in english(java code[extension of .java]) and this code is sent to Javac for conversion to byte code(extension of .class) and then this byte code is sent to JVM.

Let's say we are working in large project that has many files. JVM needs to know which file to execute first and we represent that file with a main() method. it has four words which is public static void main. It accepts args String a[]

JRE: (Java Runtime environment)
JRE is where the code is run and JVM is inside the JRE and so the byte code goes toJRE and JVM runs it

Object Oriented:

Java is Object Oriented. So in Java everything shojuld be in object and to create an object we need a class

Datatypes:

Two types:Primitive and 

Primitive:
Integer, Float, Character ,Boolean.
Integer - int, long Use l at end for long, short ,byte (Check for how much bytes they consume in google)
Float - float(4 bytes) Put f at end for float Eg: 4.57f, double(8bytes) It is preferred to use double instead of float because for larger precision double is preferred
Character - char(2bytes). Java uses unicodes for characters. Character accepts only a single character
Boolean - bool(true or false)