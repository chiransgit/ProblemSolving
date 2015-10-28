
class T1 {
        public void write(T1 e) {
                System.out.println("T1/2");
                e.write();
        }
        protected void write() {
                System.out.println( "T1" );
        }
        protected void print(String s) {
                System.out.println(s);
        }
}

class T2 extends T1 {
        public void write(T2 e) {
                System.out.println("T2/2");
                e.write();
        }
        public void write(T1 e) {
           System.out.println("T2/2");
           e.write();
        }
        protected void write() {
                System.out.println("T2");
        }
}

public class Example {  
        public static void main(String[] args) {
                T1 t1 = new T1();
                T2 t2 = new T2();
                T1 t12 = new T2();

                /*t1.write(t1);                           // T1/2 T1
                t1.write(t2);                           // T1/2 T2
                t1.write(t12);                          // T1/2 T2

                t2.write(t1);                           // T1/2 T1
                t2.write(t2);                           // T2/2 T2
                t2.write(t12);                          // T1/2 T2
                t2.write((T2)t12 );             // T2/2 T2

                t12.write(t1); */                         // T1/2 T1
                t12.write(t2);                          // T1/2 T2
                System.out.println(t2 instanceof T1);
                ((T2)t12).write(t2);
               /* ((T2)t12).write(t2);            // T2/2 T2
                t12.write(t12);                         // T1/2 T2
                ((T2)t12).write((T2)t12);   */    // T2/2 T2
        }
}