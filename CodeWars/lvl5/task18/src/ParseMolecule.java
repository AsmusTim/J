import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class ParseMolecule {

    public static Map<String,Integer> getAtoms(String formula) {
        char[] chr = formula.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < chr.length; ++i){
            if(chr[i] == '('){
                stack.add('(');
            }
            else if(chr[i] == '['){
                stack.add('[');
            }
            else if(chr[i] == ')'){
                if(stack.isEmpty() || stack.peek() == '[') throw new IllegalArgumentException();
                else stack.pop();
            }
            else if(chr[i] == ']'){
                if(stack.isEmpty() || stack.peek() == '(') throw new IllegalArgumentException();
                else stack.pop();
            }


        }

        return map;
    }
}