package loops_and_stream_collection;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class loops_and_stream_collection {

    public static void main(String[] args) {
        List<String> myuse1 = Arrays.asList("sachin","solomon","aswin");
        
        List<Integer> myuse = Arrays.asList(1,2,3,4,5,6);//add more data in a single line code

        List Map=myuse.stream().map(X -> X*X*X).collect(Collectors.toList()); //mapping
        List Filter=myuse.stream().filter(x -> x%2==0).collect(Collectors.toList()); //filter
        List Sort = myuse.stream().sorted().collect(Collectors.toList()); //sort
        myuse1.stream().filter(x->x.startsWith("a")).forEach(System.out::println); // loop method 1
        List loop = myuse1.stream().filter(x -> x.startsWith("s")).collect(Collectors.toList()); //loop method 2

        System.out.println(loop);

        System.out.println(Map);
        System.out.println(Filter);
        System.out.println(Sort);

    }
    
}
