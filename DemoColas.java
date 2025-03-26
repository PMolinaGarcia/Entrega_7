import java.util.ArrayDeque;


public class DemoColas
{
    public static void main(String[] args)
    {
        //Creamos una cola que se define como vacía.
        ArrayDeque<Integer> cola = new ArrayDeque<>();
        //Añadimos dos elementos 1 y 2 en su respectivo orden.
        cola.add(1);
        cola.add(2);
        //Pedimos que se escriba por pantalla la cola; esto es, sus elementos.
        System.out.println(cola);
        //Inspeccionamos el elemento accesible de la cola, que es el primero que fue añadido.
        System.out.println(cola.peek());
        //Cogemos el elemento accesible de la cola (el primero añadido) y lo eliminamos.
        System.out.println(cola.poll());
        //Escribimos por pantalla la cola, que ahora ya no tiene el primer elemento original.
        System.out.println(cola);
    }


}
