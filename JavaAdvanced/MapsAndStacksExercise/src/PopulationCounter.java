import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by Lenovo on 30.1.2017 г..
 */
public class PopulationCounter {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String,LinkedHashMap<String,Long>> data = new LinkedHashMap<>();
        LinkedHashMap<String,Long> countries = new LinkedHashMap<>();


        String input="";

        while (!"report".equals(input=reader.readLine())){
            String[] splitInput = input.split("\\|");

            String city=splitInput[0];
            String country=splitInput[1];
            long population= Long.parseLong(splitInput[2]);



            if (!data.containsKey(country)){
                countries.put(country,0L);


                LinkedHashMap<String,Long> enterData= new LinkedHashMap<>();

                data.put(country,enterData);

                countries.put(country,0L);
            }


            if (data.get(country).containsKey(city)){

                data.get(country).put(city,data.get(country).get(city)+population);

            }else {

                data.get(country).put(city, population);
            }

            countries.put(country, countries.get(country)+population);
        }


        countries.entrySet().stream()
                .sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).forEach(pair->{
            System.out.println(pair.getKey()+" (total population: "+pair.getValue()+")");
            data.get(pair.getKey()).entrySet().stream().sorted((p1,p2)->p2.getValue().compareTo(p1.getValue())).forEach(pairSet->{
                System.out.println("=>"+pairSet.getKey()+": "+ pairSet.getValue());
            });
        });
    }
}
