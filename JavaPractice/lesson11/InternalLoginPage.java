package lesson11;

public class InternalLoginPage extends  LoginPage{

    @Override
    protected String userNameSel() {
        return "InternalLoginPage + usernameSel";
    }

    @Override
    protected String passWordSel() {
        return "InternalLoginPage + passWordSel";
    }

    @Override
    protected String loginBtnSel() {
        return "InternalLoginPage + loginBtnSel";
    }
}
