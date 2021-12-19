import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class most_active_cookie {
    static String cookie;
    static String timestamp;
    static String searchDate;
    static String timestampDate;
    static int counter;
    static String timeZone;
    static HashMap<String, Integer> active_cookie_form;
    public static void main(String[] args){
        try{
            //I think there should be 3 args right now, file, -d, and searchdate
            // Scanner inFile = new Scanner(new FileReader("cookie_log.csv"));
            // searchDate="2018-12-09";
            Scanner inFile = new Scanner(new FileReader(args[0]));
            timeZone = args[1];//here is wating for the '-d'.
            searchDate=args[2];//this is the date


            active_cookie_form = new HashMap<>();

            while(inFile.hasNext()){
                String oneLine = inFile.next();
                /*
                if can't use split,
                then use a self implement method is Ok
                      public static String[] seperateByComma(String s){
                          String[]result = new String[2];
                          int counter =0;
                          for(int i=0; i<s.length(); i++){
                              if(s.charAt(i)==',') {
                                  break;
                              }
                          counter++;
                          }
                          //System.out.println(counter);

                          result[0]=s.substring(0, counter);
                          result[1]=s.substring(counter+1, s.length());
                          //System.out.println(result[0]);
                          //System.out.println(result[1]);
                          return result;

                          }

                }
                 */
                cookie = oneLine.split("\\,")[0];
                timestamp=oneLine.split("\\,")[1];
                /*
                This one is same as the previous method,
                you can seperate by the characther "T", because there has been seperate by comma, T is the only letter
                public static String[] seperateByT(String s){
                    String[]result = new String[2];
                    int counterT = 0;
                    for(int i=0; i<s.length(); i++){
                        if(s.charAt(i)=='T'){
                            break;
                        }
                    counterT++;
                    }
                   //System.out.println(counterT);
                   result[0]=s.substring(0, counterT);
                   result[1]=s.substring(counterT+1, s.length());
                   // System.out.println(result[0]);
                  // System.out.println(result[1]);
                  return result;
                 }
                */
                timestampDate = timestamp.split("T")[0];
                //System.out.println(timestampDate);
                /*
                for the .equals
                can use
                public static boolean eq(String one, String two){
                    if(one.length()!=two.length()){
                        return false;
                    }
                    for(int i=0; i<one.length(); i++){
                        if(one.charAt(i)!=two.charAt(i)){
                            return false;
                        }
                    }
                    return true;
                 }


                 */
                if(timestampDate.equals(searchDate)){
                    active_cookie_form.put(cookie, active_cookie_form.getOrDefault(cookie,0)+1);

                }

                /*
                if I can't use getOrDefault
                then 1. check if the map contains key cookie, if not, put the key cookie and value 1 into the map
                     2. if yes, getValue and update 1
                     if(active_cookie_form.contains(cookie)){
                         active_cookie_form.put(cookie, active_cookie_form.get(cookie)+1);
                     }
                     else{
                         active_cookie_form.put(cookie, 1);
                     }
                 */


            }
            inFile.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }


        //find the largest value in the map, means find the most frequency
        int max =0;
        for(Map.Entry<String, Integer> entry: active_cookie_form.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
            }
        }

        //output the key of the most frequency, find out the most active cookie
        //if need to return a result, can use a structor to return, linked list, map, or string is ok too.
        for (Map.Entry<String,Integer> entry:active_cookie_form.entrySet()){
            if(entry.getValue()==max){
                System.out.println(entry.getKey());
            }
        }
    }
}

