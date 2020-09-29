public class Hotel {

    private int amount;
    private Request[] requests;

    Hotel (int amount){
        this.amount = amount;
        this.requests = new Request[amount];//список проживаюших людей

    }

    public boolean accept_req(Request request){//метод поселения либо возвр false если нет мест
        for(int i =0; i < requests.length; i++){
            if(requests[i] == null ){
                requests[i] = request;
                return true;
            }
        }
        return false;
    }


}
