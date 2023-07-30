// 원래 이용료 price
// n번째 이용할때 마다 이용료 x n(count)
// -> 100원 이용료 1번째 100원 2번째 200원 3번째 300원 (총 100 + 200 + 300 = 600)
// 자신이 갖고있는 금액에서 놀이기구 비용이 얼마가 모자라는지 구하기

public class InsufficientAmount {
  public long solution2(int price, int money, int count) {

    long totalMoney = 0;

    for (int i = 1; i < count + 1; i += 1) {
      totalMoney += price * i;
    }

    return totalMoney > money ? totalMoney - money : 0;
  }
}

  public long solution1(int price, int money, int count) {
    long totalPrice = 0;
    int addMoney = 1;
    int basicPrice = price;

    while (addMoney != count + 1) {
      price *= addMoney;
      totalPrice += price;
      price = basicPrice;
      addMoney += 1;
    }

    if (money > totalPrice) {
      return 0;
    }

    return totalPrice - money;
  }
