# Archivos y directorios con `java.io.File`

Un objeto `File` representa la ruta de un archivo o directorio. Al escribir `new File("myfile.txt")`, Java guarda una ruta relativa al directorio de trabajo. Con `new File("MyDocs", "myfile.txt")`, Java combina el directorio padre `MyDocs` con el nombre `myfile.txt`. Ambos constructores pueden representar rutas que todavía no existen.

## Consultar la ruta y los datos

- `String getPath()` devuelve la ruta del objeto, que puede ser relativa o absoluta.
- `String getAbsolutePath()` devuelve la ruta absoluta.
- `String getParent()` devuelve la parte que corresponde al directorio padre, o `null` si la ruta no incluye un padre. Por ejemplo, `getParent()` sobre `new File("myfile.txt")` devuelve `null`.
- `long lastModified()` devuelve la fecha de modificación en milisegundos desde el 1 de enero de 1970 UTC, o `0` si el archivo no existe o hay un error de E/S.
- `long length()` devuelve el tamaño de un archivo en bytes. Un archivo vacío o inexistente puede dar `0`. Para un directorio, el valor no está definido.

## Modificar archivos y trabajar con directorios

- `boolean renameTo(File destination)` intenta renombrar o mover el archivo a la ruta indicada y devuelve si lo logró.
- `boolean delete()` intenta eliminar el archivo o un directorio vacío y devuelve si lo logró.
- `boolean mkdir()` intenta crear un directorio y devuelve si lo creó. Si también faltan directorios padres, puedes usar `mkdirs()`.
- `String[] list()` devuelve los nombres de los archivos y subdirectorios. Devuelve `null` si la ruta no corresponde a un directorio o si hay un error de E/S.

## Comprobar una ruta

- `boolean exists()` indica si el archivo o directorio existe.
- `boolean canRead()` y `boolean canWrite()` indican si el programa puede leer o escribir en la ruta existente.
- `boolean isFile()` indica si la ruta corresponde a un archivo normal.
- `boolean isDirectory()` indica si la ruta corresponde a un directorio.
- `boolean isAbsolute()` indica si la ruta es absoluta.
- `boolean isHidden()` indica si el archivo está oculto según las reglas del sistema operativo.

## Ejemplo

`FileExample.java` muestra las rutas relativas y absolutas de ambos ejemplos y comprueba si existen. Si ejecutas el programa desde la raíz del proyecto, esa carpeta será el punto de partida de las dos rutas.
