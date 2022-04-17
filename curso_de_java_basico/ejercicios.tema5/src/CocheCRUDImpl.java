/**
 * Clase que implementa los métodos de la interfáz CocheCRUD
 */
public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("save method");
    }

    @Override
    public void findAll() {
        System.out.println("findAll method");
    }

    @Override
    public void delete() {
        System.out.println("delete method");
    }
}
