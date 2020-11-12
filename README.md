# Taller03-SOLID

En el primer y segundo tema, se aplicó el primer principio de SOLID, el de Single Responsibility, porque habían varias clases que compartian métodos y funciones que perfectamente podían estar en las mismas, que fue lo que se hizo. Se creó una clase padre para Helado y Pastel y en la clase padre se implementaron los métodos de OperacionesAderezo

En la parte 3 del análisis, con base al principio SOLID - Open-Close Principle, se modificó parte del código en la clase Postre, para que no existan problemas si se sedea crear otro postre, por ejemplo. si se crea un postre Dona, se implementará automaticamente el método calcular precio en la clase padre Postre y a su vez esté no tendrá que modificar código para poder se presentado en pantalla. Se cumple el principio OCP abierto a extensión, pero no a modifcación.

En la parte 4 del análisis, se aplica el método SOLID -  Dependency Inversion Priciple (DIP) 

En la parte 5 , con base al principio DIP -Dependency Inversion Principle- se arregló un error en la clase Leche deslactosada. Dependiendo el modulo bajo de  la abstraccion y no de otro modulo. En la clase Leche deslactosada se modificó el metodo usarPastel() para que lanze una excepcion en vez de tener una excepcion dentro del metodo .
![Image](https://github.com/KevinChevez/Taller03-SOLID/blob/main/leche.png)

En la parte 6 ,se adaptó el proyecto de tal manera que el Main presentado en el documento corra sin problemas.


