# Quiz — Patrones de Diseño Estructurales

Pregunta 1 · Identificación

a. ¿Qué patrón de diseño utilizaría?
R/ Decorator

b. ¿Por qué este patrón es más apropiado que crear una clase diferente para cada combinación?


R/ Si usáramos herencia tradicional, tendríamos que crear una subclase para cada combinación posible (BasicMessageWithLogging, BasicMessageWithLoggingAndEncryption, etc.) Con el patrón Decorator, las funcionalidades se agregan dinámicamente envolviendo el objeto en tiempo de ejecución, manteniendo el código desacoplado.

Pregunta 2 · Identificación

a. ¿Qué patrón de diseño utilizaría?
R/ Fachada

b. Explique en 2 o 3 líneas por qué considera que este patrón es apropiado:

R/ Proporciona una interfaz unificada y simple hacia un subsistema complejo de componentes. De esta manera oculta los detalles de implementación interna y reduce el acoplamiento entre el cliente (controlador/main) y las dependencias del negocio.

Pregunta 3. Identificación

a. ¿Qué patrón de diseño estructural utilizaría? 
R/ Proxy

b. Explique brevemente por qué es adecuado para esta situación:

R/ Actúa como un intermediario que implementa la misma interfaz del servicio real, Esto le permite interceptar las llamadas para validar permisos y seguridad antes de dejar la ejecución al objeto original todo de manera transparente para el cliente.

Pregunta 4. Identificación

a. ¿Qué patrón de diseño utilizaría? R/ Adapter

b. Explique cuál es el problema que debe resolver el patrón:

Resuelve la incompatibilidad de interfaces. Permite que dos componentes con contratos diferentes puedan colaborar mutuamente sin necesidad de alterar el código del servicio externo cerrado ni el código cliente existente, traduciendo las llamadas de una interfaz a la otra.