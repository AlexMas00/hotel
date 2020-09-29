class PrimeThread extends Thread {

    PrimeThread(Hotel hotel) {
    }



    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("nedn");
        }

    }
}