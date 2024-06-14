import java.util.Hashtable;

    public static void main(String[] args) {
        Hashtable<String, String> tabla = new Hashtable<>();
        tabla.put("Clave1", "Valor1");
        System.out.println(tabla.get("Clave1"));
    }
