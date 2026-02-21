Analisis de las violaciones SOLID 

1.SINGLE RESPOSIBILITY PRINCIPLE(SRP): La clase se encarga de calcular descuentos,precios, 
controla la logica de envio de mensajes al cliente, genera y formatea cadenas de texto para
visualizacion de datos.
2.Open/Closed Principle(OCP):El codigo deberia estar "cerrado" a cambios pero "abierto" a 
nuevas funciones 
3.Inversion de dependencias(DIP):La clase depende directamente de una implementacion 
concretara datos en lugar de una abstraccion
4.Uso de datos desordenado: Guarda la informacion en una lista de textos String en lugar de usar
un objeto de tipo "pedido".Esto hace que sea facil confundirse de columna como mezclar el nombre
con el precio