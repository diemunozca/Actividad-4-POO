
package Animales;


public abstract class Canino extends Animales.Animal {


    public class Perro extends Canino {
        public String getSonido() {
            return "Ladrido";
        }
        /**
         * Método que devuelve un String con los alimentos de un perro
         * @return Un valor String con la alimentación de un perro: “Carnívoro”
         */
        public String getAlimentos() {
            return "Carnívoro";
        }
        /**
         * Método que devuelve un String con el hábitat de un perro
         * @return Un valor String con el hábitat de un perro: “Doméstico”
         */
        public String getHábitat() {
            return "Doméstico";
        }
        /**
         * Método que devuelve un String con el nombre científico de un perro
         * @return Un valor String con el nombre científico de un perro:
         * “Canis lupus familiaris”
         */
        public String getNombreCientífico() {
            return "Canis lupus familiaris" ;
        }
    }
}
