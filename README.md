# Sistema solar

## Modelado

Se requiere un programa que modele el concepto de un planeta del sistema solar.

Un planeta tiene los siguientes atributos:

1. Un nombre de tipo String con valor inicial de null.
2. Cantidad de satélites de tipo int con valor inicial de cero.
3. Masa en kilogramos de tipo double con valor inicial de cero.
4. Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
5. Diámetro en kilómetros de tipo int con valor inicial de cero.
6. Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero
7. Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
8. Observable a simple vista, de tipo booleano con valor inicial false.

La clase debe incluir los siguientes métodos:

- La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
- Definir un método que devuelva los valores de los atributos de un planeta.
- Calcular la densidad del planeta, como el cociente entre su masa y su volumen.
- Determinar si un planeta del sistema solar se considera exterior.
- Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia entre la Tierra y el Sol = 149597870 Km.
- En el método main de la clase App se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la densidad de cada planeta y si el planeta es un planeta exterior del sistema solar.

## Diagrama de clases 

![image](https://github.com/user-attachments/assets/4c443df0-d3b8-4f93-bc71-97fdf748d141)
![image](https://github.com/user-attachments/assets/769fb939-eab2-4cab-ad42-babee8a93c35)

