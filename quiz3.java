public class quiz3 {
    public static void main(String[] args) {
//3. while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
        int sum = 0;
        while (sum != 5){

            int nun1 = (int)(Math.random()*6) + 1;
            int nun2 = (int)(Math.random()*6) + 1;

            System.out.println("("+ nun1 + ", " + nun2 + ")");
            sum = nun1+nun2;
        }
    }
}
//Math.random() : 0이상 1미만의  부동소수점 의사 난수를 반환
//int() : 소수점 버리고 정수만 취함.

//0<= Math.random() <1
//0<= Math.random()*6 <6
//1<= Math.random()*6+1 <7
//1<= (int)(Math.random()*6+1) <7 의 정수 즉, [1,2,3,4,5,6]의 값이 나온다.
//두 눈의 합이 5가 아니면(nun1, nun2)출력 반복
