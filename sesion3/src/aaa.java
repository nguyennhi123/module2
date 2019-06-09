
    class A {
        protected void msg() {
            System.out.println("Hello java");
        }
    }

    public class Simple extends A {
        public Simple() {
        }

        void msg() {
            System.out.println("Hello java");
        }
        /*Compile Time Error*/

        public static void main(String args[]) {
            Simple obj = new Simple();
            obj.msg();
        }
    }

