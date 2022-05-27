public class Vertex<v> {
    private V data;
    private Map<Vertex<V>,Double> adjacentVertices;
    public void addadjacentVertex(Vertex<V> destination , double weigth)
    {
        adjacentVertices.put(destination,weigth);
    }
}
