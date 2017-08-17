package lotto;

import java.util.Scanner;

public class LottoMain {
    public static void main(String[] args) {
        System.out.println("구입금액을 입력해 주세요.");
        
        Scanner sc = new Scanner(System.in);
        int money = Integer.parseInt(sc.nextLine());
        LottoUser lottoUser = new LottoUser(money);
        int lottoCount = lottoUser.getLottoCount();
        lottoUser.buyLottos();
        System.out.println(lottoCount+"개를 구매했습니다.");
        lottoUser.printLottos();
        
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String winLotto = sc.nextLine();
        Win win = new Win(winLotto);
        win.getWin().printLotto();
        System.out.println(" 보너스번호 : [" + win.getBonus() + "]");
        System.out.println();
        LottoChecker lc = new LottoChecker(lottoUser, win);
        lc.matchUp();
        System.out.println("당첨 통계");
        System.out.println("-------");
        System.out.println("3개 일치 (5000원) : " + lc.getMatch3() + " 개");
        System.out.println("4개 일치 (50000원) : " + lc.getMatch4() + " 개");
        System.out.println("5개 일치 (1500000원) : " + lc.getMatch5() + " 개");
        System.out.println("5개 일치, 보너스 볼 일치 (30000000원) : " + lc.getMatch5() + " 개");
        System.out.println("6개 일치 (2000000000원) : " + lc.getMatch6() + " 개");
        Rewards rewards = new Rewards(lc.getMatch3(), lc.getMatch4(), lc.getMatch5(), lc.getMatch6());
        System.out.println("총 수익률은 " + rewards.getRefundRate(money) + "% 입니다.");
        
        sc.close();
    }
    
}
