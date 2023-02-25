
public interface MyIntegerList {
    /**
     * Добаить элементв в список.
     * @param value значение
     */
    void add(Integer value);

    /**
     * Вернуть значение по индексу
     * @return значение
     */
    Integer get(int index);

    /**
     * Найти элемент по значению
     * @param value значение
     * @return порядковый номер элемента
     */
    int find(Integer value);

    /**
     * вернуть сортированную копию списка
     *
     * @return сортированный список
     */

    MyArrayIntegerList sort();

    /**
     * Добаить элементв в начало списока.
     * @param value значение
     */
    void addFirst(Integer value);

    /**
     * Добаить элементв в начало списока.
     * @param value значение
     */
    void addLast(Integer value);

    /**
     * Удалить элемент
     * @param index индекс элемета
     * @return значение
     */
    Integer remove(int index);

    /**
     * Вывести элменты массива
     */
    void print();


}
