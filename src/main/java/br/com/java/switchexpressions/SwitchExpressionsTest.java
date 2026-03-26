package br.com.java.switchexpressions;

enum Types {UM,DOIS,TRES}
public class SwitchExpressionsTest {
    public static void main(String[] args) {
        expressionSwitch();
        expressionSwitch2();
        expressionSwitch3();
        expressionSwitch4();

    }

    private static void expressionSwitch4() {
        Types types = Types.UM;
        String message = switch (types){
            case UM : yield "workday";
            case DOIS : yield "weekend";
            default : yield "invalid day";
        };
        System.out.println("Day: "+ message + " day: "+types);
    }

    //Pattern Matching
    private static void expressionSwitch3() {
        Object day = "6";
        String message = switch (day){
            case Integer i -> day + " is integer";
            case String s -> day + " is string";
            default -> day + " unknown type.";
        };
        System.out.println(message);
    }

    private static void expressionSwitch2() {
        int day = 6;
        String message = switch (day){
            case 1,2,3,4,5 : yield "workday";
            case 6,7 : yield "weekend";
            default : yield "invalid day";
        };
        System.out.println("Day: "+ message + " day: "+day);
    }

    private static void expressionSwitch() {
        int day = 1;
        String message = switch (day){
            case 1,2,3,4,5 -> {
                System.out.println("Hello");
                yield "workday";
            }
            case 6,7 -> "weekend";
            default -> "invalid day";
        };
        System.out.println("Day: "+ message + " day: "+day);
    }
}
