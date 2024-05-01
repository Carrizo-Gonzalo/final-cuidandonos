# final-cuidandonos

## Integrantes

* Ibarra, Martin
* Carrizo, Gonzalo

## Algunas justificaciones "Punto 2" (el resto se justifica con el codigo) 

* Para cumplir con los requisitos de este punto, se agregó una nueva entidad Parada, sobre la cual
* Se delegaron los calculo de distancia y demora, permitiendo que la entidad Trayecto solo 
* se encargue de solicitar el resultado de dicho calculo y hacer la sumatoria, lo cual posibilita que el diseño
* sea mas Cohesivo. De esta forma ademas, obtenemos mayor Extensibilidad y Mantenibilidad a la hora de agregar
* o modificar una parada.

* Agregamos en trayecto un bolean que indica si el usuario avisara el estado al llegar a cada parada, o si desea
* setear un tiempo de demora en cada una. Mediante las opciones en la interfaz del usuario este atributo debería 
* ser cargado.



