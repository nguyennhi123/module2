import java.util.Random;

public class StopWatch {
    long startTime, endTime;
    private long getStartTime(){
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }
    private long getEndTime(){
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
    private long getElapsedtime(){
        return (this.endTime - this.startTime);
        }

    public static void main(String[] args) {
        int[]arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt();
        }
        StopWatch watch = new StopWatch();
        watch.getStartTime();
        int tem;
        for (int i = 0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
        watch.getEndTime();
       long time = watch.getElapsedtime();
        System.out.println("time is " + time);
    }
}
