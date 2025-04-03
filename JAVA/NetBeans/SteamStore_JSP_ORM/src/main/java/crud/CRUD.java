package crud;

import java.sql.SQLException;
import java.util.ArrayList;

/** CRUD
 * Interfaz que contiene los métodos necesarios para
 * obtener y modificar información de videojuegos en la base de datos
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
    public T requestById(int id) throws SQLException;

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
    public boolean delete(int id) throws SQLException;
    
    /** requestFavouriteGames
     * Obtiene todos los registros marcados como favoritos de un modelo de la base de datos
     * @param userId identificador del usuario cuyos favoritos queremos recuperar
     * @return una lista con los registros encontrados
     * @throws SQLException
     */
    public ArrayList<T> requestFavouriteGames(int userId) throws SQLException;
    
     /** addFavourite
     * Añade un registro en la tabla favoritos dada su clave primaria compuesta
     * @param userId identificador de un usuario
     * @param gameId identificador de un objeto del tipo genérico T
     * @return valor booleano indicando si la operación tuvo éxito o no
     * @throws SQLException
     */
    public boolean addFavouriteGame(int userId, int gameId) throws SQLException;
    
     /** delete
     * Elimina un registro en la tabla favoritos dada su clave primaria compuesta
     * @param userId identificador de un usuario
     * @param gameId identificador de un objeto del tipo genérico T
     * @return valor booleano indicando si la operación tuvo éxito o no
     * @throws SQLException
     */
    public boolean removeFavouriteGame(int userId, int gameId) throws SQLException;
}