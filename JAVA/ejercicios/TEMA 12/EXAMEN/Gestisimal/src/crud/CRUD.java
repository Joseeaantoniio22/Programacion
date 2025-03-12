package crud;

import java.sql.SQLException;
import java.util.ArrayList;

/** CRUD
 * Interfaz que contiene los métodos necesarios para obtener y modificar
 * información de objetos de tipo genérico T en la base de datos
 */
public interface CRUD<T> {

    /** requestAll
     * Obtiene todos los registros de un modelo de la base de datos
     * @param sortedBy columna(s) por la(s) que se ordenará la consulta; 
     * Esta cadena también puede incluir una dirección de ordenación (ASC, DESC)
     * @return una lista con los registros encontrados
     * @throws SQLException
     */
    public ArrayList<T> requestAll(String sortedBy) throws SQLException;

    /** requestById
     * Obtiene un registro del modelo dado su clave primaria
     * @param id identificador de un objeto del tipo genérico T
     * @return una instancia del tipo genérico T
     * @throws SQLException
     */
    public T requestById(long id) throws SQLException;

    /** create
     * Crear un registro en la base de datos para el modelo en cuestión
     * @param model una instancia del tipo genérico T
     * @return valor booleano indicando si la operación tuvo éxito o no
     * @throws SQLException
     */
    public boolean create(T model) throws SQLException;

    /** update
     * Actualiza la información de un registro de la base de datos
     * para el modelo en cuestión
     * @param model una instancia del tipo genérico T
     * @return valor booleano indicando si la operación tuvo éxito o no
     * @throws SQLException
     */
    public boolean update(T model) throws SQLException;

    /** delete
     * Elimina un registro del modelo dada su clave primaria
     * @param id identificador de un objeto del tipo genérico T
     * @return valor booleano indicando si la operación tuvo éxito o no
     * @throws SQLException
     */
    public boolean delete(long id) throws SQLException;

    /** 
    * Serializa los datos de una entrada del diccionario en una cadena: palabraInglés;significadoEspañol1;significadoEspañol2 
    * @param palabraInglés Palabra en inglés
    * @param significados Lista con las acepciones en castellano asociadas a la palabra inglesa
    * @return Cadena de caracteres conteniendo todos los datos de esa entrada del diccionario
    */
    public String serializar(String palabraInglés, ArrayList<String> significados);

    /** 
    * Deserializa los datos de una entrada del diccionario devolviendo un array de cadenas 
    * @param líneaFichero Datos en el fichero de una entrada del diccionario
    * @return Array de Strings con la palabra en inglés en primera posición seguida de los significados en español
    */
    public String[] deserializar(String líneaFichero);

    /**
   * Añade datos al diccionario desde un fichero
   * @param nombreFichero
   * @return Verdadero si la importación se realizó con éxito
   */
    public boolean importar(String nombreFichero);

    /**
   * Exporta los datos actuales del diccionario a un fichero
   * @param nombreFichero
   * @return Verdadero si la exportación se realizó con éxito
   */
    public boolean exportar(String nombreFichero);
}