package slpinterpreter;

public class Table {
    public String id;
    public int value;
    public Table tail;

    public Table(String i, int v, Table t) {
        id=i;
        value=v;
        tail=t;
    }

    public int lookUp(String key){
        if (id.equals(key)){
            return value;
        }
        else{
            return tail.lookUp(key);
        }
    }
}
