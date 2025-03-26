

import java.util.Stack;


public class DemoPilas {
        public static void main(String[] args) {

            //Creamos la pila de nombre pila, que se define como vacía en su creación.
            Stack<Integer> pila = new Stack<>();
            //Añadimos los elementos 1 y 2, en ese orden, a la pila.
            pila.push(1);
            pila.push(2);
            //Pedimos que se escriba por pantalla la pila; es decir, los elementos que contiene la misma.
            System.out.println(pila);
            //Pedimos que se escriba por pantalla el elemento que está último en la pila.
            System.out.println(pila.peek());
            //Quitamos el elemento que hemos inspeccionado de la pila.
            pila.pop();
            //Volvemos a pedir que se escriba por pantalla la pila para ver los cambios. Se ha quitado el último elemento.
            System.out.println(pila);
        }
    }
