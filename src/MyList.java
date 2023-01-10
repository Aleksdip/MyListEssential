import java.util.ArrayList;

public class MyList <T> {

    ArrayList myList;

    public MyList() {
        this.myList = new ArrayList<>();
    }
    public MyList(int count)
    {
        this.myList = new ArrayList(count);
    }
    public void add(T item)
    {
        myList.add(item);
    }
    public void getIndexValue (int index) {
        System.out.println("Значення " + index + " елементу = " + myList.get(index));
    }
    public void size () {
        System.out.println("Кількість елементів = " + myList.size());
    }



}

