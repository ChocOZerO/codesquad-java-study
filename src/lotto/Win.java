package lotto;

public class Win {
    private Lotto win;
    private String winInput;
    private int bonus;
    
    LottoGame lottoGame = new LottoGame(1000);
    
    public Win(String winInput) {
        this.winInput = winInput;
        if ("lottery".equals(this.winInput)) this.getAutoLotto();
        else this.getWinLotto();
    }
    
    private void getAutoLotto() {
        this.win = lottoGame.generateAutoWinLotto();
        this.setBonus();
    }
    
    private void getWinLotto() {
        String[] winInputTmp = this.winInput.split(", ");
        this.win = lottoGame.generateWinLotto(winInputTmp);
        if (winInputTmp.length > 6) this.bonus = Integer.parseInt(winInputTmp[6]);
        else this.setBonus();
    }
    
    private void setBonus() {
        boolean flag = false;
        while (!flag) {
            int random = (int)(Math.random() * 45);
            if (!this.checkNums(random)) {
                this.bonus = random;
                flag = true;
            }
        }
    }
    
    private boolean checkNums(int random) {
        if (this.getWin().isContains(random)) return true;
        return false;
    }
    
    public int getBonus() {
        return this.bonus;
    }
    
    public Lotto getWin() {
        return this.win;
    }
}
