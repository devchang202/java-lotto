package lotto.domain;

import java.util.List;
import java.util.Objects;

public class WinningResult {
    private final List<Integer> winningResult;

    WinningResult(List<Integer> winningResult) {
        this.winningResult = winningResult;
    }

    public int getTotalPrizeMoney() {
        int total = 0;

        total += Prize.PRIZE_1ST.earnedMoney(winningResult.get(Prize.PRIZE_1ST.index()));
        total += Prize.PRIZE_2ND.earnedMoney(winningResult.get(Prize.PRIZE_2ND.index()));
        total += Prize.PRIZE_3RD.earnedMoney(winningResult.get(Prize.PRIZE_3RD.index()));
        total += Prize.PRIZE_4TH.earnedMoney(winningResult.get(Prize.PRIZE_4TH.index()));

        return total;
    }

    public List<Integer> getWinningResult() {
        return winningResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WinningResult that = (WinningResult) o;
        return Objects.equals(winningResult, that.winningResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(winningResult);
    }
}
