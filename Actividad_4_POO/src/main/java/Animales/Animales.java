

package Animales;


public class Animales {
    public class Prueba {

        public static void main(String[] args) {
            Animal[] animales = new Animal[4]; /* Define un array de cuatro
elementos de tipo Animal */
            animales[0] = new Gato();
            animales[1] = new Perro();
            animales[2] = new Lobo();
            animales[3] = new Leon();
            for (int i = 0; i < animales.length; i++) { /* Recorre el array de
animales */
                System.out.println(animales[i].getNombreCientífico());
                System.out.println("Sonido: " + animales[i].getSonido());
                System.out.println("Alimentos: " + animales[i].getAlimentos());
                System.out.println("Hábitat: " + animales[i].getHábitat());
                System.out.println();
            }
        }
    }


    public abstract static class  Animal {
        protected String sonido; /* Atributo que identifica el sonido emitido
    por un animal */
        protected String alimentos; /* Atributo que identifica los alimentos
    que consume un animal */
        protected String hábitat; /* Atributo que identifica el hábitat de un
    animal */
        protected String nombreCientífico; /* Atributo que identifica el
    nombre científico de un animal */

        public abstract String getNombreCientífico();

        public abstract String getSonido();

        public abstract String getAlimentos();

        public abstract String getHábitat();
    }
}