public class Lesson2_1 {

        public static void main(String[] args) {
            //Некоторые тесты для проверки задач.
            System.out.println(sum(100, 200));
            System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
            System.out.println(max(56, 349));
            System.out.println(average(new int[]{0, -2, 3, -1, 16}));
            System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
            System.out.println(calculateHypotenuse(3,4));
        }

        /**
         * 1. Метод должен вернуть сумму двух чисел a и b
         * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
         **/
        public static int sum(int a, int b) {
            int summa =a+b;
            if(summa>Integer.MAX_VALUE){

                return -1;
            }
            else if(summa<Integer.MAX_VALUE){


            }
            return summa;
        }

        /**
         *
         * Метод должен вернуть максимальное значение из двух чисел
         *
         * <p>
         * Example1:
         * a = 4,
         * b = 5
         * <p>
         * Метод должен вернуть 5
         * Example2:
         * a = 10,
         * b = 10
         * <p>
         * Метод должен вернуть 10
         */
        public static int max(int c, int d) {
            if(c>d) return c;
            else {
                return d;
            }
        }

        /**
         * Метод должен вернуть среднее значение из массива чисел
         * (необходимо сумму всех элеменов массива разделить на длину массива)
         * <p>
         * Example:
         * array = {1,2,3,4,5}
         * Метод должен return 3.0
         */
        public static double average(int[] array) {
            int sum =0;


            for (int i = 0; i < array.length; i++) {
                int x =array[i];
                sum=+x;

            }double ave=sum/ array.length;
            return ave;
        }

        /**
         * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
         **/
        public static int max(int[] array) {
            int x =array[0];
            for (int i =0;i < array.length; i++){
                if(x<array[i]) x=array[i];
            }
            return x;


        }

        /**
         * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
         *
         * Example1:
         * 3
         * 4
         * return 5
         * <p>
         * Example2:
         * 12
         * 16
         * return 20
         */
        public static double calculateHypotenuse(int a, int b) {
            int n =a*a+b*b;
            double x = Math.sqrt(n);
            return x;
        }
    }



