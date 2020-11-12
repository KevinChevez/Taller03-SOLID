# Taller03-SOLID
## Especificaciones del taller realizado.
### Integrantes del Grupo-4
### Margarita Mawyin Koriakova - Kevin Chévez Coronel - Rafael Alejandro Merchán

**Análisis del la parte 1 y 2**
Se aplicó el primer principio de *SOLID - Single Responsibility*, porque habían varias clases que compartian métodos y funciones que perfectamente podían estar en las mismas, que fue lo que se hizo. Se creó una clase padre para Helado y Pastel y en la clase padre se implementaron los métodos de OperacionesAderezo

**Análisis del la parte 3**
Con base al principio *SOLID - Open-Close Principle*, se modificó parte del código en la clase Postre, para que no existan problemas si se sedea crear otro postre, por ejemplo. si se crea un postre Dona, se implementará automaticamente el método calcular precio en la clase padre Postre y a su vez esté no tendrá que modificar código para poder se presentado en pantalla. Se cumple el principio *OCP* abierto a extensión, pero no a modifcación.

**Análisis del la parte 4**
Se aplicó el método *SOLID - Dependency Inversion Priciple (DIP)*, debido a que el ENUM es un archivo .java muy estático, es decir no deben depender de Objetos concretos, en este caso de String ENUM. Por lo tanto implementar una clase abstracta, lo convierte un una implementación de aderezos Generalizada, y si llega a ver algún nuevo producto Aderezo (Object Aderezo), simplemente se agrega la nueva  clase al paquete Adicionales y hacemos que esta clase extienda de Aderezo para que pueda ser implementada. De esa manera se cumple el principio *DIP "Un código con dependencia abstracta es un código general"*.

**Análisis del la parte 5**
Con base al principio *DIP -Dependency Inversion Principle* se arregló un error en la clase Leche deslactosada. Dependiendo el modulo bajo de  la abstraccion y no de otro modulo. En la clase Leche deslactosada se modificó el metodo usarPastel() para que lanze una excepcion en vez de tener una excepcion dentro del metodo .
![Image](https://github.com/KevinChevez/Taller03-SOLID/blob/main/leche.png)

**Análisis del la parte 6**
Se adaptó el proyecto de tal manera que el Main presentado en el documento corra sin problemas, como se muestra en la siguiente imagen.
![Image](https://github.com/KevinChevez/Taller03-SOLID/blob/main/Screenshot_2.png)

