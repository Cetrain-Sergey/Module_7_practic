public class Main {
    public static void main(String[] args) {
        Q1 fix = new Q1(10);
        Q2 dyn = new Q2(5);
        Q3 circ = new Q3(10);
        ICharQ iQ;
        char ch;
        int i;

        iQ = fix;
        for (i=0;i<10;i++)
            iQ.put((char) ('A'+i));
        System.out.print("Содержимое фиксированной очереди: ");
        for (i=0;i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = dyn;
        for (i=0;i<10;i++)
            iQ.put((char) ('Z'-i));
        System.out.print("Содержимое динамической очереди: ");
        for (i=0;i<10;i++){
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = circ;
        for(i=0; i < 10; i++)
            iQ.put((char) ('A' + i));
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        for(i=10; i < 20; i++)
            iQ.put((char) ('A' + i));
        System.out.print("Coдepжимoe кольцевой очереди: ");
        for (i=0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nCoxpaнeниe и использование данных кольцевой очереди");

        for (i=0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);

        }
    }
}
