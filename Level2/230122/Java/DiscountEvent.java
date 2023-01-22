import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> discountProducts = new HashMap<>();
        Map<String, Integer> wantProducts = new HashMap<>();

        for (int i = 0; i < want.length; i += 1) {
            wantProducts.put(want[i], number[i]);
        }

        for(int i = 0; i < 10; i += 1) {
            discountProducts.put(discount[i],
                discountProducts.getOrDefault(discount[i], 0) + 1);
        }

        if(isBuy(wantProducts, discountProducts)) {
            answer += 1;
        }

        for (int i = 1; i <= discount.length - 10; i += 1) {
            discountProducts.put(discount[i - 1],
                discountProducts.get(discount[i - 1]) - 1);

            discountProducts.put(discount[i + 9],
                discountProducts.getOrDefault(discount[i + 9], 0) + 1);

            if(isBuy(wantProducts, discountProducts)) {
                answer += 1;
            }
        }

        return answer;
    }

    private boolean isBuy(Map<String, Integer> wantProducts, Map<String, Integer> discountProducts) {
        for(String product : wantProducts.keySet()) {
            if(!discountProducts.containsKey(product) ||
                wantProducts.get(product) != discountProducts.get(product)) {
                return false;
            }
        }

        return true;
    }
}


/*
static Map<String, Integer> products;
    static Map<String, Integer> wantProducts;

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        productInit(want, number, discount, 0, 10);

        for(int i = 10; i <= discount.length; i += 1) {
            for(int j = 0; j < want.length; j += 1) {
                if (products.containsKey(want[j]) && products.get(want[j]) >= number[j]) {
                    products.replace(want[j], 0);

                    wantProducts.replace(want[j], 0);

                    if(wantProducts.values().stream().allMatch(value -> value == 0)) {
                        answer += 1;

                        productInit(want, number, discount, i - 10, i);
                        break;
                    }
                }
            }

            if(i == discount.length) {
                break;
            }

            products.replace(discount[i - 10], products.get(discount[i - 10]) - 1);
            products.put(discount[i], products.getOrDefault(discount[i], 0) + 1);
        }

        return answer;
    }

    private void productInit(String[] want, int[] number, String[] discount, int startDay, int endDay) {
        products= new HashMap<>();
        wantProducts = new HashMap<>();

        for(int i = startDay; i < endDay; i += 1) {
            products.put(discount[i], products.getOrDefault(discount[i], 0) + 1);
        }

        for(int i = 0; i < want.length; i += 1) {
            wantProducts.put(want[i], number[i]);
        }
    }
 */