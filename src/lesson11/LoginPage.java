package lesson11;

public abstract class LoginPage {
    public void login(){
        System.out.println("Username sel : " + userNameSel());
        System.out.println("Password sel : " + passWordSel());
        System.out.println("Login Btn sel : " + loginBtnSel());

    }
    protected abstract String userNameSel();
    protected abstract String passWordSel();
    protected abstract String loginBtnSel();

}
