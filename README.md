# final-cuidandonos

## Integrantes

* Ibarra, Martin
* Carrizo, Gonzalo

## Algunas Justificaciones "Punto 1" (el resto se justifica con el codigo).

### Alta de trayecto:
* Cuando se da de alta un trayecto, se setean las direcciones inicial y final,
necesarias para el calulo de distancia y tiempo de demora.
* El calculo de la distancia, al hacerse por una API externa al sistema, necesita
un patrón adapter para garantizar el menor acoplamiento posible, y además procurar la
extensibilidad.
* El calculo del tiempo de demora también lleva un adapter, ya que sabemos qué
responsabilidad tiene el componente, pero no sabemos exactamente cómo se va a
resolver. Poner un adapter garantiza una mejor mantenibilidad, ya que si hay
diferencias de firmas con las implementaciones, sólo se modifica la
implementacion del adapter, pero el resto queda sin modificar.

### Reacciones cuando "pasa algo malo"
* Para que se ejecuten las reacciones se debería implementar un job que detecte
si "pasó algo malo" (es decir, si se comenzó un trayecto y no se lo finalizó,
superando el tiempo de demora estimado). Una vez que se detecta, debería ejecutarse
el método "reaccionarPorIncidente" de ese trayecto.
* Se implementó una estructura similar al patrón command, ya que nos provee una
mayor cohesión en la clase trayecto y nos permite tratar polimórficamente a las
reacciones, sin tener que acoplarnos demasiado (trayecto sólo conoce la firma 
"accionar").

### Desactivar notificaciones en viaje
* Para resolver el requerimiento de "silenciar" las notificaciones mientras un
transeunte está en un trayecto, se necesitaría implementar un job que se
fije si el transeunte tiene un trayecto empezado y sin terminar. Si lo tiene,
debería desactivar las notificaciones, y si no, debería activar las notificaciones.