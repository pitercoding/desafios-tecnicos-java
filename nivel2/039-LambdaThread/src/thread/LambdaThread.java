package thread;

public class LambdaThread {
    public static void main(String[] args) {
    Runnable tarefa = () -> System.out.println("Executando a tarefa em uma nova thread!");

    Thread thread = new Thread(tarefa);
    thread.start();

    System.out.println("Thread principal continua executando...");
    }

}
