OPTION= -Xlint -encoding ISO-8859-1 -d bin -cp bin
MAINPACKAGE= fp2/poo/practica7/utilidades

execution: ./jar/Main.jar 
	java -jar ./jar/Main.jar

./jar/Main.jar:  ./bin/fp2/poo/practica7/utilidades/Figura.class \
		./bin/fp2/poo/practica7/utilidades/MiFigura.class \
		./bin/fp2/poo/practica7/utilidades/Cuadrado.class \
		./bin/fp2/poo/practica7/utilidades/Circulo.class \
		./bin/fp2/poo/practica7/utilidades/Main.class 
	/usr/bin/jar cvfe ./jar/Main.jar  fp2.poo.practica7.utilidades.Main \
		-C ./bin/ ./$(MAINPACKAGE)/Figura.class \
		-C ./bin/ ./$(MAINPACKAGE)/MiFigura.class \
		-C ./bin/ ./$(MAINPACKAGE)/Cuadrado.class \
		-C ./bin/ ./$(MAINPACKAGE)/Circulo.class \
		-C ./bin/ ./$(MAINPACKAGE)/Main.class 



#Class compilation#

./bin/fp2/poo/practica7/utilidades/Figura.class: ./src/$(MAINPACKAGE)/Figura.java
	javac $(OPTION) ./src/$(MAINPACKAGE)/Figura.java

./bin/fp2/poo/practica7/utilidades/MiFigura.class: ./src/$(MAINPACKAGE)/MiFigura.java
	javac $(OPTION) ./src/$(MAINPACKAGE)/MiFigura.java

./bin/fp2/poo/practica7/utilidades/Cuadrado.class: ./src/$(MAINPACKAGE)/Cuadrado.java
	javac $(OPTION) ./src/$(MAINPACKAGE)/Cuadrado.java

./bin/fp2/poo/practica7/utilidades/Circulo.class: ./src/$(MAINPACKAGE)/Circulo.java
	javac $(OPTION) ./src/$(MAINPACKAGE)/Circulo.java

./bin/fp2/poo/practica7/utilidades/Main.class: ./src/$(MAINPACKAGE)/Main.java
	javac $(OPTION) ./src/$(MAINPACKAGE)/Main.java

