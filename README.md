# java-formatter-eclipse-mars
Java formatter for eclipse mars (version 4.5). This formatter is also tested for eclipse Juno (version 3.8.1) and could be imported into IntelliJ IDEA.

In short the Java formatter:

+ indent 4 spaces
+ use space instead of the tab character
+ split every row @ 80 characters per line
+ format the Javadoc
+ don't format comment
+ try to be compliance with the
[Java](http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html "Java convention")
and [Google](https://google-styleguide.googlecode.com/svn/trunk/javaguide.html "Google convention") conventions
+ pass verify of [checkstyle](http://checkstyle.sourceforge.net/ "Checkstyle site")
+ possible to turn off/on Java formatter with the following strings:
  + //CHECKSTYLE:OFF
  + //CHECKSTYLE:ON

In "test-project" directory you can find a test project in order to verify the Java formatter.

---
## Instructions:
1. **Clone** git repository or **download** the Java formatter

2. **Start** eclipse

3. **Click** on Window --> Preferences

4. **Search** "formatter" in filter text input bar and then **select** _Java --> Code Style --> Formatter_

5. **Click** on "Import..." button and **select** the Java formatter, previously downloaded

6. **Verify** that _"Java and Google Conventions - pirola.org"_ is the Active profile and **click** on _"Apply"_

7. **Click** and "OK"

### **That's all!!!**

You can format your code in different ways:

+ **All classes**
  1. **Click** with the right mouse button on src/main/java, if you use maven, or on root project an **select** _"Source" --> "Format"_<br>

+ **Single class**
  1. **Select** all your Java code class - Shortcut: _Right Ctrl + A_

  2. **Format** the code - Shortcut: _Right Ctrl + Right Shift + F_

### **_Happy coding_ ;)**
