package advanced;

public class SimpleAddition {

    class Add {

        public void add(int... ints){
            String out = "";
            out += ints[0];

            int answer = ints[0];

            for(int i = 1; i < ints.length; ++i){
                out += "+" + ints[i];
                answer += ints[i];
            }

            out += "=" + answer;


            System.out.println(out);

        }

    }

}
