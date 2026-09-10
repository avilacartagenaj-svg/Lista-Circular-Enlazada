public class MiListaCircular implements ListInterface {
    Node cabeza = null;

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    @Override
    public int getSize() {
        if (cabeza == null) {
            return 0;
        }

        int contador = 0;
        Node actual = cabeza;

        do {
            contador++;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return contador;
    }

    @Override
    public void clear() {
        cabeza = null;
    }

    @Override
    public Object getHead() {
        if (cabeza == null) {
            return null;
        }
        return cabeza.dato;
    }

    @Override
    public Object getTail() {
        return null;
    }

    @Override
    public Object get(Node node) {
        return null;
    }

    @Override
    public Node search(Object object) {
        return null;
    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean insert(Node node, Object object) {
        return false;
    }

    @Override
    public boolean insert(Object objectRef, Object object) {
        return false;
    }

    @Override
    public boolean insertHead(Object object) {
        return false;
    }

    @Override
    public boolean insertTail(Object object) {
        return false;
    }

    @Override
    public boolean set(Node node, Object object) {
        return false;
    }

    @Override
    public boolean remove(Node node) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] object) {
        return new Object[0];
    }

    @Override
    public MiListaCircular subList(Node from, Node to) {
        return null;
    }

    @Override
    public MiListaCircular sortList() {
        return null;
    }
}
