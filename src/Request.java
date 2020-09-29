public class Request extends Thread {

    public String name;//имя
    public int time;//время проживания


    public boolean populate(Request[] obj, int amount) {//проверяет есть ли место вообще
        if (obj.length > amount) {
            return true;
        } else {
            return false;
        }
    }

    public void min_sleep(Request[] obj) {
        int min = 10;
        for (int i = 0; i < obj.length; i++) {
            if (min <= obj[i].time) {
                min = obj[i].time;
            }
        }
    }

    public void run(){
        while(true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;

        }
    }


}
