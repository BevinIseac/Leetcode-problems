class Solution {
    public boolean lemonadeChange(int[] bills) {
    if (bills[0] > 5) return false;

    int ten = 0, five = 0;

    for (int i = 0; i < bills.length; i++) {
        int curr = bills[i];
        if (curr == 5) {
            five++;
        } else if (curr == 10) {
            if (five <= 0) return false;
            five--;
            ten++;
        } else {
            if (ten > 0 && five > 0) {
                five--;
                ten--;
            }else if (five > 2) {
                five-=3;
            } else {
                return false;
            }
        }
    }
    return true;
    }
}