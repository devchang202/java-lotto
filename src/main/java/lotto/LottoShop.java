package lotto;

import lotto.domain.AutoGenerateStrategy;
import lotto.domain.LottoMachine;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.List;

public class LottoShop {
    public static void main(String[] args) {
        int money = InputView.inputMoney();
        LottoMachine lottoMachine = new LottoMachine(money, new AutoGenerateStrategy());
        ResultView.printBuyableLottoNum(lottoMachine);
        ResultView.printGeneratedLottos(lottoMachine);

        List<Integer> winningNums = InputView.inputWinningNums();
        int bonusNum = InputView.inputBonusNum();
        ResultView.printLottoPrize(lottoMachine.getWinningResult(winningNums, bonusNum));
        ResultView.printLottoYield(lottoMachine, winningNums, bonusNum);
    }
}
