import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Класс сравнения времени работы методов add, get и remove для ArrayList и LinkedList
 */
public class PerformanceCheck {
    public static void main(String[] args) {
        repNumber = 100000;
        print();
    }
    private static int repNumber = 0;
    /**
     * Подсчет времени работы repNumber повторений метода add для ArrayList
     * @return время работы
     */
    private static long addTimeArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i=0;i<repNumber;++i){
            list.add(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    /**
     * Подсчет времени работы repNumber повторений метода add для LinkedList
     * @return время работы
     */
    private static long addTimeLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.nanoTime();
        for(int i=0;i<repNumber;++i){
            list.add(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    /**
     * Подсчет времени работы repNumber повторений метода get ArrayList
     * @return время работы
     */
    private static long getTimeArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<repNumber;++i){
            list.add(i);
        }
        long start = System.nanoTime();
        for(int i=0;i<repNumber;++i){
            int l = list.get(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    /**
     * Подсчет времени работы repNumber повторений метода get LinkedList
     * @return время работы
     */
    private static long getTimeLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<repNumber;++i){
            list.add(i);
        }
        long start = System.nanoTime();
        for(int i=0;i<repNumber;++i){
            int l = list.get(0);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    /**
     * Подсчет времени работы repNumber повторений метода remove ArrayList
     * @return время работы
     */
    private static long removeTimeArrayList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<repNumber;++i){
            list.add(i);
        }

        long start = System.nanoTime();
        for (int i=repNumber-1;i>=0;--i){
            list.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }
    /**
     * Подсчет времени работы repNumber повторений метода remove LinkedList
     * @return время работы
     */
    private static long removeTimeLinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0;i<repNumber;++i){
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i=repNumber-1;i>=0;--i){
            list.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    /**
     * Вывод полученных результатов в виде таблицы
     */
    private static void print(){
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("%10s %15s %15s %15s %5s %12s", "LIST TYPE   |", "ADD TIME", "GET TIME", "REMOVE TIME", "|",   "REPETITIONS");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        System.out.format("%10s %15s %15s %15s %5s %12s", "ArrayList   |", addTimeArrayList(), getTimeArrayList(), removeTimeArrayList(), "|", repNumber);

        System.out.println();
        System.out.format("%10s %15s %15s %15s %5s %12s", "LinkedList  |", addTimeLinkedList(), getTimeLinkedList(), removeTimeLinkedList(), "|", "");

        System.out.println();

        System.out.println("---------------------------------------------------------------------------------");
    }
}
