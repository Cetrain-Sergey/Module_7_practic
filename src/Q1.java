class Q1 implements ICharQ {

    //очередь фиксированного размера

    private char q[];
    private int putloc, getloc;

    public Q1 (int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch){
        if (putloc==q.length-1){
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
