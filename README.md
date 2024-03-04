# Aproximacion a traves de la recursividad con el metodo de MonteCarlo de Pi

Este programa en Java implementa un método iterativo que permite obtener una aproximación al número Pi mediante el método de Montecarlo. 

## Contenido

- [Introducción](#introducción)
- [Manual de Instalación](#manual-de-instalación)
- [Manual de Uso](#manual-de-uso)

## Introducción

Este proyecto contiene implementaciones en Java del método de Montecarlo para aproximar el valor de Pi. El código se organiza en dos clases principales:

- **Matematicas.java:** Contiene métodos para generar aproximaciones de Pi tanto de forma iterativa como recursiva utilizando el método de Montecarlo.

- **Principal.java:** Es la clase principal del programa que muestra el resultado de las aproximaciones de Pi.
## Manual de Instalación

Para instalar y utilizar este programa, primero asegúrese de tener instalado el [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) en su computadora.

Luego, clone este repositorio en su computadora utilizando el siguiente comando en la terminal o línea de comandos:

```bash
git clone https://github.com/enzohuin/practica2Pr2.git

```
Para acceder al directorio del proyecto utiliza el comando:
```
cd practica2Pr2
```
Para compilar puede usar el camando:
```
make compilar
```
Para creaar un archivo ejecutable JAR se utiliza:
```
make jar
```
Si quieres crear la documentacion de Javadoc pra el codigo se hace con la siguiente instruccion:
```
make javadoc
```
## Manual de Uso
Para ejecutar el programa y obtener una aproximación de Pi, utilice el siguiente comando:
```
java -jar pi.jar <numero de pasos>
```
Ejemplo:
```
java -jar pi.jar <1000>
```
ADVERTENICIA:
Si pone un numero de pasos superior a 4917 al ejecutar el programa le va a dar error. Asi que para que funcione correctamente el numero de pasos debera ser inferior a tal numero. Disculpe las molestias.
