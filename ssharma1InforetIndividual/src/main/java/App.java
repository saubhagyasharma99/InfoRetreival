/*
 * An entry point to the entire program with the 'main()' method.
 */

public class App {
    public static void main (String[] args) throws Exception {
        Indexer indexer = new Indexer();
        Searcher searcher = new Searcher();

        indexer.indexMethod();
        searcher.searchMethod();
    }
}
