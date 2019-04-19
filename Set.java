public class Set <T> {
    private T [] list;
    private int size;

    //default constructor
    public Set() {
        T = new Object[100];
        size = 100;
    }

    public void insert(T item){
        boolean found = false;
        for (int i =0; i<size;i++){
            if(list[i].compareTo(item) == 0){
                found = true;
            }
        }

        if (!found){
            if(list.length == size){ // run out of space
                Object [] temp = new Object[size*2];
                for (int j=0; j<size;j++){
                    temp[j] = list[j];
                }
                size *= 2;
                list = temp;
            }
            list[size] = item;
            size++;
        }
    }

    public void remove(T item){
        Object temp[] = new Object[size];
        int index = 0;
        for (int i = 0;i<size;i++){
            if(list[i].compareTo(item) != 0){
                temp[index++] = list[i];
            }
            list = temp;
            size = index;
        }
    }
}