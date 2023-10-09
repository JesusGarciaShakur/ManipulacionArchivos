import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivo(String name) {
        File archivo; // Apunta a un archivo físico de dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. archivo
        String linea;

        try {
            // Crear un apuntador al archivo físico
            archivo = new File("C:\\archivos\\" + name + ".txt");

            // Abrir el archivo para lectura
            reader = new FileReader(archivo);

            // Configurar el bufer para leer los datos del archivo
            bufer = new BufferedReader(reader);
            // Lectura del contenido del archivo
            while ((linea = bufer.readLine()) != null) {
                System.out.println("Linea leída " + linea);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        System.out.println("Lectura de un archivo de texto");
        System.out.println("Escriba el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivo(fileName);
    }
}