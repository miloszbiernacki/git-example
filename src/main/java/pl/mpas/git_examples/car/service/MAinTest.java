package pl.mpas.git_examples.car.service;

public class MAinTest {
    public static void main(String[] args) {
        LambdaConverter my = new LambdaConverter() {
            @Override
            public int ConvertStringToInt(String string) {
                return string.length();
            }
        };
        LambdaConverter my2 = one ->one.length();

        Lambda addition = (a,b) ->a+b;
        Lambda substrapt = (a,b) ->a-b;
        Lambda multiply = (a,b) ->a*b;
    }
}
