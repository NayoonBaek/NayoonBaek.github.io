public class quiz {
    public static void main(String[] args) {

//1. 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다.
//   어디에서 잘못 작성된 것일까요?
        int var1=5;
        int var2=2;
        double var3=var1/var2; //double var3=(double)var1/var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);
    }
}
//var1과 var2의 데이터타입이 정수이기 때문에 var1/var2= 2가 나온다.
//따라서 실수형태타입인 double을 명시적으로 나타내주면 된다.