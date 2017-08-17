package lotto;

public class Win {
    private Lotto win;
    private String winInput;
    
    LottoGame lottoGame = new LottoGame(1000);
    
    public Win(String winInput) {
        this.winInput = winInput;
        if ("lottery".equals(this.winInput)) this.getAutoLotto();
        else this.getWinLotto();
    }
    
    private void getAutoLotto() {
        this.win = lottoGame.generateAutoWinLotto();
    }
    
    private void getWinLotto() {
        String[] winInputTmp = this.winInput.split(", ");
        this.win = lottoGame.generateWinLotto(winInputTmp);
    }
    
    public Lotto getWin() {
        return this.win;
    }
}
